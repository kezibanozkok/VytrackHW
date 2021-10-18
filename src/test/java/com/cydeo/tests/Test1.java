package com.cydeo.tests;

import com.cydeo.base.TestBase;
import com.cydeo.pages.CalendarEventsPage;
import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends TestBase {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @Test
    public void test1() {

        loginPage.loginAsStoreManager();

        dashboardPage.navigateToModule("Activities", "Calendar Events");

        Assert.assertTrue(calendarEventsPage.option.isDisplayed(), "verify option link is displayed on the page");

    }

    @Test
    public void test2() {
        loginPage.loginAsStoreManager();

        dashboardPage.navigateToModule("Activities", "Calendar Events");

        String pageValue = calendarEventsPage.pageNumber.getAttribute("value");

        Assert.assertEquals(pageValue, "1", "verify page number equals to 1");
    }
}
