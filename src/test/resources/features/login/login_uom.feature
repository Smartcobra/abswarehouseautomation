Feature: As a ABS WareHouse User I should be able to login

  Scenario: Login into the application with valid credentials
  	Given I am on the Login page URL "http://localhost:4200/"
    Then I enter username as "sam"
    And I enter password as "nit"
    And click on login button
    Then I am logged in
    When I Click on Uom button
    And click on register button
    Then select uomType
    Then I enter UomModel as "BOXLARGE"
    Then I enter description as "This is a large box size:12x12x4"
    Then submit Uom Registration
    Then clik on UOM HOME button
    Then clik on UOM DATA button
    Then clik on Export_To_Excel button
    Then clik on Download_PDF button
    Then clik on UOM HOME2 button
    Then click on UOM HOME_Again button
    Then click on myAccount button
    Then click on logout button