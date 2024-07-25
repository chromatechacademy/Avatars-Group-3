package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

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

    /*POP OUT*/
 //   @FindBy(xpath = "//*[@id=\"disable_modal\"]/div/div")
 //   public WebElement disableStudentPopOut;

    /*REASON TO DISABLE*/
    @FindBy(xpath = "//select[@name='reason']")
    public WebElement reasonDropDown;

    /*SAVE BUTTON FOR DISABLE POP OUT*/
    @FindBy(xpath = "//button[@data-loading-text=\"<i class='fa fa-spinner fa-spin '></i> Please wait\"]")
    public WebElement reasonSaveButton;

    @FindBy(id ="disable_modal" )
    public WebElement disableModal;


}
