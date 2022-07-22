@tag
Feature: AdvanceCalculator
  Scenario: multiply two numbers
    Given Two input values, 1 and 2
    When I * the two values
    Then I Expect the result 2.0

  Scenario: divide two numbers
    Given Two input values, 1 and 2
    When I / the two values
    Then I Expect the result 0.5

