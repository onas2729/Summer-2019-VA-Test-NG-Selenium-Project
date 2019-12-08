package com.cybertek.tests.d17_extent_reports;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReports extends TestBase {
    @Test
    public void wrongPasswordTest() {
        // if we dont add extentLogger=report.createTest, this test will not be in the html report
        extentLogger=report.createTest("Wrong password test");
        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter username: salesmanager101 ");
        loginPage.userName.sendKeys("salesmanager101");
        extentLogger.info("Enter Password: greatpassword ");
        loginPage.password.sendKeys("greatpassword");
        extentLogger.info("click submit");
        loginPage.submit.click();
        extentLogger.info("Verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/user/login");
        extentLogger.pass("PASS: Wrong Password Test");
    }

    // this test will fail
    @Test
    public void wrongUsernameTest() {
        // if we dont add extentLogger=report.createTest, this test will not be in the html report
        extentLogger=report.createTest("Wrong username test");
        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter username");
        loginPage.userName.sendKeys("salesmanager101");
        extentLogger.info("Enter Password");
        loginPage.password.sendKeys("greatpassword");
        extentLogger.info("click submit");
        loginPage.submit.click();
        extentLogger.info("Verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://google.com");
        extentLogger.pass("PASS: Wrong Username Test");
    }
}
