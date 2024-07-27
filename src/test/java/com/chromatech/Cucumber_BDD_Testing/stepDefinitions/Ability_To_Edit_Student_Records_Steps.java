package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.*;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ability_To_Edit_Student_Records_Steps {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    DashboardPage dashboardPage = new DashboardPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    StudentEditPage studentEditPage = new StudentEditPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @And("fills out all required fields with admission number {string}, class {string}, section {string}, first name {string}, gender {string}, date of birth {string}, guardian name {string}, guardian phone number {string}")
    public void fills_out_all_required_fields_with_admission_number_class_section_first_name_gender_date_of_birth_guardian_name_guardian_phone_number(String admissionNo, String classOption, String sectionOption, String firstName, String genderOption, String dateOfBirth, String guardianName, String guardianPhoneNumber) {
        studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        CommonMethods.selectDropDownValue(classOption, studentAdmissionPage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, studentAdmissionPage.sectionDropDown);
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        CommonMethods.selectDropDownValue(genderOption, studentAdmissionPage.genderDropDown);
        JavascriptMethods.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, dateOfBirth);
        studentAdmissionPage.fatherRadioButton.click();
        studentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhoneNumber);
        studentAdmissionPage.saveButton.click();
        CommonMethods.waitForVisibility(studentAdmissionPage.studentSavedSuccessfullyAlert);
    }

    @When("a CTSMS user opens a student record with admission number {string}")
    public void a_ctsms_user_opens_a_student_record_with_admission_number(String admissionNo) {
        dashboardPage.studentDetailsSubModule.click();
        studentDetailsPage.searchByKeywordTextBox.sendKeys(admissionNo);
        studentDetailsPage.searchByKeywordButton.click();
        JavascriptMethods.scrollIntoView(StudentDetailsPage.dynamicAdmissionRecordNameLocator(admissionNo));
        StudentDetailsPage.dynamicAdmissionRecordNameLocator(admissionNo).click();
    }

    @And("makes and saves changes to the student information with {string}, and {string}")
    public void makes_and_saves_changes_to_the_student_information_with(String email, String guardianPhoneNumber) {
        studentEditPage.editButton.click();
        studentEditPage.emailTextBox.sendKeys(email);
        studentEditPage.guardianPhoneNumberTextBox.sendKeys(guardianPhoneNumber);
        CommonMethods.sleep(1000);
        studentEditPage.saveButton.click();
    }

    @Then("the user should see message {string}")
    public void the_user_should_see_message(String expectedSaveMessage) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(studentDetailsPage.successfulRecordUpdateAlert.getText(), expectedSaveMessage);
    }

    @Then("user navigate to test students account {string}, section {string}, and admission number {string}")
    public void user_navigate_to_test_students_account(String classOption, String sectionOption, String admissionNo) {
        bulkDeletePage.bulkDeleteSubModule.click();
        CommonMethods.selectDropDownValue(classOption, bulkDeletePage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, bulkDeletePage.sectionDropDown);
        bulkDeletePage.searchButton.click();
        JavascriptMethods.scrollIntoView(BulkDeletePage.dynamicRecordLocateDeleter(admissionNo));
    }
}