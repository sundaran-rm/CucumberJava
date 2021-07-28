
# Comments here
# @SmokeTesting
Feature: To test Login Funcionality

  @SmokeTest
  Scenario: Check Login is successful
    Given User is on logon page
    When User enters username and password
    And User clicks Login
    Then User navigate to home page
 #   Examples: 
  #    | username | password |
   #   | user1    | pass1    |
    #  | user2    | pass2    |
     # | user3    | pass3    |
