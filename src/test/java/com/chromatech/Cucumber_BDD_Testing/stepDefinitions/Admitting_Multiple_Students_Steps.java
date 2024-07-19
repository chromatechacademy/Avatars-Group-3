package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.BulkDeletePage;
import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentAdmissionPage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentDetailsPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.time.Duration;

public class Admitting_Multiple_Students_Steps {

    DashboardPage dashboardPage = new DashboardPage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @Given("a CTSMS admin or faculty member is on the student admission page {string}")
    public void a_ctsms_admin_or_faculty_member_is_on_the_student_admission_page(String expectedAdmissionPageUrl) throws InterruptedException {
        dashboardPage.studentInformationModule.click();
        dashboardPage.studentAdmissionSubModule.click();
        Thread.sleep(3000);
        String actualAdmissionPageUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonMethods.assertEquals(actualAdmissionPageUrl, expectedAdmissionPageUrl);
    }

    @When("creates a sibling with admission number {string}, class {string}, section {string}, first name {string}, gender {string}, date of birth {string}, guardian name {string}, guardian phone number {string}")
    public void creates_a_sibling_with_admission_number_class_section_first_name_gender_date_of_birth_guardian_name_guardian_phone_number(String admissionNo, String classOption, String sectionOption, String firstName, String genderOption, String dateOfBirth, String guardianName, String guardianPhoneNumber) {
        studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        CommonMethods.selectDropDownValue(classOption, studentAdmissionPage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, studentAdmissionPage.sectionDropDown);
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        CommonMethods.selectDropDownValue(genderOption, studentAdmissionPage.genderDropDown);
        JavascriptMethods.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, dateOfBirth);
        studentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhoneNumber);
        studentAdmissionPage.saveButton.click();
    }

    @Given("creates a category")
    public void creates_a_category() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }

    @When("the user fills out all fields {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_out_all_fields(String admissionNo, String rollNumber, String classOption, String sectionOption, String firstName, String lastName, String genderOption, String dateOfBirth, String categoryOption, String email, String admissionDate, String bloodGroupOption, String asOnDate, String mobileNumber, String height, String weight, String fatherName, String fatherPhone, String fatherOccupation, String motherName, String motherPhone, String motherOccupation, String guardianName, String guardianEmail, String guardianPhone, String guardianOccupation, String guardianAddress) {
        studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        studentAdmissionPage.rollNumberTextBox.sendKeys(rollNumber);
        CommonMethods.selectDropDownValue(classOption, studentAdmissionPage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, studentAdmissionPage.sectionDropDown);
        studentAdmissionPage.rollNumberTextBox.sendKeys(firstName);
        studentAdmissionPage.rollNumberTextBox.sendKeys(lastName);
        CommonMethods.selectDropDownValue(genderOption, studentAdmissionPage.genderDropDown);
        JavascriptMethods.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, dateOfBirth);
//        NEED TO CREATE A CATEGORY AND CHANGE CATEGORY NAME IN EXAMPLES TABLE
        CommonMethods.selectDropDownValue(categoryOption, studentAdmissionPage.categoryDropDown);
        studentAdmissionPage.emailTextBox.sendKeys(email);
        JavascriptMethods.selectDateByJS(studentAdmissionPage.admissionDateTextBox, admissionDate);
        CommonMethods.selectDropDownValue(bloodGroupOption, studentAdmissionPage.bloodGroupDropDown);
        JavascriptMethods.selectDateByJS(studentAdmissionPage.asOnDate, asOnDate);
        studentAdmissionPage.mobileNumberTextBox.sendKeys(mobileNumber);
        studentAdmissionPage.heightTextBox.sendKeys(height);
        studentAdmissionPage.weightTextBox.sendKeys(weight);
//        studentAdmissionPage.fatherNameTextBox.sendKeys(fatherName);
//        studentAdmissionPage.fatherPhoneTextBox.sendKeys(fatherPhone);
//        studentAdmissionPage.fatherOccupationTextBox.sendKeys(fatherOccupation);
        studentAdmissionPage.motherNameTextBox.sendKeys(motherName);
        studentAdmissionPage.motherPhoneTextBox.sendKeys(motherPhone);
        studentAdmissionPage.motherOccupationTextBox.sendKeys(motherOccupation);
        studentAdmissionPage.motherRadioButton.click();
//        studentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
        studentAdmissionPage.guardianEmailTextBox.sendKeys(guardianEmail);
