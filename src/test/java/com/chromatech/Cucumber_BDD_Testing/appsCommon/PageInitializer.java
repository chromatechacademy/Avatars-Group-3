package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentAdmissionPage;

public class PageInitializer {

    /**
     * THIS PAGE WILL BE USED TO INITIALIZE ALL
     * PAGE OBJECTS
     */

    public static StudentAdmissionPage studentAdmissionPage;
    public static DashboardPage dashboardPage;

    public static void initializeAllPages() {
        studentAdmissionPage = new StudentAdmissionPage();
        dashboardPage = new DashboardPage();
    }
}