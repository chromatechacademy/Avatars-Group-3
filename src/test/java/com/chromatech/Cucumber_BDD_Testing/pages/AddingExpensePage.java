package com.chromatech.Cucumber_BDD_Testing.pages;


import com.chromatech.utils.WebDriverUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingExpensePage {
    public AddingExpensePage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
  //CLICKING EXPENSE TEXT
    @FindBy(xpath = "//span[contains(text(),'Expenses')]")
    public WebElement expenseModuleText;
   //CLICKING EXPENSES HEAD TO ADD AN EXPENSE HEAD
   @FindBy(xpath = "//a[normalize-space()='Expense Head']")
    public WebElement addingExpenseHead;
   //ENTERS "INVOICE" IN THE DESCRIPTION BOX
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement expenseHeadDescriptionBox;
    //EXPENSE HEAD BUTTON
    @FindBy(xpath ="//textarea[@id='description']")
    public WebElement expenseHeadSavebutton;
    //CLICKING ADD EXPENSE MODULE TEXT
    @FindBy(xpath = "(//a[normalize-space()='Add Expense'])[2]")
    public WebElement addExpenseModuleText;
  //SELECT EXPENSE HEAD
    @FindBy(xpath = "//a[normalize-space()='Expense Head']")
   public WebElement expenseHeadModule;
  // CLICKING ADD EXPENSE MODULE TEXT
    @FindBy(xpath = "//select[@id='exp_head_id']")
    public WebElement expenseHeadSelectDropdown;

}

