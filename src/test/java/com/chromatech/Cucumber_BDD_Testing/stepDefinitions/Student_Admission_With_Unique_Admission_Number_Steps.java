package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.StudentAdmissionPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Student_Admission_With_Unique_Admission_Number_Steps {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

    @Then("the user should see {string}")
    public void the_user_should_see(String expectedAdmissionNoUniqueValueMessage) {
        CucumberLogUtils.logScreenShot();
        Assert.assertEquals(studentAdmissionPage.admissionNoUniqueValueMessage.getText(), expectedAdmissionNoUniqueValueMessage);
    }
}