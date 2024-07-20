Feature: Verifying Student Data

  @Regression @AG3CP-28 @Joyce
  Scenario: Valid Credentials Login
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    When user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    Then user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And user clicks on the student information
    And user clicks on student admission button
    And user is on the student admission page "https://mexil.it/chroma/student/create"
