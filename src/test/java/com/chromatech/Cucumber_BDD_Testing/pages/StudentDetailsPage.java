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

    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classIDDropDown;

    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionIDDropDown;

    @FindBy(xpath = "//name[@class='search_text']")
    public WebElement searchByKeywordTextBox;

    public static WebElement dynamicRecordLocator(String text){
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'"+ text + "')]//parent::tr/td/input"));
    }
}
