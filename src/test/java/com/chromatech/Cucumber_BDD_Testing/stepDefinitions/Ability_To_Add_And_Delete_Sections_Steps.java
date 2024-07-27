package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Ability_To_Add_And_Delete_Sections_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user navigates to the sections submodule")
    public void the_user_navigates_to_the_sections_submodule() {
        WebElement sectionsModule = driver.findElement(By.xpath("//a[normalize-space()='Sections']"));
        dashboardPage.sectionsSubModule.click();
    }

    @Then("the section is added")
    public void the_section_is_added() {
        WebElement addSectionButton = driver.findElement(By.xpath("//input[@id='section']"));
        WebElement element = driver.findElement(By.xpath("//input[@id='section']"));
        element.clear();
        element.sendKeys("TESTING MA");
        // Maybe some form filling here
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Save']")); //replace with actual id
        submitButton.click();
    }

    @Then("the user can also delete the section")
    public void the_user_can_also_delete_the_section() {
        CucumberLogUtils.logScreenShot();
        WebElement deleteSectionButton = driver.findElement(By.xpath("//tbody/tr[22]/td[2]/a[2]/i[1]"));
        deleteSectionButton.click();
        CommonMethods.sleep(100);
    }
}