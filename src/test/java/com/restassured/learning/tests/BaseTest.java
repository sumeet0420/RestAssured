package com.restassured.learning.tests;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class BaseTest {

	@BeforeTest
	public void setUp() {
		RestAssured.baseURI = "https://reqres.in";
	}
}
