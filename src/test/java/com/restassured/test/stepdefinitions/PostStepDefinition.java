package com.restassured.test.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static com.restassured.learning.utilities.SupportUtilities.parseJson;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.testng.Assert.assertEquals;

import com.restassured.pom.Posts;
import com.restassured.pom.PostsReponse;

public class PostStepDefinition{
	
	Response response;
	Posts posts;
	
	@Given("^The user opens the web service posts$")
	public void the_user_opens_the_web_service_posts() throws Throwable {
//		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		response = given().basePath("/posts/")
				.when()
				.get()
				.then().extract().response();
	}
	
	@When("^postId is (\\d+)$")
	public void postId_is(int postId) {
		posts = PostsReponse.getPostsById(response.asString(), postId);
		
	}

	@Then("^id is (\\d+)$")
	public void id_is(int postId) throws Throwable {
		assertEquals(posts.getId(), postId);
	}
	@And("^userid is (\\d+)$")
	public void userid_is(int id) {
		assertEquals(posts.getUserId(), id);
	}

	@And("^title is \"([^\"]*)\"$")
	public void title_is(String title){
		assertEquals(posts.getTitle(), title);
	}

	@When("^no of posts should be (\\d+)$")
	public void no_of_posts_should_be(int size) throws Throwable {
		assertThat(parseJson(response).getList("userId"),hasSize(size));
	}

}