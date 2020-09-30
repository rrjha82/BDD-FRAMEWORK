Feature: Application login

Scenario: Free CRM Login Test Scenerio
Given User is present on login page
When 	title of login page is FREE CRM
Then user enters username "rajeev" and password "abcs"
And  user clicks on login button



Scenario: Free CRM Login negative Test Scenerio
Given User is present on login page
When 	title of login page is FREE CRM
Then user enters username "sanjeev" and password "mrmj"
And  user clicks on login button

