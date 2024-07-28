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
    public WebElement manualTestingDropDownButton;

    @FindBy (xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /*EMPTY TABLE ROW*/
    @FindBy(xpath = "//td[@class='dataTables_empty']")
    public WebElement emptyTableRow;

    /*SEARCH CLASS TEXTBOX*/
    @FindBy(xpath =" //input[@placeholder='Search...']")
    public WebElement searchClassTextBox;

    /*DELETE NEW CLASS BUTTON*/
    @FindBy(xpath="//tbody/tr[1]/td[3]/a[2]")
    public WebElement deleteClassButton;

    /* CLASSES TABLE */
    @FindBy(xpath = "//table[@role='grid']")
    public WebElement classesTable;

}