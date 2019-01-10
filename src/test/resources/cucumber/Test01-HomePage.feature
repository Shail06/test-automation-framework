Feature: Test01-HomePage

  Scenario Outline: Check if the home page opens correctly
    Given I have a website <url>
    When I open the website
    Then I see <header> on the home page

    Examples:
      | url                  | header       |
      | http://0.0.0.0:8000/ | Hello World! |
