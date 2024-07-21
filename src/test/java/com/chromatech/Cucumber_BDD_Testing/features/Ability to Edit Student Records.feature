Feature: Editing Student Records

  @InProgress @Kei @AG3CP-14
  Scenario: Successfully Make And Save Changes To A Student Record
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    And user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And verifies a student with "112358132134" is not an existing student
    And creates a test category "Group 3 Category"
    When a CTSMS admin or faculty member is on the student admission page "https://mexil.it/chroma/student/create"
    And fills out all required fields with admission number "112358132134", class "SDET", section "Cucumber Fundamentals", first name "Group Three Student", gender "Female", date of birth "03/03/1993", guardian name "Group Three Guardian", guardian phone number "3333333333"
    And clicks save
    When a CTSMS user opens a student record with admission number "112358132134"
    And makes and saves changes to the student information with "email@newemail.com", and "333-333-3333"
    Then the student information is successfully saved with "SDET", "Cucumber Fundamentals", and "112358132134"
    And delete test account with "112358132134"
    And delete the test category