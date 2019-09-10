#Author Sumeet Agrawal
Feature: To Verify that post is correct
  Scenario: User calls web service posts
	Given The user opens the web service posts
	When postId is 24
	And id is 24
	And userid is 3
	And title is "autem hic labore sunt dolores incidunt"

Scenario: Verify the number of records are getting correct
	 Given The user opens the web service posts
	 When no of posts should be 100