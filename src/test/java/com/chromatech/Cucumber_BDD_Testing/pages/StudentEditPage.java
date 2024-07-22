package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentEditPage {

    public StudentEditPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /* Email Text Box */
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    /* Guardian Phone Number Text Box */
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneNumberTextBox;

    /* Save Button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* Edit Button */
    @FindBy(xpath = "//a[contains(@href, 'student/edit')]")
    public WebElement editButton;
}