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

    /* SEARCH BY KEYWORD TEXT BOX */
    @FindBy(xpath = "(//input[@name='search_text'])[2]")
    public WebElement searchByKeywordTextBox;

    /* SEARCH BY KEYWORD BUTTON */
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement searchByKeywordButton;

    /**
     * Locates the dynamic admission record WebElement based on the given admission number.
     * The admission number is used to generate an XPath that searches for a table cell (td) containing
     * the admission number and following the parent chain to find the corresponding edit link.
     *
     * @param admission the admission number to search for
     * @return the WebElement representing the edit link for the admission record
     */
    public static WebElement dynamicAdmissionRecordLocator(String admission) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[contains(text(),'" + admission + "')]//parent::tr//td[11]/a[@title='Edit']"));
    }

    /* SUCCESSFUL RECORD UPDATE ALERT */
    @FindBy(xpath = "//div[@class='alert alert-success']/div[contains(text(), 'Record Update Successfully')]")
    public WebElement successfulRecordUpdateAlert;
}