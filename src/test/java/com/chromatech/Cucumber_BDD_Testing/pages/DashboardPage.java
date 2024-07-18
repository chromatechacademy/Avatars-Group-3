package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /**
     * Represents the expensesModule WebElement on the DashboardPage.
     */
    @FindBy(xpath = "//span[normalize-space()='Expenses']")
    public WebElement expensesModule;

    /**
     * Represents the addExpenseSubModule WebElement on the DashboardPage.
     */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Add Expense']")
    public WebElement addExpenseSubModule;

    /**
     * Represents the searchExpenseSubModule WebElement on the DashboardPage.
     */
    @FindBy(xpath = "//a[normalize-space()='Search Expense']")
    public WebElement searchExpenseSubModule;

    /**
     * Represents the expenseHeadSubModule WebElement on the DashboardPage.
     */
    @FindBy(xpath = "//a[normalize-space()='Expense Head']")
    public WebElement expenseHeadSubModule;
}