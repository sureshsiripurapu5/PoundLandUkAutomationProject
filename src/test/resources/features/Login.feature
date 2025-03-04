Feature: User Login

  @LT1
  Scenario: Successful login with valid credentials
    Given The user is on the login page
    When The user enters a valid email and password
    And Clicks on the SignIn button
    Then The user should be redirected to the homepage

  @LT2
  Scenario: Login attempt with incorrect credentials
    Given The user is on the SignIn page
    When The user enters an valid email "siripurapusuresh5@gmail.com"
    And The user enters the inValidPassword "Suhjkl@123"
    And Clicks on the SignIn button
    Then An error message "Your password is incorrect." should be displayed

  @LT3
  Scenario: Login attempt with incorrect credentials
    Given The user is on the SignIn page
    When The user enters an inValid email "sirip@gmail.com"
    And The user enters the Valid Password "Suresh@123"
    And Clicks on the SignIn button
    Then An error message "We can't seem to find your account." should be displayed