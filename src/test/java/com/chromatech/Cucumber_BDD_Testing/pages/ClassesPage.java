package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.*;
import java.util.stream.Collectors;

public class ClassesPage {
    SoftAssert softAssert = new SoftAssert();

    public ClassesPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    @FindBy(xpath = "//table[@role='grid']")
    public WebElement classesTable;

    public void comparingTables(DataTable expectedClassesTable) {
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

        List<WebElement> rows = classesTable.findElements(By.xpath(".//tbody/tr"));
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
