Feature: Student Admission

  @Regression @AG3CP-28 @Joyce
  Scenario:Adding Expense
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    When user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    Then user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user clicks the expense module text
    And  user clicks expense head module
    Then user enters the expense head "TEST AG3CP-28"
    And  user enters "TEST AG3CP-28" in the description box
    And user clicks save
    Then user clicks add expense sub module text
    And user is in the add expense page site "https://mexil.it/chroma/admin/expense"
    And user select dropdown "Expense Head"
    And user enters the add expense name "Joyce"
    And user enters the invoice number "98756"
    And user enters the amount "10000"
    And user enters the add expense description "PO"
    Then user clicks save in add expense page



