package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.DisbledStudentPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ability_To_Enable_After_Disabeling_Student_Steps {

    DisbledStudentPage disbledStudentPage = new DisbledStudentPage();

    @When("clicks on Disable Student button")
    public void clicks_on_disable_student_button() {
        disbledStudentPage.disableButton.click();
        CommonMethods.acceptAlert();
        CommonMethods.selectDropDownValue(disbledStudentPage.reasonDropdown, "Loud behavior");
        CommonMethods.waitForVisibility(disbledStudentPage.submitButton);
        disbledStudentPage.submitButton.click();
    }
}