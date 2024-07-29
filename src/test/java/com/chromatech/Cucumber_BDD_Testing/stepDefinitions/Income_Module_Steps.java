package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Income_Module_Steps extends PageInitializer {

    @When("the user clicks on the Income module")
    public void the_user_clicks_on_the_income_module() {
        dashboardPage.incomeModule.click();
    }

    @Then("the following Income submodules are displayed {string}, {string}, {string}")
    public void the_following_income_submodules_are_displayed(String addIncome, String searchIncome, String incomeHead) {
        StepsImplementation.the_following_income_submodules_are_displayed(addIncome, searchIncome, incomeHead);
    }
}