//        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhone);
//        studentAdmissionPage.guardianOccupationTextBox.sendKeys(guardianOccupation);
        studentAdmissionPage.guardianAddressTextBox.sendKeys(guardianAddress);
    }

    @When("uploads family member photos")
    public void uploads_family_member_photos() {
        String photo = System.getProperty("user.dir") + "/src/main/java/com/chromatech/utils/files/famphoto.jpg";
        studentAdmissionPage.studentPhoto.sendKeys(photo);
        studentAdmissionPage.fatherPhoto.sendKeys(photo);
        studentAdmissionPage.motherPhoto.sendKeys(photo);
        studentAdmissionPage.guardianPhoto.sendKeys(photo);
    }

    @When("adds a sibling")
    public void adds_a_sibling() {
        studentAdmissionPage.addSiblingButton.click();
        CommonMethods.waitForVisibility(studentAdmissionPage.siblingClassDropDown);
        CommonMethods.selectDropDownValue("SDET", studentAdmissionPage.siblingClassDropDown);
        CommonMethods.waitForVisibility(studentAdmissionPage.siblingSectionDropDown);
        CommonMethods.selectDropDownValue("Cucumber Fundamentals", studentAdmissionPage.siblingSectionDropDown);
        CommonMethods.selectDropDownValue("Sibling Three (123123) ", studentAdmissionPage.siblingStudentIDDropDown);
        studentAdmissionPage.addSiblingInformationButton.click();
    }

    @When("clicks the Add More Details button")
    public void clicks_the_add_more_details_button() {
        studentAdmissionPage.addMoreDetailsBox.click();
    }

    @When("adds Student Address Details {string}")
    public void adds_student_address_details(String address) {
        studentAdmissionPage.currentAddressTextBox.sendKeys(address);
        studentAdmissionPage.guardianAddressCheckBox.click();
        CommonMethods.assertEquals(studentAdmissionPage.guardianAddressTextBox.getText(), studentAdmissionPage.currentAddressTextBox.getText());
        studentAdmissionPage.permanentAddressCheckBox.click();
        CommonMethods.assertEquals(studentAdmissionPage.permanentAddressTextBox.getText(), studentAdmissionPage.currentAddressTextBox.getText());
    }

    @When("adds Miscellaneous Details {string}, {string}, {string}, {string}, {string}, {string}, {string}")
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

    @When("uploads documents {string}, {string}, {string}, {string}")
    public void uploads_documents(String titleOne, String titleTwo, String titleThree, String titleFour) {
        String photo = System.getProperty("user.dir") + "/src/main/java/com/chromatech/utils/files/famphoto.jpg";
        studentAdmissionPage.titleOneTextBox.sendKeys(titleOne);
        studentAdmissionPage.titleTwoTextBox.sendKeys(titleTwo);
        studentAdmissionPage.titleThreeTextBox.sendKeys(titleThree);
        studentAdmissionPage.titleFourTextBox.sendKeys(titleFour);
        studentAdmissionPage.documentOne.sendKeys(photo);
        studentAdmissionPage.documentTwo.sendKeys(photo);
        studentAdmissionPage.documentThree.sendKeys(photo);
        studentAdmissionPage.documentFour.sendKeys(photo);
    }

    @When("clicks save")
    public void clicks_save() {
        studentAdmissionPage.saveButton.click();
    }

    @Then("the user should be able to admit multiple students with unique admission numbers {string}, {string}, {string}")
    public void the_user_should_be_able_to_admit_multiple_students_with_unique_admission_numbers(String classOption, String sectionOption, String admissionNo) {
        dashboardPage.studentInformationModule.click();
        dashboardPage.studentDetailsSubModule.click();
        CommonMethods.selectDropDownValue(classOption, studentDetailsPage.classIDDropDown);
        CommonMethods.waitForVisibility(studentDetailsPage.sectionIDDropDown);
        CommonMethods.selectDropDownValue(sectionOption, studentDetailsPage.sectionIDDropDown);
        JavascriptMethods.scrollIntoView(StudentDetailsPage.dynamicRecordLocator(admissionNo));
        CommonMethods.assertEquals(StudentDetailsPage.dynamicRecordLocator(admissionNo).getText(), admissionNo);
    }

    @Then("delete test account with {string}, {string}, {string}")
    public void delete_test_account_with(String classOption, String sectionOption, String admissionNo) {
        dashboardPage.studentInformationModule.click();
        bulkDeletePage.bulkDeleteSubModule.click();
        CommonMethods.selectDropDownValue(classOption, bulkDeletePage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, bulkDeletePage.classDropDown);
        bulkDeletePage.searchButton.click();
        JavascriptMethods.scrollIntoView(BulkDeletePage.dynamicRecordLocateDeleter(admissionNo));
        CommonMethods.waitForVisibility(BulkDeletePage.dynamicRecordLocateDeleter(admissionNo));
        CommonMethods.assertEquals(BulkDeletePage.dynamicRecordNameLocator(admissionNo).getText(), admissionNo);
        BulkDeletePage.dynamicRecordLocateDeleter(admissionNo).click();
        bulkDeletePage.deleteButton.click();
        CommonMethods.acceptAlert();
    }

    @Then("delete sibling account with {string}")
    public void delete_sibling_account_with(String admissionNo) {
        JavascriptMethods.scrollIntoView(BulkDeletePage.dynamicRecordLocateDeleter(admissionNo));
    }
}
