Feature:  As a business user, i would like to search for Cash Investment Rates on Investec site, from there sign up to receive insight to your inbox

  Scenario Outline: Sign up on the Investec public website and receive focus insight straight to your inbox.
    Given User needs to be on the Investec public site
    And User clicks on search Icon
    And User clicks on search filed
    And User searches for Cash Investment Rates "<search_input>"
    And User removes information from the text
    And User clicks on Search button
    And User scrolls down and click on Understanding cash investment interest rates
    And User scroll to SignUp and clicks on SignUp button
    And User enters first name "<first_name>"
    And User enters surname "<surname>"
    And User enters email address "<emailaddress>"
    And User selects Myself as an insight
    And User clicks on button Submit
    And User validates successful message
    Then close browser
    Examples:
      | search_input                      | first_name | surname | emailaddress            |
      | cash investment rates information | Faith      | Fisher  | aubrey@kineticskunk.com |
