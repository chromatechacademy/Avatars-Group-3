Feature: Ability To Disable Student Records

  @Progression @AG3CP-26 @Joyce
  Scenario Outline: Ability To Disable Student Records
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    And user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And user clicks the student information tab
    When user is on the student admission page "https://mexil.it/chroma/student/create"
    And the user fills out all fields "<Admission No>", "<Roll Number>", "<Class>", "<Section>", "<First Name>", "<Last Name>", "<Gender>", "<Date of Birth>", "<Category>", "<Guardian Name>", "<Guardian Phone>"
    And user clicks save button
    And Record Saved Successfully is displayed
    And user opens a student record in student details with admission number "<Admission No>"
   # And user clicks disabled students module
   # And user select the dropDown reason "TestDisableReason" "Disable Student"
   # And user is on the disabled students page "https://mexil.it/chroma/student/disablestudentslist"
   # And user selects the class dropDown "SDET" and section dropDown "Cucumber Fundamentals"
    Examples:
      | Admission No | Roll Number | Class | Section               | First Name | Last Name | Gender | Date of Birth | Category | Guardian Name | Guardian Phone |
      | 243162823940 | 3214561     | SDET  | Cucumber Fundamentals | Shawn      | David     | Male   | 01/27/1990    | Selenium | Jill Ward     | 703098765      |

