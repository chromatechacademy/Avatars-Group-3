package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentAdmissionPage {

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNoTextBox;

    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumberTextBox;

    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    @FindBy(xpath = "//select[@id='section_id']" )
    public WebElement sectionDropDown;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//select[@name='gender']" )
    public WebElement genderDropDown;

    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthTextBox;

//    @FindBy(xpath = "//input[@id='roll_no']")
//    WebElement rollNumberTextBox;
//
//    @FindBy(xpath = "//input[@id='roll_no']")
//    WebElement rollNumberTextBox;
//
//    @FindBy(xpath = "//input[@id='roll_no']")
//    WebElement rollNumberTextBox;

}
