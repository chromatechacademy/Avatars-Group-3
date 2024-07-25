Feature: Ability to add and delete sections

  @Regression @AG3CP-17 @Mustafa
  Scenario: Add and delete a section
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    When user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And the following modules are displayed: "Student Information", "Fees Collection" , "Income" , "Expenses" , "Academics" , "Human Resource" , "Homework" , "Reports"
    And the user clicks on the Academics Module
    And the following submodules are displayed: "Class Timetable", "Teachers Timetable", "Assign Class Teacher", "Promote Students", "Subject Group", "Subjects", "Class", "Sections"
#    And the faculty member is navigated to the Academics module
#    When the faculty member navigates to the sections submodule
#    And the faculty member adds a section
#    Then the section is added
#    And the faculty member can also delete the section