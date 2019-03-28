@login
Feature: Login on app
  I want to login on App

  Scenario: Validate Sucessful Login
    Given I am on the Login screen
    When I insert valid email
    And I insert valid pass
    And Click on Login button
    Then I should logged on the app
    
  Scenario: Validate Unsucessful Login
    Given I am on the Login screen
    When I insert invalid email
    And I insert valid pass
    And Click on Login button
    Then I should not logged on the app

