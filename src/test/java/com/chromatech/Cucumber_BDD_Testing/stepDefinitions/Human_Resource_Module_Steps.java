package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.ExpenseModules;
import com.chromatech.Cucumber_BDD_Testing.pages.LoginPage;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Human_Resource_Module_Steps {

    ExpenseModules expenseModules = new ExpenseModules();
    LoginPage loginPage = new LoginPage();

    @Given("a user is on the Chroma Tech Academy practice site {string}")
    public void a_user_is_on_the_chroma_tech_academy_practice_site(String url) {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logScreenShot();
    }

    @When("user enters username {string} in username text box")
    public void user_enters_username_in_username_text_box(String username) {
        loginPage.usernameTextBox.sendKeys(username);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters password {string} in password text box")
    public void enters_password_in_password_text_box(String password) {
        loginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on Sign In button")
    public void clicks_on_sign_in_button() {
        loginPage.signInButton.click();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user is directed to the CTSMS dashboard page {string}")
    public void user_is_directed_to_the_ctsms_dashboard_page(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        CucumberLogUtils.logScreenShot();
    }


    @When("the user clicks on the Human Resource module")
    public void the_user_clicks_on_the_human_resource_module() {
        expenseModules.humanResourceModule.click();
        CucumberLogUtils.logScreenShot();

    }
    @Then("the following submodules are displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String staffDirectory, String staffAttendance, String payRoll, String aproveLeaveRequest, String applyLeave, String leaveType, String string7, String string8, String string9) {

    }
}
