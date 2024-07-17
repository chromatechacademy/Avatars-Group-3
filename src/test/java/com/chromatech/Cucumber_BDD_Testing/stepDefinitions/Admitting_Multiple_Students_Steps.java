package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Admitting_Multiple_Students_Steps {

    @Given("a CTSMS admin or faculty member is on the student admission page {string}")
    public void a_ctsms_admin_or_faculty_member_is_on_the_student_admission_page(String expectedAdmissionPageUrl) throws InterruptedException {
        PageInitializer.dashboardPage.studentInformationModule.click();
        PageInitializer.dashboardPage.studentAdmissionSubModule.click();
        Thread.sleep(3000);
        String actualAdmissionPageUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonMethods.assertEquals(actualAdmissionPageUrl, expectedAdmissionPageUrl);

    }
    @When("the user fills out all fields {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_out_all_fields(String admissionNo, String rollNumber, String classDropDownValue, String sectionDropDownValue, String firstNameText, String lastNameText, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22) {
        PageInitializer.studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        CommonMethods.selectDropDownValue(PageInitializer.studentAdmissionPage.genderDropDown, string7);

    }

    @When("click save")
    public void click_save() throws InterruptedException {
        CommonMethods.selectDateByJS("01/01/1991", PageInitializer.studentAdmissionPage.dateOfBirthTextBox);
        Thread.sleep(3000);
    }
//    @Then("the user should be able to admit multiple students with unique admission numbers")
//    public void the_user_should_be_able_to_admit_multiple_students_with_unique_admission_numbers() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
