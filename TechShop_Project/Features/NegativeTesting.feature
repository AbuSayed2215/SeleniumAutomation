
@smoke-1
Feature: Testing Login functionality to the application

Scenario Outline: This scenario test all the invaliad username and password
Descpiption: We can use boundary testing, state Transition technique, etc


Given I open the browser and i nvigate to the application
When I click on the sign in button on homepage
And i enter "<email>" and "<password>"
And I click on the login button
Then I suppouse to get a error message
And close the browser

Examples: 
|email								| password |
|abusayed00@gmail.com	| 123456   |
|abusay@gmail.com			| 12345600 |
|abusayed@gmail.com	  | 12345    |
|abusayed@gmail.com	  | 123456   |

