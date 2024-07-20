package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Homework_Module_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user clicks on the Homework module")
    public void the_user_clicks_on_the_homework_module() {
        dashboardPage.homeworkModule.click();
    }

    @Then("the Homework module displays")
    public void the_homework_module_displays() {
        CucumberLogUtils.logScreenShot();
        Assert.assertTrue(dashboardPage.addHomeworkSubModule.isDisplayed());
    }

    @Then("the Add Homework module displays")
    public void the_add_homework_module_displays() {
        CucumberLogUtils.logScreenShot();
        Assert.assertTrue(dashboardPage.addHomeworkSubModule.isDisplayed());
    }
}