package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddingExpensePage {

    // EXPENSE
    @FindBy(xpath = "//li[@class='treeview']//a[@href='#']")
    public WebElement expenseText;
    //



}
