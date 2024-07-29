package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Ability_To_Disable_Student_Record_Steps extends PageInitializer {

    @And("user clicks the student information tab")
    public void user_clicks_the_student_information_tab() {
        StepsImplementation.user_clicks_the_student_information_tab();
    }

    @When("user is on the student admission page {string}")
    public void user_is_on_the_student_admission_page(String expectedUrl) {
        StepsImplementation.user_is_on_the_student_admission_page(expectedUrl);
    }

    @When("the user fills out all fields in admission page {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_out_all_fields_in_admission_page(String admissionNo, String rollNo, String Class, String Section, String firstname, String lastName, String gender, String dateOfBirth, String category, String guardianName, String guardianPhone) {
        StepsImplementation.the_user_fills_out_all_fields_in_admission_page(admissionNo, rollNo, Class, Section, firstname, lastName, gender, dateOfBirth, category, guardianName, guardianPhone);
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        StepsImplementation.user_clicks_save_button();
    }

    @When("Record Saved Successfully is displayed")
    public void record_saved_successfully_is_displayed() {
        CommonMethods.isElementDisplayed(abilityToDisableStudentRecordPage.recordSavedSuccess);
    }

    @When("user opens a student record in student details with admission number {string}")
    public void user_opens_a_student_record_in_student_details_with_admission_number(String admissionNo) {
        StepsImplementation.user_opens_a_student_record_in_student_details_with_admission_number(admissionNo);
    }

    @When("user clicks the disable thumbs down")
    public void user_clicks_the_disable_thumbs_down() {
        StepsImplementation.user_clicks_the_disable_thumbs_down();
    }

    @When("user is directed into a pop up page and select the reason and enters comment {string} and save")
    public void user_is_directed_into_a_pop_up_page_and_select_the_reason_and_enters_comment_and_save(String commentTest) {
        StepsImplementation.user_is_directed_into_a_pop_up_page_and_select_the_reason_and_enters_comment_and_save(commentTest);
    }

    @When("user clicks disabled students module and enters {string}")
    public void user_clicks_disabled_students_module_and_enters(String admissionNo) {
        StepsImplementation.user_clicks_disabled_students_module_and_enters(admissionNo);
    }

    @When("user clicks bulk delete to delete a student record")
    public void user_clicks_bulk_delete_to_delete_a_student_record() {
        StepsImplementation.user_clicks_bulk_delete_to_delete_a_student_record();
    }
}

