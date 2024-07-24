package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.AddExpenseAndRemovePage;
import com.chromatech.Cucumber_BDD_Testing.pages.AddingExpensePage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Add_Expense_Head_And_Remove_Steps {

        AddingExpensePage addingExpensePage = new AddingExpensePage();
        AddExpenseAndRemovePage addExpenseAndRemovePage = new AddExpenseAndRemovePage();

    @When("user enters the expense head in expense head page {string}")
    public void user_enters_the_expense_head_in_expense_head_page(String expenseHead) {
        addingExpensePage.expenseHeadBox.sendKeys(expenseHead);
    }
    @When("user enters {string} in the description")
    public void user_enters_in_the_description(String description) {
        addingExpensePage.expenseHeadDescriptionBox.sendKeys(description);
    }

    @When("the {string} is showed")
    public void the_is_showed(String text) {
        CommonMethods.isElementDisplayed(addExpenseAndRemovePage.alertSuccessText);
    }

    @And("expense head displayed in the list and able to delete it")
    public void expense_head_displayed_in_the_list_and_able_to_delete_it() {
        JavascriptMethods.scrollIntoView(addExpenseAndRemovePage.alertSuccessText);
        CommonMethods.isElementDisplayed(addExpenseAndRemovePage.expenseHeadResult);
        addExpenseAndRemovePage.deleteSign.click();
        CommonMethods.sleep(100);
        CommonMethods.acceptAlert();
    }
}
