package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.beust.ah.A;
import com.chromatech.Cucumber_BDD_Testing.pages.AddingExpensePage;
import com.chromatech.Cucumber_BDD_Testing.pages.LoginPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Adding_Expense_Steps {

    AddingExpensePage addingExpensePage = new AddingExpensePage();

    @Given("the user is in the dashboard page {string}")
    public void the_user_is_in_the_dashboard_page(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @When("user clicks the expense text")
    public void user_clicks_the_expense_text() {
        addingExpensePage.expenseText.click();
    }

}





