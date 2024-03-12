Feature: Login to OrangeHRM

  Scenario: Valid login
    Given I am on the OrangeHRM login page
    When I enter valid login credentials
    And click on the login button
    Then I should be redirected to the OrangeHRM dashboard

  Scenario: Invalid login
    Given I am on the OrangeHRM login page
    When I enter invalid login credentials
    And click on the login button
    Then I should see an error message on the login page

  Scenario: Empty login
    Given I am on the OrangeHRM login page
    When I leave the username and password fields empty
    And click on the login button
    Then I should see an error message on the login page

