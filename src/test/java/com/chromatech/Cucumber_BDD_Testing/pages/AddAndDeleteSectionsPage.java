package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAndDeleteSectionsPage {

    public AddAndDeleteSectionsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    @FindBy(xpath = "//input[@id='section']")
    public WebElement sectionTextBox;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement clickSaveButton;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[17]/td[2]/a[2]/i[1]")
    public WebElement deleteButton;
}
