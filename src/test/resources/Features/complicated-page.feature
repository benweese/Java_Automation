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

  Scenario Outline: Section of Social Media
    Given I find a icon
    When I click the icon with <id>
    Then I am taken to the media platform <id>

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

  Scenario: Check Twitter link in sidebar
    Given I find a twitter icon
    When I click the twitter icon
    Then I am shown a popup to share on twitter

  Scenario: Check LinkedIn link in sidebar
    Given I find a LinkedIn icon
    When I click the LinkedIn icon
    Then I am shown a popup to share on LinkedIn

  Scenario: Check Tumblr link in sidebar
    Given I find a Tumblr icon
    When I click the Tumblr icon
    Then I am shown a popup to share on Tumblr

  Scenario: Check Facebook link in sidebar
    Given I find a Facebook icon
    When I click the Facebook icon
    Then I am shown a popup to share on Facebook

  Scenario: Do the math Captcha
    Given I enter in contact information
    And   I enter in a message
    When  I come to the captcha
    And   I calculate the answer
    Then  I click submit
    And   I see the message

  Scenario: Search for the word holidays
    Given I find the search function
    When  I enter the word holidays and submit
    Then  I am taken to the search page