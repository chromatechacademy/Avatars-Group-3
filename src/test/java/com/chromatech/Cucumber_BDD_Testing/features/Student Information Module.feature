Feature: Student Information Module

  @Regression @AG3CP-4 @Mustafa
  Scenario: Academics Module displays
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    When user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And the following modules are displayed: "Student Information", "Fees Collection" , "Income" , "Expenses" , "Academics" , "Human Resource" , "Homework" , "Reports"
    And the user clicks on the Student Information Module
    Then the following submodules are displayed: "Student Details", "Student Admission", "Disable Students", "Bulk Delete", "Student Categories", "Student House", "Disable Reason"