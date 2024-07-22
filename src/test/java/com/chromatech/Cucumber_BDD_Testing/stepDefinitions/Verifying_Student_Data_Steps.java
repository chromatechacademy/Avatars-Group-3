package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.StudentDetailsPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class Verifying_Student_Data_Steps {

    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();

    @When("a student has been admitted {string}")
    public void a_student_has_been_admitted(String admissionNo) {
        studentDetailsPage.searchByKeywordTextBox.sendKeys(admissionNo);
        studentDetailsPage.searchByKeywordButton.click();
        CommonMethods.assertEquals(StudentDetailsPage.dynamicAdmissionRecordLocator(admissionNo).getText(), admissionNo);
    }

    @And("an admin navigates to a student record with {string}")
    public void an_admin_navigates_to_a_student_record(String studentName) {
        StudentDetailsPage.dynamicAdmissionRecordLocator(studentName).click();
        CommonMethods.assertTrue(StudentDetailsPage.dynamicNameRecordLocator(studentName).getText().equalsIgnoreCase(studentName));
    }

    @Then("all data submitted with the record should display as expected")
    public void all_data_submitted_with_the_record_should_display_as_expected() {
        CommonMethods.assertEquals(studentDetailsPage.admissionNo.getText(), ad);
    }

    @Then("all data submitted with the record should display as expected {string}, class {string}, section {string}, first name {string}, gender {string}, date of birth {string}, guardian name {string}, guardian phone number {string}")
    public void allDataSubmittedWithTheRecordShouldDisplayAsExpectedClassSectionFirstNameGenderDateOfBirthGuardianNameGuardianPhoneNumber(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
    }
}
