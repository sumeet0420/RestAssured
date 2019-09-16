package com.restassured.pom;

import io.restassured.http.Headers;
import io.restassured.response.Response;

public class ResponseHolder {

	private static Response response;
	private static int responseCode;
	private static String responseBody;
	private static Headers headers;
	
	public static String getContentType() {
			return response.getContentType();
	}
	public static Response getResponse() {
		return response;
	}
	public static void setResponse(Response response) {
		ResponseHolder.response = response;
	}
	public static int getResponseCode() {
		return response.getStatusCode();
	}
	
	public static String getResponseBody() {
		return response.asString();
	}
	
	public static Headers getHeaders() {
		return response.getHeaders();
	}
	
}
