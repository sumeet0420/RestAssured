package com.restassured.learning.tests;
import static io.restassured.RestAssured.given;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.restassured.learning.utilities.SupportUtilities;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetAllUsersTest {

	@Test(description = "Getting all the users")
	public void getAllUsers() {
		Logger log = LogManager.getLogger(GetAllUsersTest.class.getName());
		log.info("Running Get All Users Test");
		RestAssured.baseURI = "https://reqres.in";
		Response response = given().param("page", "2")
			   .log().all()
			   .when()
			   .get("/api/users")
			   .then().extract().response();
		JsonPath json = SupportUtilities.parseJson(response);
		
		int no_of_users = json.get("data.first_name.size()");
		log.info("Number of users: "+no_of_users);
		List<String> firstNameList = json.getList("data.first_name");
		firstNameList.forEach(log::info);
	}
}
