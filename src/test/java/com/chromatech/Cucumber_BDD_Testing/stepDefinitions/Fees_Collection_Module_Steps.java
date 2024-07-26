package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fees_Collection_Module_Steps {
    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks on the Fees Collection module")
    public void the_user_clicks_on_the_fees_collection_module() {
        dashboardPage.feesCollectionModule.click();
    }

    @Then("the following Fees Collection submodules are displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_fees_collection_submodules_are_displayed(String collectFees, String searchFeesPayment, String searchDueFees, String feesMaster, String feesGroup, String feesType, String feesDiscount, String feesCarryForward, String feesReminder) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(dashboardPage.collectFeesSubModule.getText(), collectFees);
        CommonMethods.assertEquals(dashboardPage.searchFeesPaymentSubModule.getText(), searchFeesPayment);
        CommonMethods.assertEquals(dashboardPage.searchDueFeesSubModule.getText(), searchDueFees);
        CommonMethods.assertEquals(dashboardPage.feesMasterSubModule.getText(), feesMaster);
        CommonMethods.assertEquals(dashboardPage.feesGroupSubModule.getText(), feesGroup);
        CommonMethods.assertEquals(dashboardPage.feesTypeSubModule.getText(), feesType);
        CommonMethods.assertEquals(dashboardPage.feesDiscountSubModule.getText(), feesDiscount);
        CommonMethods.assertEquals(dashboardPage.feesCarryForwardSubModule.getText(), feesCarryForward);
        CommonMethods.assertEquals(dashboardPage.feesReminderSubModule.getText(), feesReminder);
    }
}