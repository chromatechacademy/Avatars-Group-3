package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.BulkDeletePage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentAdmissionPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Student_Admission_With_Unique_Admission_Number_Steps {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @Then("the user should see {string}")
    public void the_user_should_see(String expectedAdmissionNoUniqueValueMessage) {
        CucumberLogUtils.logScreenShot();
        Assert.assertEquals(studentAdmissionPage.admissionNoUniqueValueMessage.getText(), expectedAdmissionNoUniqueValueMessage);
    }

    @Then("navigate to test student {string}, {string}, {string}")
    public void navigate_to_test_student(String classOption, String sectionOption, String admissionNo) {
        bulkDeletePage.bulkDeleteSubModule.click();
        CommonMethods.selectDropDownValue(classOption, bulkDeletePage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, bulkDeletePage.sectionDropDown);
        bulkDeletePage.searchButton.click();
        JavascriptMethods.scrollIntoView(BulkDeletePage.dynamicRecordLocateDeleter(admissionNo));
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(BulkDeletePage.dynamicRecordNameLocator(admissionNo).getText(), admissionNo);
    }
}