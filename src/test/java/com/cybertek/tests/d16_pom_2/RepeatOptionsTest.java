package com.cybertek.tests.d16_pom_2;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class RepeatOptionsTest extends TestBase {
    /*
    VERIFY RADIO BUTTONS
Open browser
Login as driver
Go to Activities —> Calenday Events
Click on crate calendar events
Click on repeat
Verify that repeat every days is checked
Verify that repeat weekday is not checked
     */

    @Test
    public void radioRepeatEveryReadioButtons(){
                //  Login as driver
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");
        loginPage.login(username,password);

                //  Go to Activities —> Calenday Events
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

                // Click on crate calendar events
        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEvent.click();

        // Click on repeat
        CreateCalendarEventsPage createCalendarEventsPage=new CreateCalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        createCalendarEventsPage.repeat.click();

        // Verify that repeat every days is checked
       Assert.assertTrue(createCalendarEventsPage.days.isSelected(), "Repeat every day(s) should be selected");

       // Verify that repeat weekday is not checked
        Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(), "Weekdays should not be selected");

    /*
    VERIFY REPEAT OPTIONS
Open browser
Login as driver
Go to Activities —> Calendar Events
Click on crate calendar events
Click on repeat
Verify that repeat options are Daily, Weekly, Monthly, Yearly (in this order)

     */


        }
    @Test
    public void repeatOptionsTest(){

        //  Login as driver
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");
        loginPage.login(username,password);

        //  Go to Activities —> Calenday Events
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        // Click on crate calendar events
        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEvent.click();

        // Click on repeat
        CreateCalendarEventsPage createCalendarEventsPage=new CreateCalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        createCalendarEventsPage.repeat.click();
        // Verify that repeat options are Daily, Weekly, Monthly, Yearly (in that order)
        List<String> expectedList= Arrays.asList("Daily", "Weekly", "Monthly", "Yearly");
       List<WebElement> options=createCalendarEventsPage.repeatOptionsList().getOptions();
       List <String> actualList=BrowserUtils.getElementsText(options);


       Assert.assertEquals(actualList, expectedList, "Repeat options did not match");
    }

}
