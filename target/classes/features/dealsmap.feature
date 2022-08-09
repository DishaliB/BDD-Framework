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
@tag
Feature: Free CRM Create Contacts
  @tag1
  Scenario: Free CRM Create a New deal Scenario
    Given User is already on the Login Page
    When Title of login page is CRMPRO
    Then User enters username and password
    | username | password  |
    | DishAB   | Dish@1993 |
    Then User clicks on login button
    Then User is on Home page
    Then user moves to new deal page
    Then user enters title and amount and probability and commission
    | title | amount | probabilty | commission |
    | first deal | 4000 | 80 | 20 | 
    | second deal| 6200 | 70 | 10 |
    | third deal | 2100 | 85 | 15 |
    | fourth deal| 8400 | 75 | 25 |
    Then close the browser