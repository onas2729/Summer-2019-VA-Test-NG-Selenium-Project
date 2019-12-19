package com.cybertek.AssigmentTestCase4;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCase6 extends TestBase {
    @Test
    public void test1() throws InterruptedException {
        extentLogger = report.createTest("Choose start time 9 and Verify that end time is 10");
        extentLogger.info("Log in under store manager");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        loginPage.login(username, password);
        DashboardPage dashboardPage = new DashboardPage();
        extentLogger.info("Go to Calendar Events");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        extentLogger.info("Wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        extentLogger.info("click on create calendar event");
        calendarEventsPage.createCalendarEvent.click();
        extentLogger.info("wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        extentLogger.info("click on start time");
        createCalendarEventsPage.startTime.click();
        extentLogger.info("choose 9 pm");

        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.id("time_selector_oro_calendar_event_form_start-uid-5df6cc8ccea2d"));
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        //  driver.findElement(By.className("ui-timepicker-pm ui-timepicker-selected")).click();
        // dragAndDrop --> drags the source to target
        driver.findElement(By.xpath("//li[.='9:00 PM']")).click();
        //  createCalendarEventsPage.NinePM.click();
        extentLogger.info("get time from end time ");
        createCalendarEventsPage.endTime.getAttribute("value");
        System.out.println(createCalendarEventsPage.endTime.getAttribute("value"));
        extentLogger.info("verify time equal 10:00 pm ");
        Assert.assertEquals(createCalendarEventsPage.endTime.getAttribute("value"), "10:00 PM");
    }

    @Test
    public void TestCase7() {
        extentLogger = report.createTest("Verify start and end time not displayed; Verify start and end time displayed");
        extentLogger.info("Log in under store manager");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        loginPage.login(username, password);
        DashboardPage dashboardPage = new DashboardPage();
        extentLogger.info("Go to Calendar Events");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        extentLogger.info("Wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        extentLogger.info("click on create calendar event");
        calendarEventsPage.createCalendarEvent.click();
        extentLogger.info("wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("click on All Day Event checkBox");
        // createCalendarEventsPage.AllDayEvent.click();

        WebElement AllDayEvent = driver.findElement(By.xpath("//input[@name='oro_calendar_event_form[allDay]']"));
        AllDayEvent.click();
        Assert.assertTrue(AllDayEvent.isSelected());

        BrowserUtils.waitFor(3);
        extentLogger.info("Check that start time IS not Displayed");
        Assert.assertFalse(createCalendarEventsPage.startTime.isDisplayed());
        extentLogger.info("Check that end time IS not Displayed");
        Assert.assertFalse(createCalendarEventsPage.endTime.isDisplayed());

        extentLogger.info("All Day Event checkBox is not selected");
        WebElement AllDayEvent1 = driver.findElement(By.xpath("//input[@name='oro_calendar_event_form[allDay]']"));
        AllDayEvent1.click();

        BrowserUtils.waitFor(3);
        extentLogger.info("Check that start date IS Displayed");
        Assert.assertTrue(createCalendarEventsPage.startDate.isDisplayed());
        extentLogger.info("Check that end date IS Displayed");
        Assert.assertTrue(createCalendarEventsPage.endDate.isDisplayed());
        System.out.println("end date is displayed" + createCalendarEventsPage.endDate.getText());
    }

    @Test
    public void TestCase8() {
        extentLogger = report.createTest("Verify start and end time not displayed; Verify start and end time displayed");
        extentLogger.info("Log in under store manager");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        loginPage.login(username, password);
        DashboardPage dashboardPage = new DashboardPage();
        extentLogger.info("Go to Calendar Events");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        extentLogger.info("Wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        extentLogger.info("click on create calendar event");
        calendarEventsPage.createCalendarEvent.click();
        extentLogger.info("wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Select repeat checkbox");
        createCalendarEventsPage.repeat.click();
        extentLogger.info("Verify “Repeat” checkbox is selected");
        Assert.assertTrue(createCalendarEventsPage.repeat.isSelected());

        Assert.assertEquals(createCalendarEventsPage.repeatOptions.getAttribute("value"), "daily");
        BrowserUtils.waitFor(2);
        Select select = new Select(createCalendarEventsPage.repeatOptions);
        List<WebElement> options = select.getOptions();
        //   System.out.println(options.size());
        String[] choose = {"Daily", "Weekly", "Monthly", "Yearly"};
        int i= 0;
        for(WebElement opt: options){
            Assert.assertEquals(choose[i], opt.getText());
            i++;
        }
        System.out.println(Arrays.toString(choose));

    }

    @Test
    public void TestCase9(){
        extentLogger = report.createTest("Verify start and end time not displayed; Verify start and end time displayed");
        extentLogger.info("Log in under store manager");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        loginPage.login(username, password);
        DashboardPage dashboardPage = new DashboardPage();
        extentLogger.info("Go to Calendar Events");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        extentLogger.info("Wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        extentLogger.info("click on create calendar event");
        calendarEventsPage.createCalendarEvent.click();
        extentLogger.info("wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Select repeat checkbox");
        createCalendarEventsPage.repeat.click();
        extentLogger.info("Verify “Repeat” checkbox is selected");
        Assert.assertTrue(createCalendarEventsPage.repeat.isSelected());

        extentLogger.info("Verify “Repeat Every” radio button is selected");
        driver.findElement(By.xpath("//input[@type='radio'][@checked='checked']")).click();

        extentLogger.info("Verify “Never” radio button is selected");
        System.out.println("“Never” radio button is selected "+createCalendarEventsPage.never.isSelected());

        extentLogger.info("as a summary is displayed: “Summary: Daily every 1 day”  ");
        WebElement SummaryMessage=driver.findElement(By.xpath("//div[@class='control-group recurrence-summary alert-info']"));
        System.out.println("Summary: Daily every 1 day "+SummaryMessage.isDisplayed());
    }

    @Test
    public void TestCase10(){
        extentLogger = report.createTest("Verify start and end time not displayed; Verify start and end time displayed");
        extentLogger.info("Log in under store manager");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        loginPage.login(username, password);
        DashboardPage dashboardPage = new DashboardPage();
        extentLogger.info("Go to Calendar Events");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        extentLogger.info("Wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        extentLogger.info("click on create calendar event");
        calendarEventsPage.createCalendarEvent.click();
        extentLogger.info("wait loading element disappear");
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Select repeat checkbox");
        createCalendarEventsPage.repeat.click();
        extentLogger.info("Select After 10 occurrences");
       // createCalendarEventsPage.after.click();
        BrowserUtils.waitFor(5);
        WebElement after= driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
        BrowserUtils.waitFor(2);
        after.click();
        BrowserUtils.waitFor(2);
        WebElement after10=driver.findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[7]"));
               after10.sendKeys("10");
        BrowserUtils.waitFor(2);
        after10.submit();


//
       extentLogger.info("Verify Summary: Daily every 1 day, end after 10 occurrences ");
       WebElement SummaryMessage=driver.findElement(By.xpath("//div[@class='control-group recurrence-summary alert-info']"));
        System.out.println(SummaryMessage.getText());
        System.out.println("Summary: Daily every 1 day, end after 10 occurrences "+SummaryMessage.isDisplayed());
     Assert.assertEquals(SummaryMessage.getText().replace("\n", ""), "Summary:Daily every 1 day, end after 10 occurrences");

    }
}




