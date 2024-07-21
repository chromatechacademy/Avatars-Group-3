package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentAdmissionPage {

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /* Admission Number Text Box */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNoTextBox;

    /* Roll Number Text Box */
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumberTextBox;

    /* Class Select Dropdown */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    /* Section Dropdown */
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    /* First Name Text Box */
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    /* Last Name Text Box */
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    /* Gender Dropdown */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    /* The Date Of Birth Text Box */
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthTextBox;

    /* Category dropdown  */
    @FindBy(xpath = "//select[@id='category_id']")
    public WebElement categoryDropDown;

    /* Email Text Box */
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    /* Admission Date Text Box */
    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDateTextBox;

    /* Blood Group Dropdown */
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    /* As On Date Datepicker */
    @FindBy(xpath = "//input[@id='measure_date']")
    public WebElement asOnDate;

    /* Mobile Number Text Box */
    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement mobileNumberTextBox;

    /* Height Text Box*/
    @FindBy(xpath = "//label[normalize-space()='Height']/following-sibling::input")
    public WebElement heightTextBox;

    /* Weight Text Box*/
    @FindBy(xpath = "//label[normalize-space()='Weight']/following-sibling::input")
    public WebElement weightTextBox;

    /* Father Name Text Box */
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameTextBox;

    /* Father Phone Number Text Box */
    @FindBy(xpath = "//input[@id='father_phone']")
    public WebElement fatherPhoneTextBox;

    /* Father Radio Button */
    @FindBy(xpath = "//input[@value='father']")
    public WebElement fatherRadioButton;

    /* Father Occupation Text Box */
    @FindBy(xpath = "//input[@id='father_occupation']")
    public WebElement fatherOccupationTextBox;

    /* Mother Name Text Box */
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherNameTextBox;

    /* Mother Phone Number Text Box */
    @FindBy(xpath = "//input[@id='mother_phone']")
    public WebElement motherPhoneTextBox;

    /* Mother Occupation Text Box */
    @FindBy(xpath = "//input[@id='mother_occupation']")
    public WebElement motherOccupationTextBox;

    /* Mother Radio Button */
    @FindBy(xpath = "//input[@value='mother']")
    public WebElement motherRadioButton;

    /* Guardian Name Text Box */
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianNameTextBox;

    /* Guardian Email Text Box */
    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement guardianEmailTextBox;

    /* Guardian Phone Number Text Box */
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneTextBox;

    /* Guardian Occupation Text Box */
    @FindBy(xpath = "//input[@id='guardian_occupation']")
    public WebElement guardianOccupationTextBox;

    /* Guardian Address Text Box */
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement guardianAddressTextBox;

    /* Student Photo Upload Element */
    @FindBy(xpath = "(//input[@id='file'])[1]")
    public WebElement studentPhoto;

    /* Father Photo Upload Element */
    @FindBy(xpath = "(//input[@id='file'])[2]")
    public WebElement fatherPhoto;

    /* Mother Photo Upload Element */
    @FindBy(xpath = "(//input[@id='file'])[3]")
    public WebElement motherPhoto;

    /* Guardian Photo Upload Element */
    @FindBy(xpath = "(//input[@id='file'])[4]")
    public WebElement guardianPhoto;

    /* Add More Details Bar */
    @FindBy(xpath = "//a[normalize-space()='Add More Details']")
    public WebElement addMoreDetailsBox;

    /* Guardian Address Check Box */
    @FindBy(xpath = "//input[@id='autofill_current_address']")
    public WebElement guardianAddressCheckBox;

    /* Permanent Address Check Box */
    @FindBy(xpath = "//input[@id='autofill_address']")
    public WebElement permanentAddressCheckBox;

    /* Current Address Check Box */
    @FindBy(xpath = "//textarea[@id='current_address']")
    public WebElement currentAddressTextBox;

    /* Permanent Address Text Box */
    @FindBy(xpath = "//textarea[@id='permanent_address']")
    public WebElement permanentAddressTextBox;

    /* Bank Account Number Text Box */
    @FindBy(xpath = "//input[@id='bank_account_no']")
    public WebElement bankAccountNumberTextBox;

    /* Bank Name Text Box */
    @FindBy(xpath = "//input[@id='bank_name']")
    public WebElement bankNameTextBox;

    /* IFSC Code Text Box */
    @FindBy(xpath = "//input[@id='ifsc_code']")
    public WebElement ifscCodeTextBox;

    /* National ID Number Text Box */
    @FindBy(xpath = "//input[@id='adhar_no']")
    public WebElement nationalIDNumberTextBox;

    /* Local ID Number Text Box */
    @FindBy(xpath = "//input[@id='samagra_id']")
    public WebElement localIDNumberTextBox;

    /* rte 'Yes' Radio Button */
    @FindBy(xpath = "//input[@value='Yes']")
    public WebElement rteYesButton;

    /* Previous School Details Text Box */
    @FindBy(xpath = "//textarea[@name='previous_school']")
    public WebElement previousSchoolDetailsTextBox;

    /* Note Text Box */
    @FindBy(xpath = "//textarea[@name='note']")
    public WebElement noteTextBox;

    /* Title One Text Box */
    @FindBy(xpath = "//input[@name='first_title']")
    public WebElement titleOneTextBox;

    /* Title One Photo Upload Element */
    @FindBy(xpath = "//input[@name='first_doc']")
    public WebElement documentOne;

    /* Title Two Text Box */
    @FindBy(xpath = "//input[@name='second_title']")
    public WebElement titleTwoTextBox;

    /* Title Two Photo Upload Element */
    @FindBy(xpath = "//input[@name='second_doc']")
    public WebElement documentTwo;

    /* Title Three Text Box */
    @FindBy(xpath = "//input[@name='fourth_title']")
    public WebElement titleThreeTextBox;

    /* Title Three Photo Upload Element */
    @FindBy(xpath = "//input[@name='fourth_doc']")
    public WebElement documentThree;

    /* Title Four Text Box */
    @FindBy(xpath = "//input[@name='fifth_title']")
    public WebElement titleFourTextBox;

    /* Title Four Photo Upload Element */
    @FindBy(xpath = "//input[@name='fifth_doc']")
    public WebElement documentFour;

    /* Add Sibling Button */
    @FindBy(xpath = "//button[normalize-space()='Add Sibling']")
    public WebElement addSiblingButton;

    /* Add Sibling Class Dropdown */
    @FindBy(xpath = "//select[@id='sibiling_class_id']")
    public WebElement siblingClassDropDown;

    /* Add Sibling Section Dropdown */
    @FindBy(xpath = "//select[@id='sibiling_section_id']")
    public WebElement siblingSectionDropDown;

    /* Add Sibling Student ID Dropdown */
    @FindBy(xpath = "//select[@id='sibiling_student_id']")
    public WebElement siblingStudentIDDropDown;

    /* Add Sibling Add Information Button */
    @FindBy(xpath = "//button[@id='load']")
    public WebElement addSiblingInformationButton;

    /* Save Button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* Saved Successfully Alert */
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement studentSavedSuccessfullyAlert;
}

