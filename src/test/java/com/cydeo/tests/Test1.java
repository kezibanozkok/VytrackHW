package com.cydeo.tests;

import com.cydeo.base.TestBase;
import com.cydeo.pages.DashboardPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test1 extends TestBase {

    @Test
    public void test1() {

        Assert.assertTrue(calendarEventsPage.option.isDisplayed(), "verify option link is displayed on the page");
    }

    @Test
    public void test2() {

        String pageValue = calendarEventsPage.pageNumber.getAttribute("value");

        Assert.assertEquals(pageValue, "1", "verify page number equals to 1");
    }

    @Test
    public void test3() {

        String viewPerPageValue = calendarEventsPage.viewPerPage.getAttribute("innerHTML").trim().substring(0,2);
        //System.out.println(viewPerPageValue);

        Assert.assertEquals(viewPerPageValue, "25", "verify view per page is equal to 25");
    }

    @Test
    public void test4() {

        String[] records = calendarEventsPage.numOfRecords.getText().split(" ");

        int actualRow = calendarEventsPage.tableRows.size();
        int expectedRow = Integer.parseInt(records[records.length-2]);

        Assert.assertEquals(actualRow, expectedRow, "verify row size equals to record");
    }

    @Test
    public void test5() {

        calendarEventsPage.selectAllCheckbox.click();

        for (WebElement ch: calendarEventsPage.tableCheckboxes) {
            Assert.assertTrue(ch.isSelected());
        }
    }

    @Test
    public void test6() {

        calendarEventsPage.testersMeeting.click();

        dashboardPage.waitUntilLoaderScreenDisappear();

        Map<String, String> expectedTable = new LinkedHashMap<>();
        expectedTable.put("Title","Testers Meeting");
        expectedTable.put("Description","This is a a weekly testers meeting");
        expectedTable.put("Start","Nov 27, 2019, 9:30 AM");
        expectedTable.put("End","Nov 27, 2019, 10:30 AM");
        expectedTable.put("All-Day Event","No");
        expectedTable.put("Organizer","John Doe");
        expectedTable.put("Recurrence","Weekly every 1 week on Wednesday");
        expectedTable.put("Call Via Hangout","No");

        Map<String, String> actualTable = new LinkedHashMap<>();

        for (WebElement info : calendarEventsPage.testersMeetingInfo) {
            String[] keyValue = info.getText().trim().split("\n");
            //    System.out.println( keyValue[0] + " : " + keyValue[1]);
            actualTable.put(keyValue[0], keyValue[1]);
        }
        Assert.assertEquals(actualTable,expectedTable);
    }
}
