package com.restassured.pom;

public class DataResponse {

	public static Data getData() {
		return ResponseHolder.getResponse().jsonPath().getObject("data", Data.class);
	}
}
