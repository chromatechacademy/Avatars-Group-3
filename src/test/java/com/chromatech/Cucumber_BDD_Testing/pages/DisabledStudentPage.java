package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisabledStudentPage {

    public DisabledStudentPage(){
        PageFactory.initElements(WebDriverUtils.driver,this);
    }
    /**
     * This variable represents the thumbs down icon element on the Dashed Student Page..
     */
    @FindBy(xpath = "(//a[@class='text-red'])[1]")
    public WebElement disableButton;

    @FindBy(xpath = "//select[@name='reason']")
    public  WebElement reasonDropdown;

    @FindBy(xpath = "//input[@name='comment']")
    public WebElement commentInput;

    @FindBy(xpath = "(//button[contains(text(), 'Save')])[3]")
    public WebElement submitButton;

    @FindBy(xpath = "//a[@class='text-green']")
    public WebElement enableButton;

}