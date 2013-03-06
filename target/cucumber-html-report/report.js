$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027cukes/Person.feature\u0027");
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
  "duration": 323102872,
  "status": "passed"
});
formatter.match({
  "location": "CukeSteps.checkThem()"
});
formatter.result({
  "duration": 30296,
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
  "duration": 11524958,
  "status": "passed"
});
});