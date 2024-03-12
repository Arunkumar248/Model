Feature: Login to Swag Labs

  Scenario: Valid login
    Given I am on the Swag Labs login page
    When I enter valid login credentials on the Swag labs Login Page.
    And click on the login button on the Swag labs Login Page.
    Then I should be able to see logo name as "Swag Labs".