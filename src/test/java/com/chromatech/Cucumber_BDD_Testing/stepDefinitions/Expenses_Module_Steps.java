package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Expenses_Module_Steps extends PageInitializer {

    @When("the user clicks on the Expenses module")
    public void the_user_clicks_on_the_expenses_module() {
        dashboardPage.expensesModule.click();
    }

    @Then("the following submodules are displayed {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String addExpense, String searchExpense, String expenseHead) {
        StepsImplementation.the_following_submodules_are_displayed(addExpense, searchExpense, expenseHead);
    }
}