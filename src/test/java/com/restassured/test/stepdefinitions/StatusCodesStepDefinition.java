package com.restassured.test.stepdefinitions;

import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

public class StatusCodesStepDefinition{

	private Response response;

	@Given("^The User opens the service \"([^\"]*)\"$")
	public void the_User_opens_the_service(String service) {
//		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		response = given().basePath("/" + service + "/").when().get();

	}

	@Then("^the status code is (\\d+)$")
	public void the_status_code_is(int code) throws Throwable {
		response.then().assertThat().statusCode(200);
	}

}
