package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.LoginPage;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Restrictions_To_Login_With_Invalid_Credentials_Steps {

    LoginPage loginPage = new LoginPage();

    @When("user enters invalid username {string} in username text box")
    public void user_enters_invalid_username_in_username_text_box(String invalidUsername) {
        loginPage.usernameTextBox.sendKeys(invalidUsername);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters invalid password {string} in password text box")
    public void enters_invalid_password_in_password_text_box(String invalidPassword) {
        loginPage.passwordTextBox.sendKeys(invalidPassword);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the user should see an error message")
    public void the_user_should_see_an_error_message() {
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
        CucumberLogUtils.logScreenShot();
    }
}