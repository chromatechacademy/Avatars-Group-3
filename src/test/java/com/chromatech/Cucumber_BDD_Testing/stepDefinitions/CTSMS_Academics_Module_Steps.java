package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CTSMS_Academics_Module_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks on the Academics Module")
    public void the_user_clicks_on_the_academics_module() {
        CucumberLogUtils.logScreenShot();
        dashboardPage.academicsModule.click();
    }

    @Then("the following submodules are displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String classTimetable, String teacherTimetable, String assignClassTeacher, String promoteStudent, String subjectGroup, String subjects, String classClass, String sections) {
        CucumberLogUtils.logScreenShot();
        Assert.assertEquals(dashboardPage.classTimeableSubModule.getText(), classTimetable);
        Assert.assertEquals(dashboardPage.teacherTimeableSubModule.getText(), teacherTimetable);
        Assert.assertEquals(dashboardPage.assignClassTeacherSubModule.getText(), assignClassTeacher);
        Assert.assertEquals(dashboardPage.promoteStudentSubModule.getText(), promoteStudent);
        Assert.assertEquals(dashboardPage.subjectGroupSubModule.getText(), subjectGroup);
        Assert.assertEquals(dashboardPage.subjectsSubModule.getText(), subjects);
        Assert.assertEquals(dashboardPage.classClassSubModule.getText(), classClass);
        Assert.assertEquals(dashboardPage.sectionsSubModule.getText(), sections);

    }
}