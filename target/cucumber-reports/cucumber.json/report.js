$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login function validation",
  "description": "",
  "id": "login-function-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2198655747,
  "status": "passed"
});
formatter.before({
  "duration": 2965517678,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-function-validation;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click on Log out link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Page logout Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioStepdefinition.user_Launch_Chrome_browser()"
});
formatter.result({
  "duration": 122460423,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "ScenarioStepdefinition.user_opens_URL(String)"
});
formatter.result({
  "duration": 573624322,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "ScenarioStepdefinition.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 326162424,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioStepdefinition.click_on_Login()"
});
formatter.result({
  "duration": 6575707779,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "ScenarioStepdefinition.page_Title_should_be(String)"
});
formatter.result({
  "duration": 3034034313,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioStepdefinition.user_click_on_Log_out_link()"
});
formatter.result({
  "duration": 3884598196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 29
    }
  ],
  "location": "ScenarioStepdefinition.page_logout_Title_should_be(String)"
});
formatter.result({
  "duration": 43826924,
  "error_message": "java.lang.AssertionError: expected [admin-demo.nopcommerce.com] but found [Your store. Login]\n\tat org.testng.Assert.fail(Assert.java:96)\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\n\tat org.testng.Assert.assertEquals(Assert.java:118)\n\tat org.testng.Assert.assertEquals(Assert.java:453)\n\tat org.testng.Assert.assertEquals(Assert.java:463)\n\tat com.usa.stepdefinition.ScenarioStepdefinition.page_logout_Title_should_be(ScenarioStepdefinition.java:55)\n\tat ✽.Then Page logout Title should be \"Your store. Login\"(Login.feature:10)\n",
  "status": "failed"
});
formatter.match({
  "location": "ScenarioStepdefinition.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});