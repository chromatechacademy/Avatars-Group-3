Feature: Class and Sections

  @Regression @Chris @AGP3CP-11
  Scenario: Verify classes and sections displayed
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    And user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user navigates to the Class submodule
    Then there are two classes, SDET and Cyber Security displayed with the following sections:
      | Class          | Sections                                                                                                                                                                                                                                                     |
      | Cyber Security | SDLC Methodologies, Selenium Test Automation, API Testing, Git/GitHub, Java 11 for Cool People, Mobile Test Automation, Accessibility Testing, Database Testing, Networking Fundamentals, Linux Fundamentals, CIA Triad, Penetration Testing/Ethical Hacking |
      | SDET           | Cucumber Fundamentals                                                                                                                                                                                                                                        |