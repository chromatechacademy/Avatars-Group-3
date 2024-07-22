Feature: Verifying Student Data

  @Progression @Kei @AG3CP-27
  Scenario: Student Data Displays as Expected
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    And user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And verifies a student with "3123333333" is not an existing student
    And creates a test category "Selenium"
    And a CTSMS admin or faculty member is on the student admission page "https://mexil.it/chroma/student/create"
    And fills out all required fields with admission number "3123333333", class "SDET", section "Cucumber Fundamentals", first name "Amy", gender "Female", date of birth "07/24/2024", guardian name "Threei", guardian phone number "3333333333"
    And clicks save
    When a student has been admitted "3123333333"
    And an admin navigates to a student record with "Amy"
    Then all data submitted with the record should display as expected "07/03/2024", class "SDET", section "Cucumber Fundamentals", first name "Amy", gender "Female", date of birth "07/24/2024", guardian name "Threei", guardian phone number "3333333333"
    And delete test account with "3123333333"
    And delete the test category