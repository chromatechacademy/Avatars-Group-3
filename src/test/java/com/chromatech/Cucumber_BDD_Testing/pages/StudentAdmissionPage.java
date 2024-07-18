package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentAdmissionPage {

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /**
     * Represents the admission number text box on the student admission page.
     */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNoTextBox;

    /**
     * Represents the roll number text box element on the Student Admission page.
     */
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumberTextBox;

    /**
     * Represents a WebElement for the class dropdown on the Student Admission Page.
     */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    /**
     * Represents the section drop-down element on the Student Admission page.
     */
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    /**
     * Represents a text box element for entering the first name.
     */
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    /**
     * Represents the last name text box element on the Student Admission Page.
     */
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    /**
     * Represents a dropdown element for selecting gender.
     */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    /**
     * The dateOfBirthTextBox variable is a WebElement representing a text box element
     */
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthTextBox;

    /**
     * Represents a web element for the category dropdown on the StudentAdmissionPage.
     */
    @FindBy(xpath = "//select[@id='category_id']")
    public WebElement categoryDropDown;

    /**
     * Represents the email text box element on the Student Admission Page.
     */
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    /**
     * Represents the admission date text box on the student admission page.
     */
    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDateTextBox;

    /**
     * Represents the blood group dropdown element in the StudentAdmissionPage class.
     */
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    /**
     * Represents the "asOnDate" element on the web page.
     */
    @FindBy(xpath = "//input[@id='measure_date']")
    public WebElement asOnDate;

    /**
     * This variable represents the mobile number text box element on the Student Admission Page.
     */
    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement mobileNumberTextBox;

    /**
     * Represents a textbox element for entering height information on the Student Admission Page.
     */
    @FindBy(xpath = "//label[normalize-space()='Height']/following-sibling::input")
    public WebElement heightTextBox;

    /**
     * Represents a WebElement for the weight text box on the page.
     */
    @FindBy(xpath = "//label[normalize-space()='Weight']/following-sibling::input")
    public WebElement weightTextBox;

    /**
     * Represents the father name text box in the Student Admission Page.
     */
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameTextBox;

    /**
     * Represents the father's phone number text box on the Student Admission Page.
     */
    @FindBy(xpath = "//input[@id='father_phone']")
    public WebElement fatherPhoneTextBox;

    /**
     * Represents the father's occupation text box element on the Student Admission page.
     */
    @FindBy(xpath = "//input[@id='father_occupation']")
    public WebElement fatherOccupationTextBox;

    /**
     * Represents a WebElement object for the mother's name text box on the Student Admission Page..
     */
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherNameTextBox;

    /**
     * Represents the motherPhoneTextBox element on the StudentAdmissionPage.
     */
    @FindBy(xpath = "//input[@id='mother_phone']")
    public WebElement motherPhoneTextBox;

    /**
     * Text box element for mother's occupation in the Student Admission Page.
     */
    @FindBy(xpath = "//input[@id='mother_occupation']")
    public WebElement motherOccupationTextBox;

    /**
     * Represents the mother radio button element on the Student Admission page.
     */
    @FindBy(xpath = "//input[@value='mother']")
    public WebElement motherRadioButton;

    /**
     * WebElement representing the guardian name text box on the Student Admission Page.
     */
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianNameTextBox;

    /**
     * Represents the guardian relation text box element on the Student Admission page.
     */
    @FindBy(xpath = "//input[@id='guardian_relation']")
    public WebElement guardianRelationTextBox;

    /**
     * WebElement for the guardian email text box on the Student Admission Page.
     */
    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement guardianEmailTextBox;

    /**
     * WebElement representing the guardian phone text box on the Student Admission Page.
     */
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneTextBox;

    /**
     * Represents the guardian occupation text box on the Student Admission Page.
     */
    @FindBy(xpath = "//input[@id='guardian_occupation']")
    public WebElement guardianOccupationTextBox;

    /**
     * Represents the guardian address text box on the Student Admission page.
     */
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement guardianAddressTextBox;

    @FindBy(xpath = "(//input[@id='file'])[1]")
    public WebElement studentPhoto;

    @FindBy(xpath = "(//input[@id='file'])[2]")
    public WebElement fatherPhoto;

    @FindBy(xpath = "(//input[@id='file'])[3]")
    public WebElement motherPhoto;

    @FindBy(xpath = "(//input[@id='file'])[4]")
    public WebElement guardianPhoto;

    @FindBy(xpath = "//a[normalize-space()='Add More Details']")
    public WebElement addMoreDetailsBox;

    @FindBy(xpath = "//input[@id='autofill_current_address']")
    public WebElement guardianAddressCheckBox;

    @FindBy(xpath = "//input[@id='autofill_address']")
    public WebElement permanentAddressCheckBox;

    @FindBy(xpath = "//textarea[@id='current_address']")
    public WebElement currentAddressTextBox;

    @FindBy(xpath = "//textarea[@id='permanent_address']")
    public WebElement permanentAddressTextBox;

    @FindBy(xpath = "//input[@id='bank_account_no']")
    public WebElement bankAccountNumberTextBox;

    @FindBy(xpath = "//input[@id='bank_name']")
    public WebElement bankNameTextBox;

    @FindBy(xpath = "//input[@id='ifsc_code']")
    public WebElement ifscCodeTextBox;

    @FindBy(xpath = "//input[@id='adhar_no']")
    public WebElement nationalIDNumberTextBox;

    @FindBy(xpath = "//input[@id='samagra_id']")
    public WebElement localIDNumberTextBox;

    @FindBy(xpath = "//input[@value='Yes']")
    public WebElement rteYesButton;

    @FindBy(xpath = "//textarea[@name='previous_school']")
    public WebElement previousSchoolDetailsTextBox;

    @FindBy(xpath = "//textarea[@name='note']")
    public WebElement noteTextBox;

    @FindBy(xpath = "//input[@name='first_title']")
    public WebElement titleOneTextBox;

    @FindBy(xpath = "//input[@name='first_doc']")
    public WebElement documentOne;

    @FindBy(xpath = "//input[@name='second_title']")
    public WebElement titleTwoTextBox;

    @FindBy(xpath = "//input[@name='second_doc']")
    public WebElement documentTwo;

    @FindBy(xpath = "//input[@name='fourth_title']")
    public WebElement titleThreeTextBox;

    @FindBy(xpath = "//input[@name='fourth_doc']")
    public WebElement documentThree;

    @FindBy(xpath = "//input[@name='fifth_title']")
    public WebElement titleFourTextBox;

    @FindBy(xpath = "//input[@name='fifth_doc']")
    public WebElement documentFour;

    @FindBy(xpath = "//button[normalize-space()='Add Sibling']")
    public WebElement addSiblingButton;

    @FindBy(xpath = "//select[@id='sibiling_class_id']")
    public WebElement siblingClassDropDown;

    @FindBy(xpath = "//select[@id='sibiling_section_id']")
    public WebElement siblingSectionDropDown;

    @FindBy(xpath = "//select[@id='sibiling_student_id']")
    public WebElement siblingStudentIDDropDown;

    @FindBy(xpath = "//button[@id='load']")
    public WebElement addSiblingInformationButton;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;
}
