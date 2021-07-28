@Google
Feature: Check Google search functionality

  Scenario: Google search validation
    Given Browser is open
    And User is on Google search page
    When User enters a text in google search box
    And User hits enter
    Then User is navigated to the search results page
