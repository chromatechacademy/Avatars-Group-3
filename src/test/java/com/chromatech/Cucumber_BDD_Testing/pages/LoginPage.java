package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /**
     * Represents the username text box on the login page.
     */
    @FindBy(xpath = "//input[@id='form-username']")
    public WebElement usernameTextBox;
    /**
     * Represents the password text box on the login page.
     * Used by the LoginPage class.
     */
    @FindBy(xpath = "//input[@id='form-password']")
    public WebElement passwordTextBox;
    /**
     * Represents the Sign In button on the login page.
     * Used by the LoginPage class.
     */
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

}