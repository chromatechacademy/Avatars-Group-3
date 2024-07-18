package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /**
     * Represents the Human Resource module WebElement on the login page.
     */
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;

    /**
     * Represents the WebElement for the Staff Directory link on the Dashboard page.
     */
    @FindBy(xpath = "//ul[contains(@class,'treeview-menu menu-open')]//a[normalize-space()='Staff Directory']")
    public WebElement staffDirectorySubModule;

    /**
     * Represents the WebElement for the Staff Attendance link on the Dashboard page.
     */
    @FindBy(xpath = "//ul[contains(@class,'treeview-menu menu-open')]//a[normalize-space()='Staff Attendance']")
    public WebElement staffAttendanceSubModule;

    /**
     * Represents the WebElement for the Payroll link on the Dashboard page.
     */
    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public WebElement payrollSubModule;

    /**
     * Represents the WebElement for the ApproveLeaveRequest link on Dashboard page.
     */
    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public WebElement approveLeaveRequestSubModule;

    /**
     * Represents the WebElement for the Apply Leave link on the Dashboard page.
     */
    @FindBy(xpath = "//a[normalize-space()='Apply Leave']")
    public WebElement applyLeaveSubModule;

    /**
     * Represents the WebElement for the Leave Type link on the Dashboard page.
     */
    @FindBy(xpath = "//a[normalize-space()='Leave Type']")
    public WebElement leaveTypeSubModule;

    /**
     * Represents the WebElement for the Teachers Rating link on the Dashboard page.
     */
    @FindBy(xpath = "//a[normalize-space()='Teachers Rating']")
    public WebElement teachersRatingSubModule;

    /**
     * Represents the Department link WebElement in the DashboardPage class.
     */
    @FindBy(xpath = "//a[normalize-space()='Department']")
    public WebElement departmentSubModule;

    /**
     * Represents the Designation link WebElement in the DashboardPage class.
     */
    @FindBy(xpath = "//a[normalize-space()='Designation']")
    public WebElement designationSubModule;

    /**
     * Represents the WebElement for the Student Information module on the Dashboard page.
     */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    /**
     * Represents the WebElement for the Student Admission submodule on the Dashboard page.
     */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionSubModule;
}