package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {

    public CategoryPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /* Student Categories Sub Module  */
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studentCategories;

    /* Category Text Box */
    @FindBy(xpath = "//input[@id='category']")
    public WebElement categoryTextBox;

    /* Category Save Button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement categorySaveButton;

    /* Group 3 Category */
    @FindBy(xpath = "//td[normalize-space()='Group 3 Category']")
    public WebElement categoryGroup3;

    /* Group 3 Category Delete Button */
    @FindBy(xpath = "//td[normalize-space()='Group 3 Category']/parent::tr/td[3]/a[2]")
    public WebElement group3Delete;
}