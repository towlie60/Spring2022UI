Feature: Basic validation

  Background:
    Given the user is on the meetup homepage

  Scenario: Title Verification
    Then verify the title contains "Meetup"

    Scenario: Url verification
      Then verify homepage contains "https://www.meetup.com/"
