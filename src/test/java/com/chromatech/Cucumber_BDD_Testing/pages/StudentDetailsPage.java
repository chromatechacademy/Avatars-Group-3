package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    /**
     * Locates the dynamic admission record WebElement based on the given admission number.
     * The admission number is used to generate an XPath that searches for a table cell (td) containing
     * the admission number and following the parent chain to find the corresponding edit link.
     *
     * @param admission the admission number to search for
     * @return the WebElement representing the edit link for the admission record
     */
    public static WebElement dynamicAdmissionRecordLocator(String admission) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[contains(text(),'" + admission + "')]//parent::tr//td[2]/a"));
    }

    /* Successful Record Update Alert */
    @FindBy(xpath = "//div[@class='alert alert-success']/div[contains(text(), 'Record Update Successfully')]")
    public WebElement successfulRecordUpdateAlert;

    /**
     * Locates the dynamic name record WebElement based on the given student name.
     *
     * @param studentName the student name to search for
     * @return the WebElement representing the name record
     */
    public static WebElement dynamicNameRecordLocator(String studentName) {
        return WebDriverUtils.driver.findElement(By.xpath("//h3[@class='profile-username text-center'][normalize-space()='" + studentName + "']"));
    }

    @FindBy(xpath = "//a[normalize-space()='3333333']")
    public WebElement admissionNo;

    @FindBy(xpath = "//a[normalize-space()='SDET (2020-21)']")
    public WebElement classOption;

    @FindBy(xpath = "//a[@class='pull-right text-aqua'][normalize-space()='Cucumber Fundamentals']")
    public WebElement sectionOption;

    @FindBy(xpath = "//div[@class='col-md-3']//li[1]")
    public WebElement rteValue;

    @FindBy(xpath = "//a[normalize-space()='Female']")
    public WebElement gender;

    @FindBy(xpath = "//td[normalize-space()='07/03/2024']")
    public WebElement admissionDate;

    @FindBy(xpath = "//td[normalize-space()='07/24/2024']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//td[normalize-space()='Threei']")
    public WebElement guardianName;

    @FindBy(xpath = "//td[normalize-space()='Father']")
    public WebElement guardianRelation;

    @FindBy(xpath = "//td[normalize-space()='3333333333']")
    public WebElement guardianPhone;

    @FindBy(xpath = "//td[normalize-space()='07/22/2024']")
    public WebElement asOnDate;
}