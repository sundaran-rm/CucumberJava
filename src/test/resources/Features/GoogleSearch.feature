@Google
Feature: Check Google search functionality

  Scenario Outline: Google search validation
    Given Browser is open
    And User is on Google search page
    When User enters "<searchtext>" in google search box
    And User hits enter
    Then User is navigated to the search results page

    
    Examples:
    | searchtext |
    | Selenium |
    | Testing |