package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.LoginPage;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Expenses_Module_Steps {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks on the Expenses module")
    public void the_user_clicks_on_the_expenses_module() {
        dashboardPage.expensesModule.click();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the following submodules are displayed {string},{string}, {string}")
    public void the_following_submodules_are_displayed(String addExpenseSubModule, String searchExpenseSubModule, String expenseHeadSubModule) {
        Assert.assertTrue(dashboardPage.addExpenseSubModule.isDisplayed());
        Assert.assertTrue(dashboardPage.searchExpenseSubModule.isDisplayed());
        Assert.assertTrue(dashboardPage.expenseHeadSubModule.isDisplayed());
        CucumberLogUtils.logScreenShot();

    }
}

