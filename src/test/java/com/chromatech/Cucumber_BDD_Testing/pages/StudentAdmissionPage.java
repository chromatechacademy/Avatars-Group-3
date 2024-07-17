package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentAdmissionPage {

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNoTextBox;

    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumberTextBox;

    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthTextBox;

    @FindBy(xpath = "//select[@id='category_id']")
    public WebElement categoryDropDown;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDateTextBox;

    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    @FindBy(xpath = "//input[@id='measure_date']")
    public WebElement asOnDate;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement mobileNumberTextBox;

    @FindBy(xpath = "//label[normalize-space()='Height']/following-sibling::input")
    public WebElement heightTextBox;

    @FindBy(xpath = "//label[normalize-space()='Weight']/following-sibling::input")
    public WebElement weightTextBox;

    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameTextBox;

    @FindBy(xpath = "//input[@id='father_phone']")
    public WebElement fatherPhoneTextBox;

    @FindBy(xpath = "//input[@id='father_occupation']")
    public WebElement fatherOccupationTextBox;

    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherNameTextBox;

    @FindBy(xpath = "//input[@id='mother_phone']")
    public WebElement motherPhoneTextBox;

    @FindBy(xpath = "//input[@id='mother_occupation']")
    public WebElement motherOccupationTextBox;

    @FindBy(xpath = "//input[@value='mother']")
    public WebElement motherRadioButton;

    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianNamTextBox;

    @FindBy(xpath = "//input[@id='guardian_relation']")
    public WebElement guardianRelationTextBox;

    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement guardianEmailTextBox;

    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneTextBox;

    @FindBy(xpath = "//input[@id='guardian_occupation']")
    public WebElement guardianOccupationTextBox;

    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement guardianAddressTextBox;


}
