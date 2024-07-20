package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.VerifyStudentDataPage;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class Verify_Student_Data_Steps {

    VerifyStudentDataPage verifyStudentDataPage = new VerifyStudentDataPage();

    @And("user clicks on the student information")
    public void user_clicks_on_the_student_information() {
        verifyStudentDataPage.studentInformation.click();
        CucumberLogUtils.logScreenShot();

    }
    @And("user clicks on student admission button")
    public void user_clicks_on_student_admission_button() {
        verifyStudentDataPage.studentAdmission.click();
        CucumberLogUtils.logScreenShot();

    }
    @And("user is on the student admission page {string}")
    public void user_is_on_the_student_admission_page(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        CucumberLogUtils.logScreenShot();
    }
    @And("user enters the admission number {string}")
    public void user_enters_the_admission_number(String admissionNumber) {
        verifyStudentDataPage.admissionNumber.sendKeys(admissionNumber);
        CucumberLogUtils.logScreenShot();
    }
    @And("user enters the roll number {string}")
    public void user_enters_the_roll_number(String rollNumber) {
        verifyStudentDataPage.rollNumber.sendKeys(rollNumber);
        CucumberLogUtils.logScreenShot();
    }
    @And("user selects {string} class dropdown")
    public void user_selects_class_dropdown(String string) {
        verifyStudentDataPage.selectCLassDropdown.sendKeys(string);
        CucumberLogUtils.logScreenShot();

    }
    @And("user selects section select dropdown {string}")
    public void user_selects_section_select_dropdown(String section) {
        verifyStudentDataPage.selectSectionDropdown.sendKeys(section);
        CucumberLogUtils.logScreenShot();

    }
    @And("add the first name {string}")
    public void add_the_first_name(String firstName) {
        verifyStudentDataPage.lastName.sendKeys(firstName);
        CucumberLogUtils.logScreenShot();

    }
    @And("user enters the last name {string}")
    public void user_enters_the_last_name(String lastName) {
        verifyStudentDataPage.lastName.sendKeys(lastName);

    }





}

