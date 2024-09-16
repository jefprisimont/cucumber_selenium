Feature: Login

  Scenario: Login using valid email and password
    Given user is on the login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click the login button
    Then user is on the Homepage