package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class AbilityToDisableStudentRecordPage {
    public AbilityToDisableStudentRecordPage() {
        PageFactory.initElements(driver, this);
    }

    /*RECORD SAVED SUCCESSFULLY*/
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement recordSavedSuccess;

    /*USER CLICKS THE DISABLED STUDENTS SUB MODULE*/
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudentSubModule;

    /*STUDENT NAME RESULT*/
    @FindBy(xpath = "//tr[@role='row']//a[contains(text(),'Shawn David')]")
    public WebElement studentResult;

    /*DISABLE SIGN*/
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-down']")
    public WebElement disableSign;

    /*REASON TO DISABLE*/
    @FindBy(xpath = "//select[@name='reason']")
    public WebElement reasonDropDown;

    /*COMMENT BOX*/
    @FindBy(xpath = "//textarea[@name='note']")
    public WebElement comment;

    /*SAVE BUTTON FOR DISABLE POP OUT*/
    @FindBy(xpath = "//button[@data-loading-text=\"<i class='fa fa-spinner fa-spin '></i> Please wait\"]")
    public WebElement reasonSaveButton;

    /*DISABLED SUB MODULE*/
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement searchByKeyword;

    /*SEARCH BY KEYWORD*/
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement searchButton;

    /*RESULT NAME*/
    @FindBy(xpath = "//tr[@role='row']//a[contains(text(),'Shawn David')]")
    public WebElement resultName;

    /*ENABLE STUDENT*/
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-up']")
    public WebElement enableThumbsUp;

    /*BULK DELETE RESULT NAME*/
    @FindBy(xpath = "//td[normalize-space()='243162823940']/ancestor::tr")
    public WebElement admissionNoDelete;
}
