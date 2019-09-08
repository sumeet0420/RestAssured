package com.restassured.learning.tests;
import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.Test;

import com.restassured.learning.utilities.SupportUtilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OrchesrationCreateDeleteTest extends BaseTest{

	@Test(description = "Checking the flow")
	public void main() throws IOException {
		Response response = given()
		   .body(SupportUtilities.fileToString("./src/test/resources/createuser.txt"))
		   .when()
		   .post("/api/user");
		response.then().assertThat().statusCode(201);
		JsonPath json = SupportUtilities.parseJson(response);
		String id = json.get("id");
		System.out.println(id);
	}
}