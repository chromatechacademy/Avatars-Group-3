package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fees_Collection_Module_Steps extends PageInitializer {

    @When("the user clicks on the Fees Collection module")
    public void the_user_clicks_on_the_fees_collection_module() {
        dashboardPage.feesCollectionModule.click();
    }

    @Then("the following Fees Collection submodules are displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_fees_collection_submodules_are_displayed(String collectFees, String searchFeesPayment, String searchDueFees, String feesMaster, String feesGroup, String feesType, String feesDiscount, String feesCarryForward, String feesReminder) {
        StepsImplementation.the_following_fees_collection_submodules_are_displayed(collectFees, searchFeesPayment, searchDueFees, feesMaster, feesGroup, feesType, feesDiscount, feesCarryForward, feesReminder);
    }
}