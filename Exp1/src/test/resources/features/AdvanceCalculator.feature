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

  Scenario: power two numbers
    Given Two input values, 1 and 2
    When I ^ the two values
    Then I Expect the result 1.0

  Scenario Outline: multiply two numbers
    Given Two input values, <first> and <second>
    When I <operator> the two values
    Then I Expect the result <result>
    Examples:
      | first | second | operator | result |
      | 1 | 12 | * | 12.0 |
      | -2 | 4 | * | -8.0 |
      | 2 | 3 | * | 6.0 |
      | 3 | 0 | * | 0.0 |
      | -6 | 1 | / | -6.0 |
      | 6 | 2 | / | 3.0 |
      | 6 | 4 | / | 1.5 |
      | 6 | -1 | / | -6.0 |
      | 2 | 2 | ^ | 4.0 |
      | 2 | 0 | ^ | 1.0 |
      | 2 | 1 | ^ | 2.0 |
      | 1 | 2 | ^ | 1.0 |
      | -1 | 2 | ^ | 1.0 |
      | -1 | 3 | ^ | -1.0 |

  Scenario: divide Two Number