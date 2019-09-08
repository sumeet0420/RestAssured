package com.restassured.learning.datadriventesting;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.restassured.learning.tests.BaseTest;
import com.restassured.learning.utilities.SupportUtilities;

public class CreateUsersTest extends BaseTest{

	@DataProvider(name="users")
	public String[][] users(){
		 String[][] userarray={{"user1","job1"},{"user2","job2"}};
		 return userarray;
	}
	
	@Test(dataProvider = "users")
	public void createUsersDDT(String user, String job) throws JsonProcessingException {
		String body = SupportUtilities.createUserJson(user, job);
		given().body(body)
		   .when()
		   .post("/api/user")
		   .then().assertThat().statusCode(201);
	System.out.println("Test Pased.");
	}
}