Feature: Check Ajax Wait

  Scenario: Searching for a term
    Given Veda is on the Hero home page
    When She searches for "Cucumber"
    Then all the result titles should contain the word "It's gone!"

  