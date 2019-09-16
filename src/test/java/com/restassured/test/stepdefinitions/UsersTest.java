package com.restassured.test.stepdefinitions;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.List;

import com.restassured.pom.Data;
import com.restassured.pom.DataResponse;
import com.restassured.pom.ResponseHolder;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class UsersTest{

	Response response;
	String url;
	String resources;
	
	@Given("^the api is up and running for \"([^\"]*)\"$")
	public void the_api_is_up_and_running_for(String url) {
		BaseTest.url = url;
	}

	@When("^a user performs a get request to \"([^\"]*)\"$")
	public void a_user_performs_a_get_request_to(String resources){
		BaseTest.resources = resources;
	}

	@And("performs a request")
	public void performs_a_request() {
		Response response = given()
								   .when().get(BaseTest.getURI());
		ResponseHolder.setResponse(response);
	}
	
	@Then("^the response code should be (\\d+)$")
	public void the_response_code_should_be(int statusCode){
		assertEquals(ResponseHolder.getResponseCode(),statusCode);
	}
	
	@Then("^I should see the json response with the data$")
	public void i_should_see_the_json_response_with_the_data_object(DataTable table) {
		List<Data> data = table.asList(Data.class);
		assertEquals(data.get(0),DataResponse.getData());
	}
}
