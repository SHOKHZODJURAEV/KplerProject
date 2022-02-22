@ui
Feature: As a user, I should be able to access all the main modules of the app

  Background:
    Given User go to the home page

  Scenario: as a User, I should be able to verify the main modules of the app.
    Then Verify the user see the following modules:
      | Company  |
      | Contacts |
      | LOGIN    |

  Scenario: as a User I should be able to click Company module and verify company information displayed on the page

    When As a user, I should click Company module
    Then Verify company information displayed on the page

  Scenario: as user I should be able to click Contacts module and verify contact information displayed on the page


    When Click Contacts module
    Then Verify contact information displayed on the page


  Scenario: as a user I should be able to click Login module and verify sub-modules are displayed

    When  User click on login module
    Then  Verify user should able to see sub-modules below
      | LNG  |
      | LPG  |
      | OIL  |
      | CPP  |
      | COAL |

  Scenario Outline: When user click on each login sub-module, user should land on the login page

    And  User click on login module
    When User click on each "<modules>"
    Then Verify user land on login page
    Examples:
      | modules |
      | LNG     |
      | LPG     |
      | OIL     |
      | CPP     |
      | COAL    |

  Scenario: as a user I should be able to click Ask for a Trial module and verify ok body;


    When  Click input box provide valid credential
    Then  Click Ask for a Trial button and verify ok body














