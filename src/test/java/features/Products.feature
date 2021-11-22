@Products
Feature: Products Selection

  Background: Open the Login Page
    Given User has launched the Swag Labs Application

  Scenario Outline: User able to select the product on products page
    When User eneters username "<UserName>"
    And User eneters password "<Password>"
    And User click on Login Button
    And User add a product "<Product Name>"
    Then product should be added to the cart

    Examples: 
      | UserName      | Password     | Product Name        |
      | standard_user | secret_sauce | Sauce Labs Backpack |
