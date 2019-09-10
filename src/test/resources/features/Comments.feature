#Author Sumeet Agrawal
Feature: To Verify that content type 
  Scenario: User calls api /comments
	Given The user opens the comments
	Then verify that response is "JSON"