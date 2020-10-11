Feature: As a ABS WareHouse User I should be able to login and logout with valid credentials

  Scenario: Login into the application with valid credentials
  	Given I am on the Login page URL "http://localhost:4200/"
    Then I enter username as "sam"
    And I enter password as "nit"
    And click on login button
    Then I am logged in
    When I Click on Uom button
