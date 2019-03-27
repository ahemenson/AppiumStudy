@login
Feature: Login on app
  I want to login on App

  Scenario: Validate Loging scenarios
    Given I am on the Login screen
    When I insert valid email
    And I insert valid pass
    And Click on Login button
    Then I should logged on the app 

