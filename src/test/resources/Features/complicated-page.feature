@run
Feature: Complicated Page
  #Test Complicated Page

  Scenario Outline: Section of Buttons
    Given I find a button
    When I click the button with <id>
    Then I am taken back to the page

    Examples:
      | id  |
      | 0   |
      | 1   |
      | 2   |
      | 3   |
      | 4   |
      | 5   |
      | 6   |
      | 7   |
      | 8   |
      | 9   |
      | 10  |
      | 11  |