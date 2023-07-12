Feature: AddCar
  @addCar
  Scenario: Let the car work
    Given User launches browser
    When User opens ilCarro Home Page
    And User click on Log in link
    And Users enters valid data
    And User click on Yalla button

    And User Click ok in Logged in window
    And Click Let the car work link
    And User fill out form to add car
    And Click on submit button
    Then User verify the car is added
    And User quit browser