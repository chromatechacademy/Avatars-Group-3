Feature: Fees Collection Module

  @Progression @AG3CP-72 @ValerieYa
  Scenario: Fees Collection Module
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    When user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And the user clicks on the Fees Collection module
   # Then the following submodules are displayed "Collect Fees", "Search Fees Payment", "Search Due Fees", "Fees Master", "Fees Group", "Fees Type", "Fees Discount", "Fees Carry Forward", "Fees Reminder"