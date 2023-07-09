Feature: An example

  Scenario: The example
    Given I am on the google search page
    When the search therm of "wikipedia" is written
    And the search button is clicked
    Then the scenario passes
  
  Scenario: The example
    Given I am on the google search page
    When the image button is clicked
    * the search therm of "ballerina" is written
    And the magnifier is clicked
    And then i click on video button
    And i click on Instruments button
    Then the scenario passes


