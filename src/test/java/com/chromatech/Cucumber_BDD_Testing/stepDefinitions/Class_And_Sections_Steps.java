package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.ClassesPage;
import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.*;
import java.util.stream.Collectors;

public class Class_And_Sections_Steps {

    DashboardPage dashboardPage = new DashboardPage();
    ClassesPage classesPage = new ClassesPage();
    SoftAssert softAssert = new SoftAssert();

    @When("the user navigates to the Class submodule")
    public void the_user_navigates_to_the_class_submodule() {
        dashboardPage.academicsModule.click();
        dashboardPage.classClassSubModule.click();
    }

    @Then("there are two classes, SDET and Cyber Security displayed with the following sections:")
    public void there_are_two_classes_sdet_and_cyber_security_displayed_with_the_following_sections(DataTable expectedClassesTable) {
        List<Map<String, String>> expectedClassesList = expectedClassesTable.asMaps(String.class, String.class);

        Map<String, List<String>> expectedSectionsMap = new HashMap<>();
        for (Map<String, String> row : expectedClassesList) {
            String className = row.get("Class");
            List<String> sections = new ArrayList<>(Arrays.asList(row.get("Sections").split(", ")));

            if (expectedSectionsMap.containsKey(className)) {
                expectedSectionsMap.get(className).addAll(sections);
            } else {
                expectedSectionsMap.put(className, sections);
            }
        }

        List<WebElement> rows = classesPage.classesTable.findElements(By.xpath(".//tbody/tr"));
        Map<String, List<String>> actualClasses = new HashMap<>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.xpath(".//td"));
            String className = cells.get(0).getText();
            List<WebElement> sectionElements = cells.get(1).findElements(By.tagName("div"));
            List<String> sections = sectionElements.stream()
                    .map(WebElement::getText)
                    .collect(Collectors.toList());

            if (expectedSectionsMap.containsKey(className)) {
                actualClasses.put(className, sections);
            }
        }

        for (Map.Entry<String, List<String>> entry : expectedSectionsMap.entrySet()) {
            String className = entry.getKey();
            List<String> expectedSections = entry.getValue();
            Collections.sort(expectedSections);

            List<String> actualSections = actualClasses.get(className);
            if (actualSections != null) {
                Collections.sort(actualSections);
                softAssert.assertEquals(actualSections, expectedSections, "Mismatch in sections for class: " + className);
            } else {
                System.out.println("No actual sections found for " + className);
            }
        }

        softAssert.assertAll();
    }
}
