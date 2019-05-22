$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WorldRemitSendMoney.feature");
formatter.feature({
  "line": 2,
  "name": "WorldRemit Send Money",
  "description": "",
  "id": "worldremit-send-money",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sendMoney"
    },
    {
      "line": 1,
      "name": "@ui"
    },
    {
      "line": 1,
      "name": "@worldRemit"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Navigate to money Transfer Page",
  "description": "",
  "id": "worldremit-send-money;navigate-to-money-transfer-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@story_id"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to World Remit Hompage \"WorldRemitURL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I validate objects on World Remit Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select send from country as \u003csendFromCountry\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select language as \u003clanguage\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should verify user select Country as \u003cselectToCountry\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I start the money sending process",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I validate objects on Send Money Page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see money transfer page for \u003cselectToCountry\u003e",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 16,
      "value": "#Uncommit and add countries as per requirement"
    }
  ],
  "line": 18,
  "name": "",
  "description": "",
  "id": "worldremit-send-money;navigate-to-money-transfer-page;",
  "rows": [
    {
      "cells": [
        "selectToCountry",
        "sendFromCountry",
        "language"
      ],
      "line": 19,
      "id": "worldremit-send-money;navigate-to-money-transfer-page;;1"
    },
    {
      "comments": [
        {
          "line": 20,
          "value": "#\t\t\t| \"Albania\" \t\t\t|\t\"Germany\"  \t\t\t\t| \t\"English\"\t\t\t|"
        },
        {
          "line": 21,
          "value": "#\t\t\t| \"Jordan\" \t\t\t\t|\t\"United States\"   |\t\t\"English\"\t\t\t|"
        },
        {
          "line": 22,
          "value": "#\t\t\t| \"India\" \t\t\t\t|\t\"Switzerland\"    \t|\t\t\"English\"\t\t\t|"
        }
      ],
      "cells": [
        "\"Philippines\"",
        "\"United Kingdom\"",
        "\"English\""
      ],
      "line": 23,
      "id": "worldremit-send-money;navigate-to-money-transfer-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "comments": [
    {
      "line": 20,
      "value": "#\t\t\t| \"Albania\" \t\t\t|\t\"Germany\"  \t\t\t\t| \t\"English\"\t\t\t|"
    },
    {
      "line": 21,
      "value": "#\t\t\t| \"Jordan\" \t\t\t\t|\t\"United States\"   |\t\t\"English\"\t\t\t|"
    },
    {
      "line": 22,
      "value": "#\t\t\t| \"India\" \t\t\t\t|\t\"Switzerland\"    \t|\t\t\"English\"\t\t\t|"
    }
  ],
  "line": 23,
  "name": "Navigate to money Transfer Page",
  "description": "",
  "id": "worldremit-send-money;navigate-to-money-transfer-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ui"
    },
    {
      "line": 1,
      "name": "@worldRemit"
    },
    {
      "line": 4,
      "name": "@story_id"
    },
    {
      "line": 1,
      "name": "@sendMoney"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to World Remit Hompage \"WorldRemitURL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I validate objects on World Remit Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select send from country as \"United Kingdom\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select language as \"English\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should verify user select Country as \"Philippines\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I start the money sending process",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I validate objects on Send Money Page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see money transfer page for \"Philippines\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "WorldRemitURL",
      "offset": 35
    }
  ],
  "location": "stepDefinition.i_navigate_to_World_Remit_Hompage(String)"
});
formatter.result({
  "duration": 260840300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_validate_objects_on_Homepage()"
});
formatter.result({
  "duration": 380392600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United Kingdom",
      "offset": 31
    }
  ],
  "location": "stepDefinition.i_select_send_from_country_as(String)"
});
formatter.result({
  "duration": 80359500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 22
    }
  ],
  "location": "stepDefinition.i_select_language_as(String)"
});
formatter.result({
  "duration": 57192400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Philippines",
      "offset": 40
    }
  ],
  "location": "stepDefinition.i_should_verify_user_select_Country_as(String)"
});
formatter.result({
  "duration": 53150500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_start_the_money_sending_process()"
});
formatter.result({
  "duration": 1538892700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_validate_objects_on_send_money_page()"
});
formatter.result({
  "duration": 132158500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Philippines",
      "offset": 38
    }
  ],
  "location": "stepDefinition.i_should_see_money_transfer_page(String)"
});
formatter.result({
  "duration": 1043485400,
  "status": "passed"
});
});