Feature: Hello RestAssured
Scenario: Verify the api is up and returning ok status

Given the api is up and running for "https://reqres.in"
When a user performs a get request to "/api/users/2"
And performs a request
Then the response code should be 200


Scenario: Verify the api response
Given the api is up and running for "https://reqres.in"
When a user performs a get request to "/api/users/2"
And performs a request
Then I should see the json response with the data
|id|email|first_name|last_name|avatar|
|2|janet.weaver@reqres.com|Janet|Weaver|https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg|