package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.Constants.AppConstants;
import com.chromatech.Cucumber_BDD_Testing.pages.*;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;

public class Admitting_Multiple_Students_Steps {

    DashboardPage dashboardPage = new DashboardPage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();
    CategoryPage categoryPage = new CategoryPage();

    @And("verifies a student with {string} is not an existing student")
    public void verifies_a_student_with_is_not_an_existing_student(String admissionNo) {
        dashboardPage.studentInformationModule.click();
        bulkDeletePage.bulkDeleteSubModule.click();
        bulkDeletePage.classDropDown.click();
        bulkDeletePage.sectionDropDown.click();
        bulkDeletePage.searchButton.click();
        try {
            JavascriptMethods.scrollIntoView(BulkDeletePage.dynamicRecordLocateDeleter(admissionNo));
            if ((BulkDeletePage.dynamicRecordLocateDeleter(admissionNo).isDisplayed())) {
                BulkDeletePage.dynamicRecordLocateDeleter(admissionNo).click();
                bulkDeletePage.deleteButton.click();
                CommonMethods.acceptAlert();
            }
        } catch (NoSuchElementException e) {
        }
    }

    @Given("verifies a sibling with {string} is not an existing student")
    public void verifies_a_sibling_with_is_not_an_existing_student(String siblingAdmissionNO) {
        try {
            JavascriptMethods.scrollIntoView(BulkDeletePage.dynamicRecordLocateDeleter(siblingAdmissionNO));
            if ((BulkDeletePage.dynamicRecordLocateDeleter(siblingAdmissionNO).isDisplayed())) {
                BulkDeletePage.dynamicRecordLocateDeleter(siblingAdmissionNO).click();
                bulkDeletePage.deleteButton.click();
                CommonMethods.acceptAlert();
            }
        } catch (NoSuchElementException e) {
        }
    }

    @And("creates a test category {string}")
    public void creates_a_test_category(String categoryName) {
        categoryPage.studentCategories.click();
        categoryPage.categoryTextBox.sendKeys(categoryName);
        categoryPage.categorySaveButton.click();
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(categoryPage.categorySelenium.getText(), categoryName);
    }

    @When("a CTSMS admin or faculty member is on the student admission page {string}")
    public void a_ctsms_admin_or_faculty_member_is_on_the_student_admission_page(String expectedAdmissionPageUrl) {
        dashboardPage.studentAdmissionSubModule.click();
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(WebDriverUtils.driver.getCurrentUrl(), expectedAdmissionPageUrl);
    }

    @And("creates a test sibling with admission number {string}, class {string}, section {string}, first name {string}, gender {string}, date of birth {string}, guardian name {string}, guardian phone number {string}")
    public void creates_a_test_sibling_with_admission_number_class_section_first_name_gender_date_of_birth_guardian_name_guardian_phone_number(String admissionNo, String classOption, String sectionOption, String firstName, String genderOption, String dateOfBirth, String guardianName, String guardianPhoneNumber) {
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

    @And("adds a sibling")
    public void adds_a_sibling() {
        CommonMethods.sleep(5000);
        studentAdmissionPage.addSiblingButton.click();
        CommonMethods.waitForVisibility(studentAdmissionPage.siblingClassDropDown);
        CommonMethods.selectDropDownValue("SDET", studentAdmissionPage.siblingClassDropDown);
        CommonMethods.selectDropDownValue("Cucumber Fundamentals", studentAdmissionPage.siblingSectionDropDown);
        CommonMethods.selectDropDownValue("Group Three Sibling ()", studentAdmissionPage.siblingStudentIDDropDown);
        studentAdmissionPage.addSiblingInformationButton.click();
    }

    @And("the user fills out all fields {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_out_all_fields(String admissionNo, String rollNumber, String classOption, String sectionOption, String firstName, String lastName, String genderOption, String dateOfBirth, String categoryOption, String email, String admissionDate, String bloodGroupOption, String asOnDate, String mobileNumber, String height, String weight, String fatherName, String fatherPhone, String fatherOccupation, String motherName, String motherPhone, String motherOccupation, String guardianEmail, String guardianAddress) {
        studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        studentAdmissionPage.rollNumberTextBox.sendKeys(rollNumber);
        CommonMethods.selectDropDownValue(classOption, studentAdmissionPage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, studentAdmissionPage.sectionDropDown);
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        studentAdmissionPage.lastNameTextBox.sendKeys(lastName);
        CommonMethods.selectDropDownValue(genderOption, studentAdmissionPage.genderDropDown);
        JavascriptMethods.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, dateOfBirth);
        CommonMethods.selectDropDownValue(categoryOption, studentAdmissionPage.categoryDropDown);
        studentAdmissionPage.emailTextBox.sendKeys(email);
        JavascriptMethods.selectDateByJS(studentAdmissionPage.admissionDateTextBox, admissionDate);
        CommonMethods.selectDropDownValue(bloodGroupOption, studentAdmissionPage.bloodGroupDropDown);
        JavascriptMethods.selectDateByJS(studentAdmissionPage.asOnDate, asOnDate);
        studentAdmissionPage.mobileNumberTextBox.sendKeys(mobileNumber);
        studentAdmissionPage.heightTextBox.sendKeys(height);
        studentAdmissionPage.weightTextBox.sendKeys(weight);
        studentAdmissionPage.fatherNameTextBox.sendKeys(fatherName);
        studentAdmissionPage.fatherPhoneTextBox.sendKeys(fatherPhone);
        studentAdmissionPage.fatherOccupationTextBox.sendKeys(fatherOccupation);
        studentAdmissionPage.motherNameTextBox.sendKeys(motherName);
        studentAdmissionPage.motherPhoneTextBox.sendKeys(motherPhone);
        studentAdmissionPage.motherOccupationTextBox.sendKeys(motherOccupation);
        studentAdmissionPage.motherRadioButton.click();
        studentAdmissionPage.guardianEmailTextBox.sendKeys(guardianEmail);
        studentAdmissionPage.guardianAddressTextBox.sendKeys(guardianAddress);
    }

