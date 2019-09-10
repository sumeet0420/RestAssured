$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Comments.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author Sumeet Agrawal"
    }
  ],
  "line": 2,
  "name": "To Verify that content type",
  "description": "",
  "id": "to-verify-that-content-type",
  "keyword": "Feature"
});
formatter.before({
  "duration": 773300100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User calls api /comments",
  "description": "",
  "id": "to-verify-that-content-type;user-calls-api-/comments",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "The user opens the comments",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify that response is \"JSON\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CommentsStepDefinition.the_user_opens_the_comments()"
});
formatter.result({
  "duration": 3304528700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JSON",
      "offset": 25
    }
  ],
  "location": "CommentsStepDefinition.verify_that_response_is(String)"
});
formatter.result({
  "duration": 19237400,
  "status": "passed"
});
formatter.uri("Posts.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author Sumeet Agrawal"
    }
  ],
  "line": 2,
  "name": "To Verify that post is correct",
  "description": "",
  "id": "to-verify-that-post-is-correct",
  "keyword": "Feature"
});
formatter.before({
  "duration": 455400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User calls web service posts",
  "description": "",
  "id": "to-verify-that-post-is-correct;user-calls-web-service-posts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "The user opens the web service posts",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "postId is 24",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "id is 24",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "userid is 3",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "title is \"autem hic labore sunt dolores incidunt\"",
  "keyword": "And "
});
formatter.match({
  "location": "PostStepDefinition.the_user_opens_the_web_service_posts()"
});
formatter.result({
  "duration": 400885900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "24",
      "offset": 10
    }
  ],
  "location": "PostStepDefinition.postId_is(int)"
});
formatter.result({
  "duration": 767923100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "24",
      "offset": 6
    }
  ],
  "location": "PostStepDefinition.id_is(int)"
});
formatter.result({
  "duration": 3329800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 10
    }
  ],
  "location": "PostStepDefinition.userid_is(int)"
});
formatter.result({
  "duration": 154400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "autem hic labore sunt dolores incidunt",
      "offset": 10
    }
  ],
  "location": "PostStepDefinition.title_is(String)"
});
formatter.result({
  "duration": 123000,
  "status": "passed"
});
formatter.before({
  "duration": 386500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify the number of records are getting correct",
  "description": "",
  "id": "to-verify-that-post-is-correct;verify-the-number-of-records-are-getting-correct",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "The user opens the web service posts",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "no of posts should be 100",
  "keyword": "When "
});
formatter.match({
  "location": "PostStepDefinition.the_user_opens_the_web_service_posts()"
});
formatter.result({
  "duration": 354364500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 22
    }
  ],
  "location": "PostStepDefinition.no_of_posts_should_be(int)"
});
formatter.result({
  "duration": 65773600,
  "status": "passed"
});
formatter.uri("Status.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author Sumeet Agrawal"
    }
  ],
  "line": 2,
  "name": "To test the Web Service Status Code as 200",
  "description": "",
  "id": "to-test-the-web-service-status-code-as-200",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User calls web service",
  "description": "",
  "id": "to-test-the-web-service-status-code-as-200;user-calls-web-service",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "The User opens the service \"\u003cservices\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the status code is 200",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "to-test-the-web-service-status-code-as-200;user-calls-web-service;",
  "rows": [
    {
      "cells": [
        "services"
      ],
      "line": 8,
      "id": "to-test-the-web-service-status-code-as-200;user-calls-web-service;;1"
    },
    {
      "cells": [
        "users"
      ],
      "line": 9,
      "id": "to-test-the-web-service-status-code-as-200;user-calls-web-service;;2"
    },
    {
      "cells": [
        "posts"
      ],
      "line": 10,
      "id": "to-test-the-web-service-status-code-as-200;user-calls-web-service;;3"
    },
    {
      "cells": [
        "comments"
      ],
      "line": 11,
      "id": "to-test-the-web-service-status-code-as-200;user-calls-web-service;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 460300,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User calls web service",
  "description": "",
  "id": "to-test-the-web-service-status-code-as-200;user-calls-web-service;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "The User opens the service \"users\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "users",
      "offset": 28
    }
  ],
  "location": "StatusCodesStepDefinition.the_User_opens_the_service(String)"
});
formatter.result({
  "duration": 322221500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 19
    }
  ],
  "location": "StatusCodesStepDefinition.the_status_code_is(int)"
});
formatter.result({
  "duration": 33100400,
  "status": "passed"
});
formatter.before({
  "duration": 430600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User calls web service",
  "description": "",
  "id": "to-test-the-web-service-status-code-as-200;user-calls-web-service;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "The User opens the service \"posts\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "posts",
      "offset": 28
    }
  ],
  "location": "StatusCodesStepDefinition.the_User_opens_the_service(String)"
});
formatter.result({
  "duration": 371244800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 19
    }
  ],
  "location": "StatusCodesStepDefinition.the_status_code_is(int)"
});
formatter.result({
  "duration": 1322500,
  "status": "passed"
});
formatter.before({
  "duration": 398200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User calls web service",
  "description": "",
  "id": "to-test-the-web-service-status-code-as-200;user-calls-web-service;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "The User opens the service \"comments\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "comments",
      "offset": 28
    }
  ],
  "location": "StatusCodesStepDefinition.the_User_opens_the_service(String)"
});
formatter.result({
  "duration": 811958200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 19
    }
  ],
  "location": "StatusCodesStepDefinition.the_status_code_is(int)"
});
formatter.result({
  "duration": 586700,
  "status": "passed"
});
});