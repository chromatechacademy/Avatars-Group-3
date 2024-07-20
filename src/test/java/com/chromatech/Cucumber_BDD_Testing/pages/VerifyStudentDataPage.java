package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyStudentDataPage {
    public VerifyStudentDataPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    //THE USER CLICKS ON THE STUDENT INFORMATION
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformation;

    //THE USER CLICKS ON STUDENT ADMISSION
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmission;

    //THE USER ENTERS THE ADMISSION NUMBER
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumber;

    //ENTERS THE ROLL NUMBER
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumber;

    //SELECT DROPDOWN
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement selectCLassDropdown;

    //SELECT SECTION
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement selectSectionDropdown;

    //ENTERS FIRST NAME
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;

    //ENTERS LAST NAME
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;
}
