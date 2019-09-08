package com.restassured.learning.tests;

import static io.restassured.RestAssured.given;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ContentTypeTest extends BaseTest{
	@Test(description = "Get Users and verify Content Type as JSON")
	public void getUsers() {
		Logger log = LogManager.getLogger(ContentTypeTest.class.getName());
		log.info("Running Content Type Test");
			given().param("page","2")
				   .when().get("/api/users")
				   .then().assertThat().contentType(ContentType.JSON);
		log.info("Running Content Type Completed.");
	}
}