Feature: Add Expense Head and Remove Expense Head

  @Progression @AG3CP-26 @Joyce
  Scenario:Add Expense Head and Remove Expense Head
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    When user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    And user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user clicks the expense module text
    And  user clicks expense head module
    And user enters the expense head in expense head page "Test @AG3CP-26"
    And  user enters "TEST AG3CP-26 Description" in the description
    And user clicks save
    And the "Record Saved Succesfully" is showed
    And expense head is displayed in the list and able to delete it