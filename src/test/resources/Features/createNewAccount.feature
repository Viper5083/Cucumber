Feature: To Validate the funactionality of facebook application
Background:

Given User have to open the facebook application through chrome browser and maximize the window
And User have to click the create new account
And User have to wait for few seconds

Scenario Outline:

 To validate the functionality of using Creating New Account
 When User have to pass the Valid "<FirstName>",Vaild "<SurName>"
 And  User Have To Select The Valid "<Date of Birth>",Valid "<Gender>"
 And  User have to pass the Valid "<EmailAddress>"  
 Then User have to set valid the "<password>"
 
Examples:
|FirstName|SurName|EmailAddress|Password|
|M.Mohamed|Ashif|mohamedashif007@gmail.com|moha123|
|P.Praveen|Kumar|praveenpoun22@gmail.com|praveen123|
|Vasanth|R|vasanthuppili12@gmail.com|vasanth@123|
|Gubendran|T|gubendranshadow2000@gmail.com|8112650181|
 
 
Scenario: To validate the functionality of using FirstName and SurName

When User have to pass the valid username and invalid password
|Ahamed|Pasha|

@smoke
Scenario: To validate the functionality of using username and password

When User have to pass the invalid username and invalid password
|FirstName|SurName|
|M.Mohamed|Ashif|
|P.Praveen|Kumar|
|Vasanth|R|
|Gubendran|T|




 