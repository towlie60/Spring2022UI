Feature: Basic Validation Google

  @random
  Scenario: Google Title verification
    When the user navigate to google
    And the user searches for "apple"
    Then verify "apple" is in the title of the page
