$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Owner/eclipse-workspace/FSCucumberSolution/src/test/resources/features/letsTalkTea.feature");
formatter.feature({
  "name": "user ability to send email on TeaPassion website via Lets Talk Tea Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.background({
  "name": "navigation to correct url",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user navigates to the correct url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the loaded page displays \"Let\u0027s Tea\" title",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "user able to send email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "the user is able to see the Lets Talk tea link",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});