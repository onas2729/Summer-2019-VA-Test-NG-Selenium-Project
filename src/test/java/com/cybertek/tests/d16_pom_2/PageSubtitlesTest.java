package com.cybertek.tests.d16_pom_2;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitlesTest extends TestBase {

    @Test
    public void verifySubtitlesTest(){
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");
        loginPage.login(username,password);

        DashboardPage dashboardPage=new DashboardPage();
        // get the page
        String actual=dashboardPage.getPageSubTitle();

        Assert.assertEquals(actual, "Quick Launchpad");
        // change pages
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        // get the subtitle of the new page
        actual=dashboardPage.getPageSubTitle();
        Assert.assertEquals(actual, "Calendar Events");
    }
}
