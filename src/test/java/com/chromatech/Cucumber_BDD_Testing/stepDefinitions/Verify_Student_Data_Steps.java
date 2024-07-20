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

    }
    @And("user clicks on student admission button")
    public void user_clicks_on_student_admission_button() {
        verifyStudentDataPage.studentAdmission.click();

    }
    @And("user is on the student admission page {string}")
    public void user_is_on_the_student_admission_page(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        CucumberLogUtils.logScreenShot();
    }


}

