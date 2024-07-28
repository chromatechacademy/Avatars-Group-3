package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.ClassesPage;
import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Ability_To_Add_And_Delete_Classes_Steps {

    DashboardPage dashboardPage = new DashboardPage();
    ClassesPage classesPage = new ClassesPage();

    @When("verifies that there is no class with the name {string} in the Class submodule")
    public void verifies_that_there_is_no_class_with_the_name_in_the_class_submodule(String className) {
        dashboardPage.academicsModule.click();
        dashboardPage.classClassSubModule.click();
        classesPage.searchClassTextBox.sendKeys(className);
        CucumberLogUtils.logScreenShot();
        Assert.assertTrue(classesPage.emptyTableRow.isDisplayed());
    }

    @When("navigates to the Classes Page and adds the class {string}")
    public void navigates_to_the_classes_page_and_adds_the_class(String className) {
        classesPage.classNameTextBox.sendKeys(className);
    }

    @When("chooses Manual Testing in the checkbox")
    public void chooses_manual_testing_in_the_checkbox() {
        classesPage.manualTestingDropDownCheckBox.click();
    }

    @When("clicks Save button")
    public void clicks_save_button() {
        classesPage.saveButton.click();
    }

    @When("clicks Delete button")
    public void clicks_delete_button() {
        classesPage.deleteClassButton.click();
        CommonMethods.acceptAlert();
    }
}