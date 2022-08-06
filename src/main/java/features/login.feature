#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Free CRM Login feature


  #without examples keyword
  #Scenario: Free CRM Login Test Scenario
 #   Given User is already on the Login Page
 #   When Title of login page is CRMPRO
 #   Then User enters "DishAB" and "Dish@1993"
 #   Then User clicks on login button
 #   Then User is on Home page


#with examples keyword
Scenario Outline: Free CRM Login Test Scenario
    Given User is already on the Login Page
    When Title of login page is CRMPRO
    Then User enters "<username>" and "<password>"
    Then User clicks on login button
    Then User is on Home page
    Then Close the browser
    
    Examples:
    | username        | password   |
    | DishAB          | Dish@1993  | 
    | groupautomation | Test@12345 |
     
 