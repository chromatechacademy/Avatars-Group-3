package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Ability_To_Add_And_Delete_Sections_Steps {
    @When("the user navigates to the sections submodule")
    public void the_user_navigates_to_the_sections_submodule() {

    }
    @When("the user adds a section")
    public void the_user_adds_a_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the section is added")
    public void the_section_is_added() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user can also delete the section")
    public void the_user_can_also_delete_the_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    DashboardPage dashboardPage = new DashboardPage();

    }