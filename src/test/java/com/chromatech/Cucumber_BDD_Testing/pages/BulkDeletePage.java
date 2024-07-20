package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkDeletePage {

    /* BULK DELETE SUB MODULE SELECTOR */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteSubModule;

    /* CLASS DROP DOWN SELECTOR */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown;

    /* SECTION DROP DOWN SELECTOR */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    /* SEARCH BUTTON SELECTOR */
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

    /* DELETE BUTTON SELECTOR */
    @FindBy(xpath = "//button[normalize-space()='Delete']")
    public WebElement deleteButton;

    /**
     * Find the WebElement that represents the dynamic record locate deleter.
     *
     * @param text to be searched for in the record locator
     * @return WebElement that represents the delete record locator
     */
    public static WebElement dynamicRecordLocateDeleter(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]//ancestor::tr/td/input"));
    }

    /**
     * Find the WebElement that represents the dynamic record name locator.
     *
     * @param text the text to be searched for in the record locator
     * @return the WebElement that represents the dynamic record name locator
     */
    public static WebElement dynamicRecordNameLocator(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]/ancestor::tr/td[2]"));
    }

    public BulkDeletePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}