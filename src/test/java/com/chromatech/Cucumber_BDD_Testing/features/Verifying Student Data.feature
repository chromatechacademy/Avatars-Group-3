Feature: Verifying Student Data

  @InProgress @Kei @AG3CP-27
  Scenario: Student Data Displays as Expected
    Given a student has been admitted
    When an admin navigates to a student record
    Then all data submitted with the record should display as expected