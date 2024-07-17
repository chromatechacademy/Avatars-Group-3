package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseModules {

    public ExpenseModules (){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /**
     * Represents the Human Resource module WebElement on the login page.
     */
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;
}


