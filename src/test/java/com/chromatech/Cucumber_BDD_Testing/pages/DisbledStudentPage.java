package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisbledStudentPage {


    /**
     * This variable represents the thumbs down icon element on the Dashed Student Page..
     */
    @FindBy(xpath = "//a[@class='text-red']")
    public WebElement disableButton;

    @FindBy(xpath = "//select[@name='reason']")
    public  WebElement reasonDropdown;

    @FindBy(xpath = "//input[@name='comment']")
    public WebElement commentInput;

    @FindBy(xpath = "//button[@class='submit-button']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[@class='text-green']")
    public WebElement enableButton;
}