#Author Sumeet Agrawal
Feature: To test the Web Service Status Code as 200
  Scenario Outline: User calls web service 
	Given The User opens the service "<services>"
	Then the status code is 200
	
	Examples:
	|services|
	|users|
	|posts|
	|comments|