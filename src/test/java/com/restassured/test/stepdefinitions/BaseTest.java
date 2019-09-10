package com.restassured.test.stepdefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import cucumber.api.java.Before;
import io.restassured.RestAssured;

public class BaseTest {

	/**
	 * @author Agrawal
	 * This method sets up the URL. 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Before
	public void setUp() throws FileNotFoundException, IOException {
	Properties properties = new Properties();
	String path  = System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"env.properties";
	properties.load(new FileInputStream(new File(path)));
	RestAssured.baseURI = properties.getProperty("URI");
	}
}
