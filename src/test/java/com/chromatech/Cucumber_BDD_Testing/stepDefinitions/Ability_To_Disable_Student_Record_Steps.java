package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.AbilityToDisableStudentRecordPage;
import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentAdmissionPage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentDetailsPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static com.chromatech.utils.WebDriverUtils.driver;

public class Ability_To_Disable_Student_Record_Steps {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    AbilityToDisableStudentRecordPage abilityToDisableStudentRecordPage = new AbilityToDisableStudentRecordPage();
    DashboardPage dashboardPage = new DashboardPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();


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
        abilityToDisableStudentRecordPage.disableSign.click();
        CommonMethods.sleep(3000);
        CommonMethods.acceptAlert();

    }

    @When("user select the dropDown reason {string} {string}")
    public void user_select_the_drop_down_reason(String reasonDropDown, String text) {
        CommonMethods.sleep(20000);
        CommonMethods.waitForInvisibility(abilityToDisableStudentRecordPage.disableModal);
        abilityToDisableStudentRecordPage.reasonSaveButton.click();

    }
}

