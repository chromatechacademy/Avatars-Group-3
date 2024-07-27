package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;

import static com.chromatech.utils.CommonMethods.assertEquals;

public class StepsImplementation extends PageInitializer {

    /**
     * Fills out all the required fields with the provided values such as admission number, class section,
     * first name, gender, date of birth, guardian name, and guardian phone number.
     *
     * @param admissionNo         The admission number of the student.
     * @param classOption         The class option of the student.
     * @param sectionOption       The section option of the student.
     * @param firstName           The first name of the student.
     * @param genderOption        The gender option of the student.
     * @param dateOfBirth         The date of birth of the student.
     * @param guardianName        The guardian name of the student.
     * @param guardianPhoneNumber The guardian phone number of the student.
     */
    public static void fills_out_all_required_fields_with_admission_number_class_section_first_name_gender_date_of_birth_guardian_name_guardian_phone_number(String admissionNo, String classOption, String sectionOption, String firstName, String genderOption, String dateOfBirth, String guardianName, String guardianPhoneNumber) {
        studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        CommonMethods.selectDropDownValue(classOption, studentAdmissionPage.classDropDown);
        CommonMethods.selectDropDownValue(sectionOption, studentAdmissionPage.sectionDropDown);
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        CommonMethods.selectDropDownValue(genderOption, studentAdmissionPage.genderDropDown);
        JavascriptMethods.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, dateOfBirth);
        studentAdmissionPage.fatherRadioButton.click();
        studentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhoneNumber);
        studentAdmissionPage.saveButton.click();
        CommonMethods.waitForVisibility(studentAdmissionPage.studentSavedSuccessfullyAlert);
    }

    /**
     * Adds a section by entering the section name in the section text box and clicking the save button.
     */
    public static void the_user_adds_a_section() {
        addAndDeleteSectionsPage.sectionTextBox.sendKeys("TESTING MD");
        addAndDeleteSectionsPage.clickSaveButton.click();
    }

    /**
     * Deletes the section by clicking the delete button and accepting the confirmation alert.
     */
    public static void the_user_can_also_delete_the_section() {
        addAndDeleteSectionsPage.deleteButton.click();
        CommonMethods.acceptAlert();
    }

    /**
     * Asserts that the following submodules are displayed on the dashboard page.
     *
     * @param classTimetable     The expected text for the class timetable submodule.
     * @param teachersTimetable  The expected text for the teachers timetable submodule.
     * @param assignClassTeacher The expected text for the assign class teacher submodule.
     * @param promoteStudent     The expected text for the promote student submodule.
     * @param subjectGroup       The expected text for the subject group submodule.
     * @param subjects           The expected text for the subjects submodule.
     * @param classClass         The expected text for the class class submodule.
     * @param sections           The expected text for the sections submodule.
     */
    public static void the_following_submodules_are_displayed(String classTimetable, String teachersTimetable, String assignClassTeacher, String promoteStudent, String subjectGroup, String subjects, String classClass, String sections) {
        assertEquals(classTimetable, dashboardPage.classTimetableSubModule.getText());
        assertEquals(teachersTimetable, dashboardPage.teachersTimetableSubModule.getText());
        assertEquals(assignClassTeacher, dashboardPage.assignClassTeacherSubModule.getText());
        assertEquals(promoteStudent, dashboardPage.promoteStudentSubModule.getText());
        assertEquals(subjectGroup, dashboardPage.subjectGroupSubModule.getText());
        assertEquals(subjects, dashboardPage.subjectsSubModule.getText());
        assertEquals(classClass, dashboardPage.classClassSubModule.getText());
        assertEquals(sections, dashboardPage.sectionsSubModule.getText());
    }

    /**
     * Asserts that the following modules are displayed on the dashboard page.
     *
     * @param studentInformation The expected text for the student information module.
     * @param feesCollection     The expected text for the fees collection module.
     * @param Income             The expected text for the income module.
     * @param expenses           The expected text for the expenses module.
     * @param academics          The expected text for the academics module.
     * @param humanResource      The expected text for the human resource module.
     * @param homework           The expected text for the homework module.
     * @param reports            The expected text for the reports module.
     */
    public static void the_following_modules_are_displayed(String studentInformation, String feesCollection, String Income, String expenses, String academics, String humanResource, String homework, String reports) {
        CommonMethods.assertEquals(dashboardPage.studentInformationModule.getText(), studentInformation);
        CommonMethods.assertEquals(dashboardPage.feesCollectionModule.getText(), feesCollection);
        CommonMethods.assertEquals(dashboardPage.incomeModule.getText(), Income);
        CommonMethods.assertEquals(dashboardPage.expensesModule.getText(), expenses);
        CommonMethods.assertEquals(dashboardPage.academicsModule.getText(), academics);
        CommonMethods.assertEquals(dashboardPage.humanResourceModule.getText(), humanResource);
        CommonMethods.assertEquals(dashboardPage.homeworkModule.getText(), homework);
        CommonMethods.assertEquals(dashboardPage.reportsModule.getText(), reports);
    }

    /**
     * Asserts that the following submodules are displayed on the dashboard page.
     *
     * @param studentDetails    The expected text for the student details submodule.
     * @param studentAdmission  The expected text for the student admission submodule.
     * @param disabledStudents  The expected text for the disabled students submodule.
     * @param bulkDelete        The expected text for the bulk delete submodule.
     * @param studentCategories The expected text for the student categories submodule.
     * @param studentHouse      The expected text for the student house submodule.
     * @param disableReason     The expected text for the disable reason submodule.
     */
    public static void the_following_submodules_are_displayed(String studentDetails, String studentAdmission, String disabledStudents, String bulkDelete, String studentCategories, String studentHouse, String disableReason) {
        assertEquals(studentDetails, dashboardPage.studentDetailsSubModule.getText());
        assertEquals(studentAdmission, dashboardPage.studentAdmissionSubModule.getText());
        assertEquals(disabledStudents, dashboardPage.disabledStudentsSubModule.getText());
        assertEquals(bulkDelete, dashboardPage.bulkDeleteSubModule.getText());
        assertEquals(studentCategories, dashboardPage.studentCategoriesSubModule.getText());
        assertEquals(studentHouse, dashboardPage.studentHouseSubModule.getText());
        assertEquals(disableReason, dashboardPage.disableReasonSubModule.getText());
    }
}