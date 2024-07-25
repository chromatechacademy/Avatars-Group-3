package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DisabledStudentPage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentDetailsPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.When;

public class Ability_To_Enable_After_Disabeling_Student_Steps {

    DisabledStudentPage disabledStudentPage = new DisabledStudentPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();

    @When("clicks on Disable Student button")
    public void clicks_on_disable_student_button() {
        CommonMethods.sleep(5000);
        disabledStudentPage.disableButton.click();
        CommonMethods.acceptAlert();
        CommonMethods.sleep(5000);
        CommonMethods.waitForVisibility(disabledStudentPage.reasonDropdown);
        CommonMethods.selectDropDownValue(disabledStudentPage.reasonDropdown, "Very Loud");
        disabledStudentPage.commentInput.sendKeys("Very Loud");
        disabledStudentPage.submitButton.click();
    }
}