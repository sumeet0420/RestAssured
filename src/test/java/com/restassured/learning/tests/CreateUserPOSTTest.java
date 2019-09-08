package com.restassured.learning.tests;
import static io.restassured.RestAssured.given;
import static org.apache.commons.io.FileUtils.readFileToString;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.restassured.learning.pom.User;
import com.restassured.learning.utilities.SupportUtilities;

public class CreateUserPOSTTest extends BaseTest{

	@Test(description = "Verify User is created through POST method")
	public void createUser() throws FileNotFoundException, IOException {
		
		given().body(new File("./src/test/resources/createuser.txt"))
			   .when()
			   .post("/api/user")
			   .then().assertThat().statusCode(201);
		System.out.println("Test Pased.");
		
		String postBody = readFileToString(new File("./src/test/resources/createuser.txt"),"UTF8");
		given().body(postBody)
			   .when()
			   .post("/api/user")
			   .then().assertThat().statusCode(201);
		System.out.println("Test 2 Pased.");
		
		given().body(SupportUtilities.createUserJson(new User("SA","Job")))
		   .when()
		   .post("/api/user")
		   .then().assertThat().statusCode(201);
	System.out.println("Test 3 Pased.");
	}
}