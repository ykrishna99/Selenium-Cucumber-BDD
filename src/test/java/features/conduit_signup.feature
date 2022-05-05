#Author: Krishna Rao
Feature: Signup to Conduit app

  Scenario: sign up
    Given User is on Conduit app
    And I will verify conduit title
    When I will click on sign up link
    And I will verify sign up page displayed
    When I will enter Username, Email, Password and click on sign up
    Then I will verify sign up successful