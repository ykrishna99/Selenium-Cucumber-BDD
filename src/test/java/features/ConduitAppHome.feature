#Author: Krishna
Feature: Get all articles from Conduit App

  Scenario: Get all articles
    Given User is on Conduit app
    And I will verify conduit title
    When I go to Global Feed section
    And I will verify articles are displayed
    Then I will display articles in console

  Scenario Outline: Verify popular tags
    Given User is on Conduit app
    And I will verify tags section displayed
    Then I will verify "<tag>" in tags section

    Examples:
      | tag							|
      | welcome         |
      | implementations |
      | codebaseShow    |
      | introduction    |
