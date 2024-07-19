package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.LoginPage;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Human_Resource_Module_Steps {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @When("the user clicks on the Human Resource module")
    public void the_user_clicks_on_the_human_resource_module() {
        dashboardPage.humanResourceModule.click();
    }

    @Then("the following submodules are displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String staffDirectory, String staffAttendance, String payRoll, String approveLeaveRequest, String applyLeave, String leaveType, String teachersRating, String department, String designation) {
        CucumberLogUtils.logScreenShot();
        Assert.assertTrue(dashboardPage.staffDirectorySubModule.isDisplayed());
        Assert.assertTrue(dashboardPage.staffAttendanceSubModule.isDisplayed());
        Assert.assertTrue(dashboardPage.payrollSubModule.isDisplayed());
        Assert.assertTrue(dashboardPage.approveLeaveRequestSubModule.isDisplayed());
        Assert.assertTrue(dashboardPage.applyLeaveSubModule.isDisplayed());
        Assert.assertTrue(dashboardPage.leaveTypeSubModule.isDisplayed());
        Assert.assertTrue(dashboardPage.teachersRatingSubModule.isDisplayed());
        Assert.assertTrue(dashboardPage.departmentSubModule.isDisplayed());
        Assert.assertTrue(dashboardPage.designationSubModule.isDisplayed());
    }
}