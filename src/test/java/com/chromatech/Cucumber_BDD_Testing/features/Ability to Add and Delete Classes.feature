Feature: Ability to Add and Delete Classes

  @Progression @AG3CP-78 @ValerieYa
  Scenario: Ability to Add and Delete Classes
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    When user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And verifies that there is no class with such name
    And navigates to Classes Page and adds a class "Testing111"
    And chooses Manual Testing in the checkbox
    And clicks Save button
    And clicks Delete button
    Then the user clicks Confirm button to delete the class