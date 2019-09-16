$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("users.feature");
formatter.feature({
  "line": 1,
  "name": "Hello RestAssured",
  "description": "",
  "id": "hello-restassured",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1223900,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Verify the api is up and returning ok status",
  "description": "",
  "id": "hello-restassured;verify-the-api-is-up-and-returning-ok-status",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the api is up and running for \"https://reqres.in\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a user performs a get request to \"/api/users/2\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "performs a request",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the response code should be 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://reqres.in",
      "offset": 31
    }
  ],
  "location": "UsersTest.the_api_is_up_and_running_for(String)"
});
formatter.result({
  "duration": 327207900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/api/users/2",
      "offset": 34
    }
  ],
  "location": "UsersTest.a_user_performs_a_get_request_to(String)"
});
formatter.result({
  "duration": 122700,
  "status": "passed"
});
formatter.match({
  "location": "UsersTest.performs_a_request()"
});
formatter.result({
  "duration": 3170431600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 28
    }
  ],
  "location": "UsersTest.the_response_code_should_be(int)"
});
formatter.result({
  "duration": 3954200,
  "status": "passed"
});
formatter.before({
  "duration": 454600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify the api response",
  "description": "",
  "id": "hello-restassured;verify-the-api-response",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "the api is up and running for \"https://reqres.in\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "a user performs a get request to \"/api/users/2\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "performs a request",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see the json response with the data",
  "rows": [
    {
      "cells": [
        "id",
        "email",
        "first_name",
        "last_name",
        "avatar"
      ],
      "line": 15
    },
    {
      "cells": [
        "2",
        "janet.weaver@reqres.in",
        "Janet",
        "Weaver",
        "https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://reqres.in",
      "offset": 31
    }
  ],
  "location": "UsersTest.the_api_is_up_and_running_for(String)"
});
formatter.result({
  "duration": 229000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/api/users/2",
      "offset": 34
    }
  ],
  "location": "UsersTest.a_user_performs_a_get_request_to(String)"
});
formatter.result({
  "duration": 107400,
  "status": "passed"
});
formatter.match({
  "location": "UsersTest.performs_a_request()"
});
formatter.result({
  "duration": 505131000,
  "status": "passed"
});
formatter.match({
  "location": "UsersTest.i_should_see_the_json_response_with_the_data_object(DataTable)"
});
formatter.result({
  "duration": 956878100,
  "status": "passed"
});
});