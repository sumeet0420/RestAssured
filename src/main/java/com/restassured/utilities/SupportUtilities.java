package com.restassured.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restassured.pom.Data;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SupportUtilities {

	public static JsonPath parseJson(Response response) {
		return new JsonPath(response.asString());
	}
	
	public static JsonPath parseJson(String response) {
		return new JsonPath(response);
	}
	
	public static Data createDataJson(String response) throws JsonParseException, JsonMappingException, IOException {	
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(response, Data.class);
	}

	public static String fileToString(String path) throws IOException {
			return new String(Files.readAllBytes(Paths.get(path)));
	}
}