package com.chromatech.Cucumber_BDD_Testing.pages;


import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingExpensePage {
    public AddingExpensePage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
  //CLICKING EXPENSE TEXT
    @FindBy(xpath = "//span[contains(text(),'Expenses')]")
    public WebElement expenseText;

}
