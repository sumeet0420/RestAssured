package com.restassured.learning.tests;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class ResponseTest extends BaseTest{
	
	@Test(description = "Validate Response grom GET method.")
	public void validateResponse() {
			given()
				   .when().get("/api/users/2")
				   .then().assertThat().statusCode(200)
				   .and().assertThat().body("data.id", equalTo(2))
				   .and().assertThat().body("data.email", equalTo("janet.weaver@reqres.in"))
				   .and().assertThat().body("data.first_name", equalTo("Janet"))
				   .and().assertThat().body("data.last_name", equalTo("Weaver"))
				   .and().assertThat().body("data.avatar", equalTo("https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg"));
	}
}