$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/BusAvailabilitySearch.feature");
formatter.feature({
  "name": "To search the bus availablity from source to destination",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user is in abhi bus home page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user gives journey detals \"\u003cLeaving from\u003e\", \"\u003cGoing to\u003e\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user submits the search",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user should see the Leaving from  and Going to",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});