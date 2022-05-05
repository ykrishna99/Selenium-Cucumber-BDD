#Author: Krishna
Feature: Get all articles from Conduit home page

  Scenario: Get all articles
    Given User is on Conduit app
    And I will verify conduit title
    When I go to Global Feed section
    And I will verify articles are displayed
    Then I will display articles in console