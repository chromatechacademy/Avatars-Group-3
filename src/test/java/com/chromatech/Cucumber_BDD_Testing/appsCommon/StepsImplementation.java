package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;

public class StepsImplementation extends PageInitializer{

    /**
     * Fills out all the required fields with the provided values such as admission number, class section,
     * first name, gender, date of birth, guardian name, and guardian phone number.
     *
     * @param admissionNo The admission number of the student.
     * @param classOption The class option of the student.
     * @param sectionOption The section option of the student.
     * @param firstName The first name of the student.
     * @param genderOption The gender option of the student.
     * @param dateOfBirth The date of birth of the student.
     * @param guardianName The guardian name of the student.
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
}
