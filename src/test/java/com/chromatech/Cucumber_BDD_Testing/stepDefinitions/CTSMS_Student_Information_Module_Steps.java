package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.chromatech.utils.CommonMethods.assertEquals;

public class CTSMS_Student_Information_Module_Steps extends PageInitializer {

    @When("the user clicks on the Student Information Module")
    public void the_user_clicks_on_the_student_information_module() {
        dashboardPage.studentInformationModule.click();
    }

    @Then("the following submodules are displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String studentDetails, String studentAdmission, String disabledStudents, String bulkDelete, String studentCategories, String studentHouse, String disableReason) {
        assertEquals(studentDetails, dashboardPage.studentDetailsSubModule.getText());
        assertEquals(studentAdmission, dashboardPage.studentAdmissionSubModule.getText());
        assertEquals(disabledStudents, dashboardPage.disabledStudentsSubModule.getText());
        assertEquals(bulkDelete, dashboardPage.bulkDeleteSubModule.getText());
        assertEquals(studentCategories, dashboardPage.studentCategoriesSubModule.getText());
        assertEquals(studentHouse, dashboardPage.studentHouseSubModule.getText());
        assertEquals(disableReason, dashboardPage.disableReasonSubModule.getText());
    }
}