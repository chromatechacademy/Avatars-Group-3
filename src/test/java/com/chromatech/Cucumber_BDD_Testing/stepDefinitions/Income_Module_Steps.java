package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Income_Module_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks on the Income module")
    public void the_user_clicks_on_the_income_module() {
        dashboardPage.incomeModule.click();
    }

    @Then("the following Income submodules are displayed {string}, {string}, {string}")
    public void the_following_income_submodules_are_displayed(String addIncome, String searchIncome, String incomeHead) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(dashboardPage.addIncomeSubModule.getText(), addIncome);
        CommonMethods.assertEquals(dashboardPage.searchIncomeSubModule.getText(), searchIncome);
        CommonMethods.assertEquals(dashboardPage.incomeHeadSubModule.getText(), incomeHead);
    }
}