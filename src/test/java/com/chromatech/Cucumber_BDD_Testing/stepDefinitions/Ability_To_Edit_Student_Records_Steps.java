package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.*;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ability_To_Edit_Student_Records_Steps {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    DashboardPage dashboardPage = new DashboardPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    StudentEditPage studentEditPage = new StudentEditPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    WebDriverWait webDriverWait = new WebDriverWait(WebDriverUtils.driver, Duration.ofSeconds(1));

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
        JavascriptMethods.scrollIntoView(StudentDetailsPage.dynamicAdmissionRecordLocator(admissionNo));
        StudentDetailsPage.dynamicAdmissionRecordLocator(admissionNo).click();
        webDriverWait.until(ExpectedConditions.urlContains("chroma/student/edit/"));
    }

    @And("makes and saves changes to the student information with {string}, and {string}")
    public void makes_and_saves_changes_to_the_student_information_with(String email, String guardianPhoneNumber) {
        studentEditPage.emailTextBox.sendKeys(email);
        studentEditPage.guardianPhoneNumberTextBox.sendKeys(guardianPhoneNumber);
        studentEditPage.saveButton.click();
    }

    @Then("the student information is successfully saved with {string}, {string}, and {string}")
    public void the_student_information_is_successfully_saved_with(String classOption, String sectionOption, String admissionNo) {
        webDriverWait.until(ExpectedConditions.urlContains("chroma/student/search"));
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertTrue(studentDetailsPage.successfulRecordUpdateAlert.isDisplayed());
        bulkDeletePage.bulkDeleteSubModule.click();
        CommonMethods.selectDropDownValue(classOption, bulkDeletePage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, bulkDeletePage.sectionDropDown);
        bulkDeletePage.searchButton.click();
        JavascriptMethods.scrollIntoView(BulkDeletePage.dynamicRecordLocateDeleter(admissionNo));
    }
}