Feature: To Validate the funactionality of facebook application
Background:

Given User have to open the facebook application through chrome browser and maximize the window
And User have to click the forgotten password button
And User have to wait for few seconds

Scenario Outline:

 To validate the functionality of using forgotten password
 When User have to pass the Valid "<EmailAddress>"  
 Examples:
|mohamedashif007@gmail.com|
|praveenpoun22@gmail.com|
|vasanthuppili12@gmail.com|
|gubendranshadow2000@gmail.com|
 
 
Scenario: To validate the functionality of using forgotten Password

When User have to pass the Email Address
|ahamedpasha123@gmail.com|

@smoke
Scenario: To validate the functionality of using forgotten Password

When User have to pass the Email Address
|mohamedashif007@gmail.com|
|praveenpoun22@gmail.com|
|vasanthuppili12@gmail.com|
|gubendranshadow2000@gmail.com|
 




 