Feature: Verifying Student Data

 #@Regression @AG3CP-27 @Joyce
  Scenario: Valid Credentials Login
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    When user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    Then user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And user clicks on the student information
    And user clicks on student admission button
    And user is on the student admission page "https://mexil.it/chroma/student/create"
    And user enters the admission number "0987654"
    And user enters the roll number "098765"
    And user selects "SDET" class dropdown
    And user selects section select dropdown "Cucumber fundamentals"
    And add the first name "Charles"
    And user enters the last name "Pearson"


