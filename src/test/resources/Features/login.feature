
# Comments here
@SmokeTesting
Feature: To test Login Funcionality

	@SmokeTest
  Scenario: Check Login is successful
    Given User is on logon page
    When User enters username and password
    And User clicks Login
    Then User navigate to home page
 
 
 	Scenario: Check Login is Unsuccessful
    Given User is on logon page
    When User enters username and password
    And User clicks Login
    Then User navigate to home page
 
