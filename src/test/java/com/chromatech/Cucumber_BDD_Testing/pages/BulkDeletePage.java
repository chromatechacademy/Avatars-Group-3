package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkDeletePage {

    /* Bulk Delete Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteSubModule;

    /* Class Dropdown Selector */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown;

    /* Section Dropdown Selector */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    /* Search Button */
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

    /* Delete Button */
    @FindBy(xpath = "//button[normalize-space()='Delete']")
    public WebElement deleteButton;

    /* Dynamic Record Locate Deleter */
    public static WebElement dynamicRecordLocateDeleter(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]//ancestor::tr/td/input"));
    }

    /* Dynamic Record Name Locator */
    public static WebElement dynamicRecordNameLocator(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]/ancestor::tr/td[2]"));
    }

    public BulkDeletePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}