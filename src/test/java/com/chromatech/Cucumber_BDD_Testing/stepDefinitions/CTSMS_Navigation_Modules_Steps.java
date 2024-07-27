package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;

public class CTSMS_Navigation_Modules_Steps extends PageInitializer {

    @Then("the following modules are displayed: {string}, {string} , {string} , {string} , {string} , {string} , {string} , {string}")
    public void the_following_modules_are_displayed(String studentInformation, String feesCollection, String Income, String expenses, String academics, String humanResource, String homework, String reports) {
        CommonMethods.assertEquals(dashboardPage.studentInformationModule.getText(), studentInformation);
        CommonMethods.assertEquals(dashboardPage.feesCollectionModule.getText(), feesCollection);
        CommonMethods.assertEquals(dashboardPage.incomeModule.getText(), Income);
        CommonMethods.assertEquals(dashboardPage.expensesModule.getText(), expenses);
        CommonMethods.assertEquals(dashboardPage.academicsModule.getText(), academics);
        CommonMethods.assertEquals(dashboardPage.humanResourceModule.getText(), humanResource);
        CommonMethods.assertEquals(dashboardPage.homeworkModule.getText(), homework);
        CommonMethods.assertEquals(dashboardPage.reportsModule.getText(), reports);
    }
}