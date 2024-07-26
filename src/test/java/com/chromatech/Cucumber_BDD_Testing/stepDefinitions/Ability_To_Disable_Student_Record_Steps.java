package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.*;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Ability_To_Disable_Student_Record_Steps {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    AbilityToDisableStudentRecordPage abilityToDisableStudentRecordPage = new AbilityToDisableStudentRecordPage();
    DashboardPage dashboardPage = new DashboardPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @And("user clicks the student information tab")
    public void user_clicks_the_student_information_tab() {
        dashboardPage.studentInformationModule.click();
        dashboardPage.studentAdmissionSubModule.click();
    }

    @When("user is on the student admission page {string}")
    public void user_is_on_the_student_admission_page(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        CommonMethods.assertEquals(expectedUrl, actualUrl);
    }

    @And("the user fills out all fields {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_out_all_fields(String admissionNo, String rollNo, String Class, String Section, String firstname, String lastName, String gender, String dateOfBirth, String category, String guardianName, String guardianPhone) {
        studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        studentAdmissionPage.rollNumberTextBox.sendKeys(rollNo);
        CommonMethods.selectDropDownValue(Class, studentAdmissionPage.classDropDown);
        CommonMethods.selectDropDownValue(Section, studentAdmissionPage.sectionDropDown);
        studentAdmissionPage.firstNameTextBox.sendKeys(firstname);
        studentAdmissionPage.lastNameTextBox.sendKeys(lastName);
        CommonMethods.selectDropDownValue(gender, studentAdmissionPage.genderDropDown);
        JavascriptMethods.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, dateOfBirth);
        CommonMethods.selectDropDownValue(category, studentAdmissionPage.categoryDropDown);
        JavascriptMethods.scrollIntoView(studentAdmissionPage.categoryDropDown);
        studentAdmissionPage.motherRadioButton.click();
        studentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhone);
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        studentAdmissionPage.saveButton.click();
    }

    @When("Record Saved Successfully is displayed")
    public void record_saved_successfully_is_displayed() {
        CommonMethods.isElementDisplayed(abilityToDisableStudentRecordPage.recordSavedSuccess);
    }

    @When("user opens a student record in student details with admission number {string}")
    public void user_opens_a_student_record_in_student_details_with_admission_number(String admissionNo) {
        dashboardPage.studentDetailsSubModule.click();
        studentDetailsPage.searchByKeywordTextBox.sendKeys(admissionNo);
        studentDetailsPage.searchByKeywordButton.click();
        abilityToDisableStudentRecordPage.studentResult.click();
    }

    @When("user clicks the disable thumbs down")
    public void user_clicks_the_disable_thumbs_down() {
        abilityToDisableStudentRecordPage.disableSign.click();
        CommonMethods.acceptAlert();
    }

    @When("user is directed into a pop up page and select the reason and enters comment {string} and save")
    public void user_is_directed_into_a_pop_up_page_and_select_the_reason_and_enters_comment_and_save(String commentTest) {
        CommonMethods.sleep(2000);
        CommonMethods.waitForVisibility(abilityToDisableStudentRecordPage.reasonDropDown);
        CommonMethods.sleep(2000);
        CommonMethods.selectDropDownValue("TestDisableReason", abilityToDisableStudentRecordPage.reasonDropDown);
        CommonMethods.sendKeys(abilityToDisableStudentRecordPage.comment, commentTest);
        abilityToDisableStudentRecordPage.reasonSaveButton.click();
    }

    @When("user clicks disabled students module and enters {string}")
    public void user_clicks_disabled_students_module_and_enters(String admissionNo) {
        abilityToDisableStudentRecordPage.disabledStudentSubModule.click();
        abilityToDisableStudentRecordPage.searchByKeyword.sendKeys(admissionNo);
        CommonMethods.sleep(100);
        abilityToDisableStudentRecordPage.searchButton.click();
        CommonMethods.sleep(100);
        abilityToDisableStudentRecordPage.resultName.click();
        CommonMethods.sleep(100);
        abilityToDisableStudentRecordPage.enableThumbsUp.click();
        CommonMethods.acceptAlert();
    }

    @When("user clicks bulk delete to delete a student record")
    public void user_clicks_bulk_delete_to_delete_a_student_record() {
        bulkDeletePage.bulkDeleteSubModule.click();
        CommonMethods.selectDropDownValue("SDET", bulkDeletePage.classDropDown);
        CommonMethods.selectDropDownValue("Cucumber Fundamentals", bulkDeletePage.sectionDropDown);
        bulkDeletePage.searchButton.click();
        abilityToDisableStudentRecordPage.admissionNoDelete.click();
        JavascriptMethods.scrollIntoView(abilityToDisableStudentRecordPage.admissionNoDelete);
        bulkDeletePage.deleteButton.click();
        CommonMethods.sleep(100);
        CommonMethods.acceptAlert();
    }
}

