Feature: Logining facebook

  Scenario: test with valid credential
    Given open firefox and start application
    When User enters "rkp@rkp.cpm" and "password"
    Then user logs in unsuccessfully