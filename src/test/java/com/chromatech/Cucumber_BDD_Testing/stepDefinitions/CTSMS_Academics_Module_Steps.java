package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.chromatech.utils.CommonMethods.assertEquals;

public class CTSMS_Academics_Module_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks on the Academics Module")
    public void the_user_clicks_on_the_academics_module() {
        dashboardPage.academicsModule.click();

    }

    @Then("the following submodules are displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String classTimetable, String teachersTimetable, String assignClassTeacher, String promoteStudent, String subjectGroup, String subjects, String classClass, String sections) {
        assertEquals(classTimetable, dashboardPage.classTimetableSubModule.getText());
        assertEquals(teachersTimetable, dashboardPage.teachersTimetableSubModule.getText());
        assertEquals(assignClassTeacher, dashboardPage.assignClassTeacherSubModule.getText());
        assertEquals(promoteStudent, dashboardPage.promoteStudentSubModule.getText());
        assertEquals(subjectGroup, dashboardPage.subjectGroupSubModule.getText());
        assertEquals(subjects, dashboardPage.subjectsSubModule.getText());
        assertEquals(classClass, dashboardPage.classClassSubModule.getText());
        assertEquals(sections, dashboardPage.sectionsSubModule.getText());

    }
}