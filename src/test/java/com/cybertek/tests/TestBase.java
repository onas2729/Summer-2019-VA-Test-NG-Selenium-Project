package com.cybertek.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    protected  String url;
    protected Actions actions;


    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;

    @BeforeTest
    public void setUpTest(){
        report= new ExtentReports();
        String path= System.getProperty("user.dir")+"/test-output/report.html";
        htmlReporter= new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("Regression Tests");

        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));
    }

    @AfterTest
    public void tearDownTest(){
        report.flush();
    }

    @BeforeMethod
    public void setupMethod (){
        driver= Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        url= ConfigurationReader.get("url");
        driver.get(url);


        actions=new Actions(driver);
    }

    @AfterMethod
    public void tearDownMethod (ITestResult result) throws InterruptedException, IOException {
        // if failed take screenshot
        if (result.getStatus()==ITestResult.FAILURE){
            // record the name of the failed testcase
            extentLogger.fail(result.getName());

            // take screenshot and return location of the screenshot
            String screenshot= BrowserUtils.getScreenshot(result.getName());
            extentLogger.addScreencastFromPath(screenshot);
            //capture the exception
            extentLogger.fail(result.getThrowable());
        }else if (result.getStatus()==ITestResult.SKIP){
            // sometime tests are skipped, this is how we log skipped tests
            extentLogger.skip("Test skipped"+result.getName());
        }
        //Close Browser
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
