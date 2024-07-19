package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;

public class CTSMS_Navigation_Modules_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the following modules are displayed: {string}, {string} , {string} , {string} , {string} ,  {string} , {string} , {string}")
    public void the_following_modules_are_displayed(String studentInformation, String feesCollection, String income, String expenses, String academics, String humanResource, String homework, String reports) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertTrue(dashboardPage.studentInformationModule.isDisplayed());
        CommonMethods.assertTrue(dashboardPage.feesCollectionModule.isDisplayed());
        CommonMethods.assertTrue(dashboardPage.reportsModule.isDisplayed());
        CommonMethods.assertTrue(dashboardPage.expensesModule.isDisplayed());
        CommonMethods.assertTrue(dashboardPage.academicsModule.isDisplayed());
        CommonMethods.assertTrue(dashboardPage.homeworkModule.isDisplayed());
    }
}