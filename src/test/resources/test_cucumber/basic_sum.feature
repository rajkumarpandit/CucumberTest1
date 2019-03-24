Feature: basic sum

  Scenario Outline: basic operations
    Given operation is "<operation>"
    When user enters "<num1>" and "<num2>"
    Then user gets "<sum>"
    Examples:
    | operation | num1 | num2 | sum |
    | addition | 60 | 40 | 100 |
    | addition | 50 | 30 | 80 |
    | minus | 50 | 10 | 40 |
    | minus | 30 | 20 | 10 |
    | multiplication | 30 | 20 | 600 |
    | multiplication | 50 | 60 | 3000 |
