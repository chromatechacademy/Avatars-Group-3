Feature: Student Admission with Unique Admission Number

  @Regression @AG3CP-13 @Chris
  Scenario: Student Admission with Unique Admission Number
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    And user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And verifies a student with "1260225082" is not an existing student
    And verifies a sibling with "112358132134" is not an existing student
    And creates a test category "Group 3 Category"
    When a CTSMS admin or faculty member is on the student admission page "https://mexil.it/chroma/student/create"
    And creates a test sibling with admission number "112358132134", class "SDET", section "Cucumber Fundamentals", first name "Group Three Sibling", gender "Female", date of birth "03/03/1993", guardian name "Group Three Guardian", guardian phone number "3333333333"
    And adds a sibling
    And the user fills out all fields "1260225082", "237", "SDET", "Cucumber Fundamentals", "Winston", "Sir", "Male", "07/19/2010", "Group 3 Category", "shardey_uchidae@hawaiian.fpl", "05/22/1985", "O+", "02/16/2014", "1003770370", "144 cm", "44 kg", "Lewis Hamilton", "1000440440", "F1 Driver", "Logan Browning", "1000420420", "Actor", "lewis.ham@f1.email", "Constantly Road 367, Orland, Austria, 579436"
    And uploads family member photos
    And clicks the Add More Details button
    And adds Student Address Details
    And adds Miscellaneous Details "284080987", "Marcedes", "49833", "672162178", "1769990547", "Warranties Road 7692, Golden City, Indonesia, 675454", "Cheat unless familiar viking obvious significant alexander, chain clip breeding coding. "
    And uploads documents "Brother", "Sister", "Dog", "Grandmother"
    And clicks save
    And adds a sibling
    And the user fills out all fields "1260225082", "237", "SDET", "Cucumber Fundamentals", "Winston", "Sir", "Male", "07/19/2010", "Group 3 Category", "shardey_uchidae@hawaiian.fpl", "05/22/1985", "O+", "02/16/2014", "1003770370", "144 cm", "44 kg", "Lewis Hamilton", "1000440440", "F1 Driver", "Logan Browning", "1000420420", "Actor", "lewis.ham@f1.email", "Constantly Road 367, Orland, Austria, 579436"
    And uploads family member photos
    And clicks the Add More Details button
    And adds Student Address Details
    And adds Miscellaneous Details "284080987", "Marcedes", "49833", "672162178", "1769990547", "Warranties Road 7692, Golden City, Indonesia, 675454", "Cheat unless familiar viking obvious significant alexander, chain clip breeding coding. "
    And uploads documents "Brother", "Sister", "Dog", "Grandmother"
    And clicks save
    Then the user should see "The Admission No field must contain a unique value."
    Then navigate to test student "SDET", "Cucumber Fundamentals", "1260225082"
    And delete test account with "1260225082"
    And delete test sibling account with admission number "112358132134"
    And delete the test category