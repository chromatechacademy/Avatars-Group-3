package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.BulkDeletePage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;

public class Student_Admission_Steps {

    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @Then("test account is reset with admission number {string}, class {string}, section {string}")
    public void test_account_is_reset_with_admission_number_class_section(String admissionNumber, String className, String sectionName) {
        bulkDeletePage.bulkDeleteSubModule.click();
        CommonMethods.selectDropDownValueByVisibleText(bulkDeletePage.classDropDown, className);
        CommonMethods.selectDropDownValueByVisibleText(bulkDeletePage.sectionDropDown, sectionName);
        bulkDeletePage.searchButton.click();
        CommonMethods.waitForClickabilityOfElement(BulkDeletePage.dynamicDeleteRecordLocator(admissionNumber));
        CommonMethods.scrollIntoView(BulkDeletePage.dynamicDeleteRecordLocator(admissionNumber));
        BulkDeletePage.dynamicDeleteRecordLocator(admissionNumber).click();
        CommonMethods.scrollIntoView(bulkDeletePage.deleteButton);
        bulkDeletePage.deleteButton.click();
        CommonMethods.acceptAlert();
    }
}
