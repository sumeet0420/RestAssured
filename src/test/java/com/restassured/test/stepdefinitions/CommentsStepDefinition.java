package com.restassured.test.stepdefinitions;

import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CommentsStepDefinition{

	Response response;
	@Given("^The user opens the comments$")
	public void the_user_opens_the_comments() {
		
		response = given().basePath("/comments/")
				.when().get()
				.then().extract().response();
	}

	@Then("^verify that response is \"([^\"]*)\"$")
	public void verify_that_response_is(String responseType) {
		response.then().contentType(ContentType.JSON);
	}

}