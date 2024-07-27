package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import com.chromatech.utils.WebDriverUtils;

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
     * This method verifies if the expense head is displayed in the list and is able to be deleted.
     * It first scrolls the page to bring the expense head into view,
     * then checks if the expense head is displayed in the list using the isElementDisplayed method from the CommonMethods class.
     * Next, it clicks on the delete sign to remove the expense head from the list.
     * Finally, it accepts the alert to confirm deletion.
     */
    public static void expense_head_is_displayed_in_the_list_and_able_to_delete_it() {
        JavascriptMethods.scrollIntoView(addExpenseAndRemovePage.expenseHeadResult);
        CommonMethods.isElementDisplayed(addExpenseAndRemovePage.expenseHeadResult);
        addExpenseAndRemovePage.deleteSign.click();
        CommonMethods.sleep(100);
        CommonMethods.acceptAlert();
    }

    /**
     * Navigates the user to the add expense page on the site and verifies the expected URL.
     *
     * @param expectedUrl The expected URL of the add expense page.
     */
    public static void user_navigates_on_the_add_expense_page_site(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonMethods.assertEquals(actualUrl, expectedUrl);
    }

    /**
     * Verifies if the user is in the dashboard page by comparing the current URL with the expected URL.
     *
     * @param expectedUrl The expected URL of the dashboard page.
     */
    public static void the_user_is_in_the_dashboard_page(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonMethods.assertEquals(actualUrl, expectedUrl);
    }

    /**
     * Verifies if the user is directed to the CTMS search page by comparing the current URL with the expected URL.
     *
     * @param expectedUrl The expected URL of the CTMS search page.
     */
    public static void the_user_is_the_directed_to_the_ctms_search_page(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonMethods.assertEquals(actualUrl, expectedUrl);

    }

    /**
     * Deletes the expense from the list with the given name.
     * It clicks on the delete button for the expense in the list,
     * then accepts the alert to confirm the deletion.
     */
    public static void delete_the_expense_list_is_displayed_name() {
        addingExpensePage.deleteExpense.click();
        CommonMethods.acceptAlert();
    }
}
