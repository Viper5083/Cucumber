@login
Feature: To Validate the funactionality of facebook application
Background:
Given User have to open the faceboo application through chrome browser
And User have to maximize the window
@smoke
Scenario: To validate the functionality of using username and password

When User have to pass the valid username and invalid password
|username|smartskillstechnologies123@gmail.com|
|password|smart@123|
And User have to click the login button
Then User have to close the window


@smoke
Scenario: To validate the functionality of using username and password

When User have to pass the invalid username and invalid password
|username|password|
|vipertech123@gmail.com|viper@123|
|rko123@gmail.com|randy@123|
And User have to click the login button
Then User have to close the window

@sanity
Scenario: To validate the functionality of using username and password

When User have to pass the invalid username and valid password
|vipertech123@gmail.com|viper@123||rko123@gmail.com|randy@123|
And User have to click the login button
Then User have to close the window

@sanity
Scenario: To validate the functionality of using username and password

When User have to pass the valid username and valid password
|premalu123@gmail.com|premalu123|
|creative123@gmail.com|creative123|
|ovagames@gmail.com|oova123|
And User have to click the login button
Then User have to close the window




