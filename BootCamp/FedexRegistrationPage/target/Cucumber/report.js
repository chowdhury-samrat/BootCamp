$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Complete Fedex registration process",
  "description": "",
  "id": "complete-fedex-registration-process",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sucessfull login with valid User information",
  "description": "",
  "id": "complete-fedex-registration-process;sucessfull-login-with-valid-user-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens Fedex Registration page URL \"https://www.fedex.com/fcl/web/jsp/contactInfo1.jsp?appName\u003doadr\u0026locale\u003dca_en\u0026step3URL\u003dhttps%3A%2F%2Fwww.fedex.com%2Ffcl%2FExistingAccountFclStep3\u0026afterwardsURL\u003dhttps%3A%2F%2Fwww.fedex.com%2Ffcl%2Foptionhome\u0026programIndicator\u003dbb11030210\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters following required information for registration",
  "rows": [
    {
      "cells": [
        "Samrat",
        "Chowdhury",
        "xyz@gmail.com",
        "xyz@gmail.com",
        "2672 Capitoll Hill Cres",
        "Calgary",
        "T3J2V9",
        "4032232323",
        "samchy",
        "Adi2Sam",
        "Adi2Sam",
        "bangladesh"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User add remaining information for State, Country, Secret question",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User acknowledge Terms and Conditions and click on Create a user ID tab button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Complete registration on fedex portal",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 8936220200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.fedex.com/fcl/web/jsp/contactInfo1.jsp?appName\u003doadr\u0026locale\u003dca_en\u0026step3URL\u003dhttps%3A%2F%2Fwww.fedex.com%2Ffcl%2FExistingAccountFclStep3\u0026afterwardsURL\u003dhttps%3A%2F%2Fwww.fedex.com%2Ffcl%2Foptionhome\u0026programIndicator\u003dbb11030210",
      "offset": 40
    }
  ],
  "location": "stepDefination.user_opens_fedex_registration_page_url_something(String)"
});
formatter.result({
  "duration": 5304055300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_enters_following_required_information_for_registration(DataTable)"
});
formatter.result({
  "duration": 1074611900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_add_remaining_information_for_state_country_secret_question()"
});
formatter.result({
  "duration": 253712500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.User_acknowledge_Terms_and_Conditions_and_click_on_Create_a_user_ID_tab_button()"
});
formatter.result({
  "duration": 243866500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.complete_registration_on_fedex_portal()"
});
formatter.result({
  "duration": 81800,
  "status": "passed"
});
});