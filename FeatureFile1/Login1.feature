Feature: Login

Scenario: Successful Login with Valid Credentials

    Given User Launch Chrome Browser
    When User enter URL "https://www.saucedemo.com/"
    And User enter Username as "standard_user" and Password as "secret_sauce"
    And User Click on Login
    Then Page Title should be "Swag Labs"
    And User Click on Add to cart
    When User Click on Hamburger menu
    And User Click on Logout link
    Then Page Title should be "Swag Labs"
    And Close Browser
 
 
Scenario Outline: Successful Login with Valid Credentials (Data Driven)

    Given User Launch Chrome Browser
    When User enter URL "https://www.saucedemo.com/"
    And User enter Username as "<username>" and Password as "<password>"
    And User Click on Login
    Then Page Title should be "Swag Labs"
    And User Click on Add to cart
    When User Click on Hamburger menu
    And User Click on Logout link
    Then Page Title should be "Swag Labs"
    And Close Browser
    
 
 Examples:
 |username|password|
 |visual_user|secret_sauce|

    
    
    