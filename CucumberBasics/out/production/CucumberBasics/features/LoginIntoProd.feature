@bvt @prod
Feature: Login to Production
  
  In order to perform sucessful login to production
  As a user
  I want to enter correct username and password

  Background: 
    Given user navigates to facebook website
    When user validates the homepage title

  Scenario: In order to verify login to facebook production
    Then user entered "valid" username
    And user entered "valid" password
    And user validate the captcha image
    Then user "shouldbe" succesfully logged in

  Scenario: In order to verify login to facebook production
    Then user entered "invalid" username
    And user entered "invalid" password
    And user validate the captcha image
    Then user "shouldnot" succesfully logged in
