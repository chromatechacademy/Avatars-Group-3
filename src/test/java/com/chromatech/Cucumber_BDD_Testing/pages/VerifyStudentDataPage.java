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


}
