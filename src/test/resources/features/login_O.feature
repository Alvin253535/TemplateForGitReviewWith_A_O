
Feature: Login functionality
  User story: User is able to login

  @smoke
  Scenario: Login with valid credential
    Given User is on the login page
    When User logged is with valid credential
    Then User should see this title "Automation Exercise"




#Feature: Login functionality
#  User story: User is able to login
#
#  @smoke
#  Scenario: Login with valid credential
#    Given User is on the login page
#    When User logged is with valid credential
#    Then User should see this title ""