Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches browser
    When User opens ilCarro Home Page
    And User click on Log in link
    And Users enters valid data
    And User click on Yalla button
    Then User verifies Log in message
    And User quit browser

    @WrongPassword
    Scenario Outline: Login with valid email and wrong password
      Given User launches browser
      When User opens ilCarro Home Page
      And User click on Log in link
      And Users enters valid email and wrong password
        | email   | password   |
        | <email> | <password> |
      And User click on Yalla button
      Then User verifies error
      And User quit browser
      Examples:
        | email                | password     |
        | lisawan@gmail.com    | $Lisawan$  |
        | lisawan@gmail.com    | lisawan87  |
        | lisawan@gmail.com    | $Ln87$  |
        | lisawan@gmail.com    | @lisawan88@  |