$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_WorkSpace/FreeCRMBDDFramework/src/main/java/features/dealsmap.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Free CRM Create Contacts",
  "description": "",
  "id": "free-crm-create-contacts",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 22,
  "name": "Free CRM Create a New deal Scenario",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User is already on the Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Title of login page is CRMPRO",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 26
    },
    {
      "cells": [
        "DishAB",
        "Dish@1993"
      ],
      "line": 27
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User is on Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user enters title and amount and probability and commission",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probabilty",
        "commission"
      ],
      "line": 32
    },
    {
      "cells": [
        "first deal",
        "4000",
        "80",
        "20"
      ],
      "line": 33
    },
    {
      "cells": [
        "second deal",
        "6200",
        "70",
        "10"
      ],
      "line": 34
    },
    {
      "cells": [
        "third deal",
        "2100",
        "85",
        "15"
      ],
      "line": 35
    },
    {
      "cells": [
        "fourth deal",
        "8400",
        "75",
        "25"
      ],
      "line": 36
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_is_already_on_the_Login_Page()"
});
formatter.result({
  "duration": 4907556900,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.title_of_login_page_is_CRMPRO()"
});
formatter.result({
  "duration": 11986300,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 130589200,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 34824800,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_is_on_Home_page()"
});
formatter.result({
  "duration": 537046500,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 40097278800,
  "error_message": "org.openqa.selenium.NoSuchFrameException: No frame element found by name or id mainpanel\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DISHU\u0027, ip: \u0027192.168.2.23\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:885)\r\n\tat stepDefinitions.DealsStepWithMapDefinition.user_moves_to_new_deal_page(DealsStepWithMapDefinition.java:72)\r\n\tat ???.Then user moves to new deal page(C:/Selenium_WorkSpace/FreeCRMBDDFramework/src/main/java/features/dealsmap.feature:30)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_title_and_amount_and_probability_and_commission(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});