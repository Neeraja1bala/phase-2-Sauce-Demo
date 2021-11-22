@LoginFeature
Feature: Login Feature

  Background: Open the Login Page
    Given User has launched the Swag Labs Application

  Scenario Outline: Verify Login Functionality with correct username and password
    When User eneters username "<UserName>"
    And User eneters password "<Password>"
    And User click on Login Button
    Then User should be landed on the products page

    Examples: 
      | UserName      | Password     |
      | standard_user | secret_sauce |

  Scenario Outline: Verify the error message when we give incorrect username and password
    When User eneters username "<UserName>"
    And User eneters password "<Password>"
    And User click on Login Button
    Then User should be Getting the error "<Error>"

    Examples: 
      | UserName      | Password      | Error                                                                     |
      | standard_user | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |
