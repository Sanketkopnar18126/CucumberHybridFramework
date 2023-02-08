Feature: Search Functionality

Scenario: User search for valid product
Given  User open the application
When  User enter valid product "HP" into search box field
And  User clicks on search button 
Then  User should get valid product displayed in search result

 
 Scenario: User search for invalid product
Given  User open the application
When  User enter invalid product "Honda" into search box field
And  User clicks on search button 
Then  User should get message about no product matching
 
  Scenario: User search with blank data
Given  User open the application
When  User dont enter any product into search box field
And  User clicks on search button 
Then  User should get message about no product matching
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 