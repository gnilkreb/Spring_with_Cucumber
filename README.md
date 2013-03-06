# Spring MVC and Hibernate template application

This has been amended with cucumber based on the following 
information that others have put together - thanks! 

An insightful blog: 
http://maxheapsize.com/2012/04/12/cucumber-jvm-for-java/

Some more helpful overview: 
http://www.goodercode.com/wp/using-cucumber-tests-with-maven-and-java/

This is a template for a web application that uses Spring MVC and Hibernate. The sample code is a simple CRUD page that manipulates records for a single model object.

## Running the application locally

First build with:

    $mvn clean install

Then run it with:

    $java -jar target/dependency/webapp-runner.jar target/*.war

