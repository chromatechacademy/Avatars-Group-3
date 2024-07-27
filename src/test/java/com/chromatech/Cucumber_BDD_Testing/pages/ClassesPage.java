package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassesPage {

    public ClassesPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    @FindBy(xpath = "//input[@id='class']")
    public WebElement classNameTextBox;

    @FindBy (xpath ="//input[@value='229']")
    public WebElement manualTestindDropDownButton;

    @FindBy (xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy (xpath ="//body[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/a[2]")
    public WebElement deleteClassButton;

    /* CLASSES TABLE */
    @FindBy(xpath = "//table[@role='grid']")
    public WebElement classesTable;

}