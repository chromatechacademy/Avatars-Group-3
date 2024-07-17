package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admitting_Multiple_Students_Steps {

    @Given("a CTSMS admin or faculty member is on the student admission page {string}")
    public void a_ctsms_admin_or_faculty_member_is_on_the_student_admission_page(String expectedAdmissionPageUrl) throws InterruptedException {
        PageInitializer.dashboardPage.studentInformationModule.click();
        PageInitializer.dashboardPage.studentAdmissionSubModule.click();
        Thread.sleep(3000);
        String actualAdmissionPageUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonMethods.assertEquals(actualAdmissionPageUrl, expectedAdmissionPageUrl);

    }

    @When("the user fills out all fields {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_out_all_fields(String admissionNo, String rollNumber, String classOption, String sectionOption, String firstName, String lastName, String genderOption, String dateOfBirth, String categoryOption, String email, String admissionDate, String bloodGroupOption, String asOnDate, String mobileNumber, String height, String weight, String fatherName, String fatherPhone, String fatherOccupation, String motherName, String motherPhone, String motherOccupation, String guardianName, String guardianRelation, String guardianEmail, String guardianPhone, String guardianOccupation, String guardianAddress) {
        PageInitializer.studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        PageInitializer.studentAdmissionPage.rollNumberTextBox.sendKeys(rollNumber);
        CommonMethods.selectDropDownValue(classOption, PageInitializer.studentAdmissionPage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, PageInitializer.studentAdmissionPage.sectionDropDown);
        PageInitializer.studentAdmissionPage.rollNumberTextBox.sendKeys(firstName);
        PageInitializer.studentAdmissionPage.rollNumberTextBox.sendKeys(lastName);
        CommonMethods.selectDropDownValue(genderOption, PageInitializer.studentAdmissionPage.genderDropDown);
        CommonMethods.selectDateByJS(dateOfBirth, PageInitializer.studentAdmissionPage.dateOfBirthTextBox);
        CommonMethods.selectDropDownValue(categoryOption, PageInitializer.studentAdmissionPage.categoryDropDown);



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
