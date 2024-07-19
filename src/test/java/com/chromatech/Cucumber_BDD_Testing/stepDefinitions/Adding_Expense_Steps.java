package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.AddingExpensePage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.WebDriverUtils;
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
    public void user_enters_the_expense_head(String string) {
        addingExpensePage.addingExpenseHead.sendKeys(string);
        CucumberLogUtils.logScreenShot();
    }

    @Then("user enters {string} in the description box")
    public void user_enters_in_the_description_box(String string) {
        addingExpensePage.expenseHeadDescriptionBox.sendKeys(string);
        CucumberLogUtils.logScreenShot();
    }

    @Then("user clicks save")
    public void user_clicks_save() {
        addingExpensePage.expenseHeadSavebutton.click();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user clicks add expense sub module text")
    public void user_clicks_add_expense_sub_module_text() {
        addingExpensePage.addExpenseModuleText.click();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user is in the add expense page site {string}")
    public void user_is_in_the_add_expense_page_site(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        CucumberLogUtils.logScreenShot();
    }

    @Then("user select dropdown {string}")
    public void user_select_dropdown(String expenseHead) {
        CommonMethods.selectDropDownValue(expenseHead, addingExpensePage.expenseHeadSelectDropdown);

         }
}




