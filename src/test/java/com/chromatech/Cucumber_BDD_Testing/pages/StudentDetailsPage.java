package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentDetailsPage {

    public StudentDetailsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /* Search By Keyword Text Box */
    @FindBy(xpath = "(//input[@name='search_text'])[2]")
    public WebElement searchByKeywordTextBox;

    /* Search By Keyword Button */
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement searchByKeywordButton;

    /* Dynamic Record Admission Number Edit Button Locator */
    public static WebElement dynamicAdmissionRecordLocator(String admission) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[contains(text(),'" + admission + "')]//parent::tr//td[11]/a[@title='Edit']"));
    }

    /* Successful Record Update Alert */
    @FindBy(xpath = "//div[@class='alert alert-success']/div[contains(text(), 'Record Update Successfully')]")
    public WebElement successfulRecordUpdateAlert;
}