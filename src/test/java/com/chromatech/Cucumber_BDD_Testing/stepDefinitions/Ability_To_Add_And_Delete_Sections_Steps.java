package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ability_To_Add_And_Delete_Sections_Steps extends PageInitializer {

    @When("the user navigates to the sections submodule")
    public void the_user_navigates_to_the_sections_submodule() {
        dashboardPage.sectionsSubModule.click();
    }

    @And("the user adds a section")
    public static void the_user_adds_a_section() {
        StepsImplementation.the_user_adds_a_section();
    }

    @Then("the section is added {string}")
    public void the_section_is_added(String testingMD) {
    }

    @And("the user can also delete the section")
    public static void the_user_can_also_delete_the_section() {
        StepsImplementation.the_user_adds_a_section();
    }
}