    @And("uploads family member photos")
    public void uploads_family_member_photos() {
        studentAdmissionPage.studentPhoto.sendKeys(AppConstants.photoFilepath);
        studentAdmissionPage.fatherPhoto.sendKeys(AppConstants.photoFilepath);
        studentAdmissionPage.motherPhoto.sendKeys(AppConstants.photoFilepath);
        studentAdmissionPage.guardianPhoto.sendKeys(AppConstants.photoFilepath);
    }

    @And("clicks the Add More Details button")
    public void clicks_the_add_more_details_button() {
        studentAdmissionPage.addMoreDetailsBox.click();
    }

    @And("adds Student Address Details")
    public void adds_student_address_details() {
        studentAdmissionPage.guardianAddressCheckBox.click();
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(studentAdmissionPage.guardianAddressTextBox.getText(), studentAdmissionPage.currentAddressTextBox.getText());
        studentAdmissionPage.permanentAddressCheckBox.click();
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(studentAdmissionPage.permanentAddressTextBox.getText(), studentAdmissionPage.currentAddressTextBox.getText());
    }

    @And("adds Miscellaneous Details {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void adds_miscellaneous_details(String bankAccountNumber, String bankName, String ifscCode, String nationalIDNumber, String localIDNumber, String previousSchoolDetails, String note) {
        studentAdmissionPage.bankAccountNumberTextBox.sendKeys(bankAccountNumber);
        studentAdmissionPage.bankNameTextBox.sendKeys(bankName);
        studentAdmissionPage.ifscCodeTextBox.sendKeys(ifscCode);
        studentAdmissionPage.nationalIDNumberTextBox.sendKeys(nationalIDNumber);
        studentAdmissionPage.localIDNumberTextBox.sendKeys(localIDNumber);
        studentAdmissionPage.rteYesButton.click();
        studentAdmissionPage.previousSchoolDetailsTextBox.sendKeys(previousSchoolDetails);
        studentAdmissionPage.noteTextBox.sendKeys(note);
    }

    @And("uploads documents {string}, {string}, {string}, {string}")
    public void uploads_documents(String titleOne, String titleTwo, String titleThree, String titleFour) {
        studentAdmissionPage.titleOneTextBox.sendKeys(titleOne);
        studentAdmissionPage.titleTwoTextBox.sendKeys(titleTwo);
        studentAdmissionPage.titleThreeTextBox.sendKeys(titleThree);
        studentAdmissionPage.titleFourTextBox.sendKeys(titleFour);
        studentAdmissionPage.documentOne.sendKeys(AppConstants.photoFilepath);
        studentAdmissionPage.documentTwo.sendKeys(AppConstants.photoFilepath);
        studentAdmissionPage.documentThree.sendKeys(AppConstants.photoFilepath);
        studentAdmissionPage.documentFour.sendKeys(AppConstants.photoFilepath);
    }

    @When("clicks save")
    public void clicks_save() {
        studentAdmissionPage.saveButton.click();
    }

    @Then("the user should be able to admit students with unique admission numbers {string}, {string}, {string}")
    public void the_user_should_be_able_to_admit_students_with_unique_admission_numbers(String classOption, String sectionOption, String admissionNo) {
        bulkDeletePage.bulkDeleteSubModule.click();
        CommonMethods.selectDropDownValue(classOption, bulkDeletePage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, bulkDeletePage.sectionDropDown);
        bulkDeletePage.searchButton.click();
        JavascriptMethods.scrollIntoView(BulkDeletePage.dynamicRecordLocateDeleter(admissionNo));
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(BulkDeletePage.dynamicRecordNameLocator(admissionNo).getText(), admissionNo);
    }

    @And("delete test account with {string}")
    public void delete_test_account_with(String admissionNo) {
        BulkDeletePage.dynamicRecordLocateDeleter(admissionNo).click();
        bulkDeletePage.deleteButton.click();
        CommonMethods.acceptAlert();
    }

    @And("delete test sibling account with admission number {string}")
    public void delete_test_sibling_account_with_admission_number_with_class_section(String admissionNo) {
        JavascriptMethods.scrollIntoView(BulkDeletePage.dynamicRecordLocateDeleter(admissionNo));
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(BulkDeletePage.dynamicRecordNameLocator(admissionNo).getText(), admissionNo);
        BulkDeletePage.dynamicRecordLocateDeleter(admissionNo).click();
        bulkDeletePage.deleteButton.click();
        CommonMethods.acceptAlert();
    }

    @Then("delete the test category")
    public void delete_the_test_category() {
        CommonMethods.waitForClickability(categoryPage.studentCategories);
        categoryPage.studentCategories.click();
        CommonMethods.waitForClickability(categoryPage.groupSelenium);
        categoryPage.groupSelenium.click();
        CommonMethods.acceptAlert();
    }
}