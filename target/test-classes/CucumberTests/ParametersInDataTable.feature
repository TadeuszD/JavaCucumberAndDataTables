Feature: Catching parameters in DataTable

  Scenario: Handling parameters in DataTable as Lists
    Given DataTable as List is initialized
    When I read parameters by DataTable as Lists
      | parameter_1   | 1111   |
      | parameter_2   | 2222   |
      | parameter_3   | 3333   |
      | parameter_4   | 4444   |
    Then I print parameters by List

  Scenario: Handling parameters in DataTable as Map
    Given DataTable as Map is initialized
    When I read parameters by Map
      | entry_1   | 1111   |
      | entry_2   | 2222   |
      | entry_3   | 3333   |
      | entry_4   | 4444   |
    Then I print parameters by Map