$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cukes/Person.feature");
formatter.feature({
  "id": "example-of-a-feature-file",
  "description": " As some aspiring cuke4duke user\n I want an example of how it works\n So that I can easily setup my project to use it",
  "name": "Example of a feature file",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "example-of-a-feature-file;a-simple-passing-scenario",
  "description": "",
  "name": "A simple passing scenario",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario",
  "comments": [
    {
      "value": "# This should pass",
      "line": 6
    }
  ]
});
formatter.step({
  "name": "the letter \u0027A\u0027",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "I check the letter",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "the letter should be \u0027A\u0027",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "arguments": [
    {
      "val": "A",
      "offset": 12
    }
  ],
  "location": "CukeSteps.gimmeALetter(char)"
});
formatter.result({
  "duration": 257327343,
  "status": "passed"
});
formatter.match({
  "location": "CukeSteps.checkThem()"
});
formatter.result({
  "duration": 487004,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A",
      "offset": 22
    }
  ],
  "location": "CukeSteps.checkTheLetter(char)"
});
formatter.result({
  "duration": 5685777,
  "status": "passed"
});
formatter.scenario({
  "id": "example-of-a-feature-file;a-database-related-scenario",
  "description": "",
  "name": "A database related scenario",
  "keyword": "Scenario",
  "line": 12,
  "type": "scenario"
});
formatter.step({
  "name": "list of persons",
  "keyword": "Given ",
  "line": 13
});
formatter.step({
  "name": "it should be empty",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "CukeSteps.getListOfPersons()"
});
formatter.result({
  "duration": 3675187,
  "status": "passed"
});
formatter.match({
  "location": "CukeSteps.checkIfEmpty()"
});
formatter.result({
  "duration": 824686,
  "status": "passed"
});
formatter.scenario({
  "id": "example-of-a-feature-file;a-database-related-scenario",
  "description": "",
  "name": "A database related scenario",
  "keyword": "Scenario",
  "line": 16,
  "type": "scenario"
});
formatter.step({
  "name": "added some person",
  "keyword": "Given ",
  "line": 17
});
formatter.step({
  "name": "list of persons",
  "keyword": "And ",
  "line": 18
});
formatter.step({
  "name": "it should not be empty",
  "keyword": "Then ",
  "line": 19
});
formatter.match({
  "location": "CukeSteps.addAPerson()"
});
formatter.result({
  "duration": 14923616,
  "status": "passed"
});
formatter.match({
  "location": "CukeSteps.getListOfPersons()"
});
formatter.result({
  "duration": 3877587,
  "status": "passed"
});
formatter.match({
  "location": "CukeSteps.checkIfNotEmpty()"
});
formatter.result({
  "duration": 506349,
  "status": "passed"
});
});