Feature: Is today Friday ?
  Everybody wants to know when it's Friday

  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When user asks if today is Friday
    Then user should be told "<answer>"

    Examples:
      | day | answer |
      | Friday | TGIF |
      | Sunday | Nope |
      | anything else! | Nope |