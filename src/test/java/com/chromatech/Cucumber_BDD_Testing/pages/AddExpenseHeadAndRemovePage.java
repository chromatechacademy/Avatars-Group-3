package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddExpenseHeadAndRemovePage extends PageInitializer {

    public AddExpenseHeadAndRemovePage () {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /* AlERT SUCCESS TEXT*/
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement alertSuccessText;

    /*EXPENSE HEAD*/
    @FindBy(xpath = "//a[normalize-space()='Test @AGCP-26']//ancestor::tr")
    public WebElement expenseHeadResult;

    /*EXPENSE HEAD DELETE SIGN*/
    @FindBy(xpath = "(//i[@class='fa fa-remove'])[21]")
    public WebElement deleteSign;
}


