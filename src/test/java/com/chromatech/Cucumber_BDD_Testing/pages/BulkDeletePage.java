package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkDeletePage {

    /* BULK DELETE SUB MODULE */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteSubModule;

    /* CLASS DROPDOWN SELECTOR */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown;

    /* SECTION DROPDOWN SELECTOR */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    /* SEARCH BUTTON */
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

    /* DELETE BUTTON */
    @FindBy(xpath = "//button[normalize-space()='Delete']")
    public WebElement deleteButton;

    /* DYNAMIC RECORD LOCATE DELETER */
    public static WebElement dynamicRecordLocateDeleter(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]//ancestor::tr/td/input"));
    }

    /* DYNAMIC RECORD NAME LOCATOR */
    public static WebElement dynamicRecordNameLocator(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]/ancestor::tr/td[2]"));
    }

    public BulkDeletePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
