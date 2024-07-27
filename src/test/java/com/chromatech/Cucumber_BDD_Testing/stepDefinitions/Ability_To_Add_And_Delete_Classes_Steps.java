package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.ClassesPage;
import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ability_To_Add_And_Delete_Classes_Steps {
    DashboardPage dashboardPage = new DashboardPage();
    ClassesPage classesPage = new ClassesPage();

    @When("navigates to Classes Page and adds a class {string}")
    public void navigates_to_classes_page_and_adds_a_class(String string) {
        dashboardPage.academicsModule.click();
        dashboardPage.classClassSubModule.click();
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

    @Then("the user clicks Confirm button to delete the class")
    public void the_user_clicks_confirm_button_to_delete_the_class() {

    }

}
