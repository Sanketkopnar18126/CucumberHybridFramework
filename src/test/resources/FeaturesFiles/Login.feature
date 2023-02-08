
Feature: Login Functionality


Scenario Outline: Login with valid data
Given User navigate to login page
When  User enter valid Email address  <username>
And  User enter valid password      <password>
And  User click on login button
Then  User succesfully login
Examples:

|username                  |password|
|sanketkopnar1050@gmail.com|16541616|
|sanketkopnar1050@gmail.com|84511665|
|sanketkopnar1050@gmail.com|84651351|




Scenario: Login with invalid data
 Given User navigate to login page
When  User enter invalid Email address   "sanketkopnar1ghdgv050@gmail.com"
And  User enter invalid password      "Sanket@vwcub123"
And  User click on login button
Then  User get a warning messeage


 Scenario: Login with valid email and invalid password 
 Given User navigate to login page
When  User enter valid Email address   "sanketkopnar1050@gmail.com"
And  User enter invalid password      "Sanket@vwcub123"
And  User click on login button
Then  User get a warning messeage

 Scenario: Login with ivalid email and valid password 
 Given User navigate to login page
When  User enter valid Email address   "sanketkopnar1ghdgv050@gmail.com"
And  User enter invalid password      "Sanket@123"
And  User click on login button
Then  User get a warning messeage

 
 Scenario: Login with blank data
 Given User navigate to login page
When  User dont enter email address into email field   
And  User dont enter password into password field     
And  User click on login button
Then  User get a warning messeage

 











 