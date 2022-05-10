#Author: Krishna Rao
@conduit
Feature: Signout

  @signout
  Scenario: User Signout from Conduit app
    Given I will click on user pic
    And I will verify user posts page displayed
    When I will click on edit profile settings button
    And I will verify user settings page displayed
    Then I will click on logout button
    And I will verify user logged out
