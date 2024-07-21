package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.AddingExpensePage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Adding_Expense_Steps {

    AddingExpensePage addingExpensePage = new AddingExpensePage();

    @Given("the user is in the dashboard page {string}")
    public void the_user_is_in_the_dashboard_page(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        CucumberLogUtils.logScreenShot();
    }

    @When("user clicks the expense module text")
    public void user_clicks_the_expense_module_text() {
        addingExpensePage.expenseModuleText.click();
        CucumberLogUtils.logScreenShot();
    }

    @When("user clicks expense head module")
    public void user_clicks_expense_head_module() {
        addingExpensePage.addingExpenseHead.click();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user enters the expense head {string}")
    public void user_enters_the_expense_head(String expenseHeadText) {
        addingExpensePage.expenseHeadBox.sendKeys(expenseHeadText);
        CucumberLogUtils.logScreenShot();
    }

    @Then("user enters {string} in the description box")
    public void user_enters_in_the_description_box(String expenseHeadDescription) {
        addingExpensePage.expenseHeadDescriptionBox.sendKeys(expenseHeadDescription);
        CucumberLogUtils.logScreenShot();
    }

    @Then("user clicks save")
    public void user_clicks_save() throws InterruptedException {
        addingExpensePage.expenseHeadSavebutton.click();
        Thread.sleep(3000);
        CucumberLogUtils.logScreenShot();
    }

    @Then("user clicks add expense sub module text")
    public void user_clicks_add_expense_sub_module_text() {
        addingExpensePage.addExpenseModuleText.click();
        CucumberLogUtils.logScreenShot();
    }

    @And("user navigates on the add expense page site {string}")
    public void user_navigates_on_the_add_expense_page_site(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        CucumberLogUtils.logScreenShot();
    }

    @And("user select dropdown {string}")
    public void user_select_dropdown(String expenseHead) {
        CommonMethods.selectDropDownValue("TEST AG3CP-28", addingExpensePage.expenseHeadSelectDropdown);
        CucumberLogUtils.logScreenShot();
    }

    @And("user enters the add expense name {string}")
    public void user_enters_the_add_expense_name(String name) {
        addingExpensePage.expenseNameBox.sendKeys(name);
        CucumberLogUtils.logScreenShot();
    }

    @And("user enters the invoice number {string}")
    public void user_enters_the_invoice_number(String invoiceNumber) {
        addingExpensePage.expenseInvoiceNumberBox.sendKeys(invoiceNumber);
        CucumberLogUtils.logScreenShot();
    }

    @And("user enters the amount {string}")
    public void user_enters_the_amount(String amount) {
        addingExpensePage.expenseAmount.sendKeys(amount);
        CucumberLogUtils.logScreenShot();
    }

    @Then("user enters the add expense description {string}")
    public void user_enters_the_add_expense_description(String expenseDescription) {
        addingExpensePage.expenseDescriptionBox.sendKeys(expenseDescription);
        CucumberLogUtils.logScreenShot();
    }

    @And("user clicks save in add expense page")
    public void user_clicks_save_in_add_expense_page() {
        addingExpensePage.expenseSaveButton.click();
        CucumberLogUtils.logScreenShot();
    }

    @And("user clicks the search expense page to search for the expense")
    public void user_clicks_the_search_expense_page_to_search_for_the_expense() {
        addingExpensePage.searchExpensePageButton.click();
        CucumberLogUtils.logScreenShot();
    }

    @And("the user is the directed to the CTMS search page {string}")
    public void the_user_is_the_directed_to_the_ctms_search_page(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        CucumberLogUtils.logScreenShot();
    }

    @And("user user enters the name in the expense list {string}")
    public void user_user_enters_the_name_in_the_expense_list(String expenseListName) {
        addingExpensePage.searchExpenseBox.sendKeys(expenseListName);
        CucumberLogUtils.logScreenShot();
    }

    @And("user clicks the search button in the search expenses")
    public void user_clicks_the_search_button_in_the_search_expenses() {
        addingExpensePage.searchExpenseSearchButton.click();
        CucumberLogUtils.logScreenShot();
    }

    @And("the following expense result name {string}, invoice number, expense head, date, amount")
    public void the_following_expense_result_name_invoice_number_expense_head_date_amount(String name) {
        Assert.assertEquals(addingExpensePage.searchExpenseResult.getText(),addingExpensePage.searchExpenseResult.getText());
        CucumberLogUtils.logScreenShot();
    }

    @And("user clicks add expense to delete the expense")
    public void user_clicks_add_expense_to_delete_the_expense() {
        addingExpensePage.addExpenseModuleText.click();
        CucumberLogUtils.logScreenShot();
    }

    @Then("delete the expense list is displayed name, invoice number, expense head, date, amount")
    public void delete_the_expense_list_is_displayed_name_invoice_number_expense_head_date_amount() {
        addingExpensePage.deleteExpense.click();
        CommonMethods.acceptAlert();
        CucumberLogUtils.logScreenShot();
    }


}












