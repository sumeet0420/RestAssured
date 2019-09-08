package com.restassured.learning.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restassured.learning.pom.User;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class SupportUtilities {

	public static JsonPath parseJson(Response response) {
		return new JsonPath(response.asString());
	}
	
	public static String createUserJson(String user,String job) throws JsonProcessingException{
		ObjectMapper obj = new ObjectMapper();
			return obj.writeValueAsString(new User(user, job));
	}

	public static String createUserJson(User user) throws JsonProcessingException{
		ObjectMapper obj = new ObjectMapper();
			return obj.writeValueAsString(user);
	}
	
	
	public static JsonPath parseJson(String response) {
		return new JsonPath(response);
	}

	public static XmlPath parseXml(Response response) {
		return new XmlPath(response.asString());
	}

	public static XmlPath parseXml(String response) {
		return new XmlPath(response);
	}

	public static String fileToString(String path) throws IOException {
			return new String(Files.readAllBytes(Paths.get(path)));
	}
}