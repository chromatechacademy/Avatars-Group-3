package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DisabledStudentPage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentDetailsPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Ability_To_Enable_After_Disabeling_Student_Steps {

    DisabledStudentPage disabledStudentPage = new DisabledStudentPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    Select select = new Select(disabledStudentPage.reasonDropdown);

    @When("clicks on Disable Student button")
    public void clicks_on_disable_student_button() {
        CommonMethods.sleep(5000);
        disabledStudentPage.disableButton.click();
        CommonMethods.acceptAlert();
        disabledStudentPage.reasonDropdown.click();
        select.selectByVisibleText("Very Loud");
        CommonMethods.sleep(2000);
        disabledStudentPage.submitButton.click();
    }

    @When("a user enables the student record")
    public void a_user_enables_the_student_record() {
        CommonMethods.sleep(2000);
        disabledStudentPage.enableButton.click();
        CommonMethods.acceptAlert();
    }

    @Then("the student record is successfully enabled")
    public void the_student_record_is_successfully_enabled() {
        CommonMethods.sleep(3000);
        Assert.assertTrue(disabledStudentPage.disableButton.isDisplayed());
    }
}