package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.pages.LoginPage;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class Valid_Credentials_Login_Steps {
LoginPage loginPage= new LoginPage();
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
}
