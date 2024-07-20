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

    /**
     * Represents the WebElement for the student's photo in the StudentAdmissionPage class.
     */
    @FindBy(xpath = "(//input[@id='file'])[1]")
    public WebElement studentPhoto;

    /**
     * Represents the WebElement for the father's photo in the StudentAdmissionPage class.
     */
    @FindBy(xpath = "(//input[@id='file'])[2]")
    public WebElement fatherPhoto;

    /**
     * Represents an input element for uploading a photo of the mother.
     */
    @FindBy(xpath = "(//input[@id='file'])[3]")
    public WebElement motherPhoto;

    /**
     * Represents an input element for uploading a photo of the guardian.
     */
    @FindBy(xpath = "(//input[@id='file'])[4]")
    public WebElement guardianPhoto;

    /**
     * Represents the add more details text box on the Student Admission Page.
     */
    @FindBy(xpath = "//a[normalize-space()='Add More Details']")
    public WebElement addMoreDetailsBox;

    /**
     * Represents a checkbox for the guardian address on the Student Admission page.
     */
    @FindBy(xpath = "//input[@id='autofill_current_address']")
    public WebElement guardianAddressCheckBox;

    /**
     * Represents a checkbox for the student's permanent address on the Student Admission page.
     */
    @FindBy(xpath = "//input[@id='autofill_address']")
    public WebElement permanentAddressCheckBox;

    /**
     * Represents a text box for the student's current address on the Student Admission page.
     */
    @FindBy(xpath = "//textarea[@id='current_address']")
    public WebElement currentAddressTextBox;

    /**
     * Represents a text box for the student's permanent address on the Student Admission page.
     */
    @FindBy(xpath = "//textarea[@id='permanent_address']")
    public WebElement permanentAddressTextBox;

    /**
     * Represents a bank account number text box on the Student Admission page.
     */
    @FindBy(xpath = "//input[@id='bank_account_no']")
    public WebElement bankAccountNumberTextBox;

    /**
     * Represents a bank name text box on the Student Admission page.
     */
    @FindBy(xpath = "//input[@id='bank_name']")
    public WebElement bankNameTextBox;

    /**
     * Represents the ifsc code text box on the Student Admission page.
     */
    @FindBy(xpath = "//input[@id='ifsc_code']")
    public WebElement ifscCodeTextBox;

    /**
     * Represents the national ID number text box on the Student Admission page.
     */
    @FindBy(xpath = "//input[@id='adhar_no']")
    public WebElement nationalIDNumberTextBox;

    /**
     * Represents the local ID number text box on the Student Admission page.
     */
    @FindBy(xpath = "//input[@id='samagra_id']")
    public WebElement localIDNumberTextBox;

    /**
     * Represents the rte 'Yes' radio button on the Student Admission page.
     */
    @FindBy(xpath = "//input[@value='Yes']")
    public WebElement rteYesButton;

    /**
     * Represents the previous school details text box on the Student Admission page.
     */
    @FindBy(xpath = "//textarea[@name='previous_school']")
    public WebElement previousSchoolDetailsTextBox;

    /**
     * Represents the note text box on the Student Admission page.
     */
    @FindBy(xpath = "//textarea[@name='note']")
    public WebElement noteTextBox;

    /**
     * Represents the title one text box on the Student Admission page.
     */
    @FindBy(xpath = "//input[@name='first_title']")
    public WebElement titleOneTextBox;

    /**
     * Represents the WebElement to upload a document for title one on the StudentAdmissionPage class.
     */
    @FindBy(xpath = "//input[@name='first_doc']")
    public WebElement documentOne;

    /**
     * Represents the title two text box on the Student Admission page.
     */
    @FindBy(xpath = "//input[@name='second_title']")
    public WebElement titleTwoTextBox;

    /**
     * Represents the WebElement to upload a document for title one on the StudentAdmissionPage class.
     */
    @FindBy(xpath = "//input[@name='second_doc']")
    public WebElement documentTwo;

    /**
     * Represents the title three text box on the Student Admission page.
     */
    @FindBy(xpath = "//input[@name='fourth_title']")
    public WebElement titleThreeTextBox;

    /**
     * Represents the WebElement to upload a document for title one on the StudentAdmissionPage class.
     */
    @FindBy(xpath = "//input[@name='fourth_doc']")
    public WebElement documentThree;

    /**
     * Represents the title four text box on the Student Admission page.
     */
    @FindBy(xpath = "//input[@name='fifth_title']")
    public WebElement titleFourTextBox;

    /**
     * Represents the WebElement to upload a document for title one on the StudentAdmissionPage class.
     */
    @FindBy(xpath = "//input[@name='fifth_doc']")
    public WebElement documentFour;

    /**
     * Represents the add sibling button on the Student Admission page.
     */
    @FindBy(xpath = "//button[normalize-space()='Add Sibling']")
    public WebElement addSiblingButton;

    /**
     * Represents the add sibling class dropdown WebElement on the Student Admission page.
     */
    @FindBy(xpath = "//select[@id='sibiling_class_id']")
    public WebElement siblingClassDropDown;

    /**
     * Represents the add sibling section dropdown WebElement on the Student Admission page.
     */
    @FindBy(xpath = "//select[@id='sibiling_section_id']")
    public WebElement siblingSectionDropDown;

    /**
     * Represents the add sibling student ID number dropdown WebElement on the Student Admission page.
     */
    @FindBy(xpath = "//select[@id='sibiling_student_id']")
    public WebElement siblingStudentIDDropDown;

    /**
     * Represents the add sibling student add information button WebElement on the Student Admission page.
     */
    @FindBy(xpath = "//button[@id='load']")
    public WebElement addSiblingInformationButton;

    /**
     * Represents the save button on the Student Admission page.
     */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement studentSavedSuccessfullyAlert;
}
