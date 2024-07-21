package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CTSMS_Navigation_Modules_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the following modules are displayed: {string}, {string} , {string} , {string} , {string} , {string} , {string} , {string}")
    public void the_following_modules_are_displayed(String studentInformation, String feesCollection, String Income, String expenses, String academics, String humanResource, String homework, String reports) {
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logScreenShot();
        Assert.assertEquals(dashboardPage.studentInformationModule.getText(), studentInformation);
        Assert.assertEquals(dashboardPage.feesCollectionModule.getText(), feesCollection);
        Assert.assertEquals(dashboardPage.incomeModule.getText(), Income);
        Assert.assertEquals(dashboardPage.expensesModule.getText(), expenses);
        Assert.assertEquals(dashboardPage.academicsModule.getText(), academics);
        Assert.assertEquals(dashboardPage.humanResourceModule.getText(), humanResource);
        Assert.assertEquals(dashboardPage.homeworkModule.getText(), homework);
        Assert.assertEquals(dashboardPage.reportsModule.getText(), reports);

    }
}