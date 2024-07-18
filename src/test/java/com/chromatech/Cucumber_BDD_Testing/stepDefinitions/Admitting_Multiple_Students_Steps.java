package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentAdmissionPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admitting_Multiple_Students_Steps {

    DashboardPage dashboardPage = new DashboardPage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

    @Given("a CTSMS admin or faculty member is on the student admission page {string}")
    public void a_ctsms_admin_or_faculty_member_is_on_the_student_admission_page(String expectedAdmissionPageUrl) throws InterruptedException {
        dashboardPage.studentInformationModule.click();
        dashboardPage.studentAdmissionSubModule.click();
        Thread.sleep(3000);
        String actualAdmissionPageUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonMethods.assertEquals(actualAdmissionPageUrl, expectedAdmissionPageUrl);
    }

    @When("the user fills out all fields {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_out_all_fields(String admissionNo, String rollNumber, String classOption, String sectionOption, String firstName, String lastName, String genderOption, String dateOfBirth, String categoryOption, String email, String admissionDate, String bloodGroupOption, String asOnDate, String mobileNumber, String height, String weight, String fatherName, String fatherPhone, String fatherOccupation, String motherName, String motherPhone, String motherOccupation, String guardianName, String guardianRelation, String guardianEmail, String guardianPhone, String guardianOccupation, String guardianAddress) {
        studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        studentAdmissionPage.rollNumberTextBox.sendKeys(rollNumber);
        CommonMethods.selectDropDownValue(classOption, studentAdmissionPage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, studentAdmissionPage.sectionDropDown);
        studentAdmissionPage.rollNumberTextBox.sendKeys(firstName);
        studentAdmissionPage.rollNumberTextBox.sendKeys(lastName);
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
        studentAdmissionPage.guardianNameTextBox.sendKeys();
        studentAdmissionPage.guardianEmailTextBox.sendKeys(guardianEmail);
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhone);
        studentAdmissionPage.guardianOccupationTextBox.sendKeys(guardianOccupation);
        studentAdmissionPage.guardianAddressTextBox.sendKeys(guardianAddress);






    }

    @When("clicks save")
    public void clicks_save() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to admit multiple students with unique admission numbers")
    public void the_user_should_be_able_to_admit_multiple_students_with_unique_admission_numbers() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
