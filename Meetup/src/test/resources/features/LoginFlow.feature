@LoginFlow
Feature: Login Flow

  Background:
    Given the user is on the meetup homepage

  Scenario: Validate Sign Up Button is displayed
    Then User should be able to see "Signup" button

    Scenario: Validate Login Button is displayed
      Then User should be able to see "Log in" button

      Scenario: Validate Join Meetup button is displayed
        Then User should be able to see "Join Meetup" button
