package com.restassured.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restassured.pom.PostsReponse;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class SupportUtilities {

	public static JsonPath parseJson(Response response) {
		return new JsonPath(response.asString());
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
	
	public static PostsReponse createPostsJson(String response) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(response, PostsReponse.class);
	}

	public static String fileToString(String path) throws IOException {
			return new String(Files.readAllBytes(Paths.get(path)));
	}
}