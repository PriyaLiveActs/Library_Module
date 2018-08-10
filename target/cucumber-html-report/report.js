$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefiles/globalmaster/DefineAuthor.feature");
formatter.feature({
  "line": 1,
  "name": "Define Author",
  "description": "",
  "id": "define-author",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Launch Url and Go to library section from dashboard",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Go to url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter username and pasword and click login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "for correct credentials it logged IN then hit go to library",
  "keyword": "Then "
});
formatter.match({
  "location": "GlobalSteps.goToUrl()"
});
formatter.result({
  "duration": 8871315966,
  "status": "passed"
});
formatter.match({
  "location": "GlobalSteps.userEnterUsernameAndPaswordAndClickLogin()"
});
formatter.result({
  "duration": 2743321583,
  "status": "passed"
});
formatter.match({
  "location": "GlobalSteps.forCorrectCredentialsItLoggedINThenHitGoToLibrary()"
});
formatter.result({
  "duration": 4267315986,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "To Test the validation messages after hitting save button when all the fields are left blank",
  "description": "",
  "id": "define-author;to-test-the-validation-messages-after-hitting-save-button-when-all-the-fields-are-left-blank",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User Open Define Author page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "hit Save Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify the error messages",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.user_Open_Define_Author_page()"
});
formatter.result({
  "duration": 2278959382,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.hit_Save_Button()"
});
formatter.result({
  "duration": 6262439388,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.verify_the_error_messages()"
});
formatter.result({
  "duration": 3499817253,
  "status": "passed"
});
});