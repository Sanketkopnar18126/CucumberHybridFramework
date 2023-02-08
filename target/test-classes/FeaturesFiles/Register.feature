
Feature: Register functionality
 
Scenario: User create account with valid data
Given User navigate to register page
When  User enter into  below fields
|firstName|dhanraj                    |
|lastName |padolkar                   | 
|email    |dhanrajpadolkar@gmail.com  |
|telephone|125566555                  |
|password |dhanraj@123                |

And User click newsletter
And User accept private policy
And User click on continue button
Then User account sucessfully created


Scenario: User create a dublicate account with valid data
Given User navigate to register page
When  User enter into  below fields
|firstName|dhanraj                    |            
|lastName |padolkar                   |
|email    |dhanrajpadolkar@gmail.com  |
|telephone|125566555                  |
|password |dhanraj@123                |

And User click newsletter
And User accept private policy
And User click on continue button
Then User get a warning message


Scenario: User create a account with blank data
Given User navigate to register page
When  User dont enter any data
And User click newsletter
And User accept private policy
And User click on continue button
Then User get a warning message









