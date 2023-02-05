Feature: Test summing two numbers

  Scenario: Basic scenario adding numbers
    Given Class initialized
    When I add 0 and 3
    Then result is 3

  Scenario Outline: Summing different numbers with zero for result <result>
    Given Class initialized
    When I add <num1> and <num2>
    Then result is <result>
    Examples:
      | num1 | num2 | result |
      | 3    |  7   |   10   |
      | 9    |  9   |   18   |
      | -6   |  6   |    0   |