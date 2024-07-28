package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.ClassesPage;
import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Ability_To_Add_And_Delete_Classes_Steps {
    DashboardPage dashboardPage = new DashboardPage();
    ClassesPage classesPage = new ClassesPage();


    @When("verifies that there is no class with the name {string} in the Class submodule")
    public void verifies_that_there_is_no_class_with_the_name_in_the_class_submodule(String string) {
        dashboardPage.academicsModule.

    }
    @When("navigates to the Classes Page and adds the class {string}")
    public void navigates_to_the_classes_page_and_adds_the_class(String string) {

    }
    @When("chooses Manual Testing in the checkbox")
    public void chooses_manual_testing_in_the_checkbox() {

    }
    @When("clicks Save button")
    public void clicks_save_button() {

    }
    @When("clicks Delete button")
    public void clicks_delete_button() {

    }
    @Then("the user clicks Confirm button to delete the class Testing111")
    public void the_user_clicks_confirm_button_to_delete_the_class_testing111() {

    }


    //
//    @When("verifies that there is no class with such name {string}")
//    public void verifies_that_there_is_no_class_with_such_name(String tableRaw){
//        CommonMethods.assertEquals(classesPage.emptyTableRow.getText(), tableRaw);
//    }
//
//    @When("navigates to Classes Page and adds a class {string}")
//    public void navigates_to_classes_page_and_adds_a_class(String string) {
//        dashboardPage.academicsModule.click();
//        dashboardPage.classClassSubModule.click();
//    }
//
//    @When("chooses Manual Testing in the checkbox")
//    public void chooses_manual_testing_in_the_checkbox() {
//        //CommonMethods.assertEquals(classesPage.emptyTableRow.getText(), tableRaw);
//        //Assert.assertEquals(classesPage.emptyTableRow.getText() tableRow);
//
//    }
//
//    @When("clicks Save button")
//    public void clicks_save_button() {
//
//    }
//
//    @When("clicks Delete button")
//    public void clicks_delete_button() {
//
//    }
//
//    @Then("the user clicks Confirm button to delete the class")
//    public void the_user_clicks_confirm_button_to_delete_the_class() {
//        CommonMethods.acceptAlert();
//    }

}