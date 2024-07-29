Feature: Income Module

  @Regression @AG3CP-77 @ValerieYa
  Scenario: Income Module
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    When user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And the user clicks on the Income module
    Then the following Income submodules are displayed "Add Income", "Search Income", "Income Head"