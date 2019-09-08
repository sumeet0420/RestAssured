package com.restassured.learning.tests;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class StatusCodeTest extends BaseTest{

	@Test(description = "Verify status code")
	public void smokeTest() {
		given()
		.param("page", "2")
		.when().get("/api/users")
		.then().assertThat().statusCode(200);
	}
}