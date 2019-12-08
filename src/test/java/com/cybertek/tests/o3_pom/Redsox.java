package com.cybertek.tests.o3_pom;

import com.cybertek.pages.ContactInformationPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;

public class Redsox  extends TestBase{
/*
Wiki assignment
Go to https://www.wikipedia.org/
Enter redsox
Wait until all the search suggestions load
Verify that there are more that 1 search suggestions
Verify that first search suggestion starts with text Boston Red Sox

 */
WebDriver driver;
    @BeforeMethod
    public void setupMethod (){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        WebElement element= driver.findElement(By.xpath("//input[@id='searchInput']"));
        WebDriverWait wait=new WebDriverWait(driver, 30);
        // actually waits
        // waiting for the specific element to be visible
        wait.until(ExpectedConditions.visibilityOf(element));
        // click now that elemnt is visible

        element.sendKeys("redsox");

    }

    @AfterMethod
    public void tearDownMethod () throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void redsox() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> searchOptions=driver.findElements(By.xpath("//h3[@class='suggestion-title']"));
        System.out.println("search option size:" +searchOptions.size());
        String StartWith=searchOptions.get(0).getText();
        System.out.println(StartWith.startsWith("Boston Red Sox"));

        int actual= searchOptions.size();

        if (actual>1){
            Assert.assertTrue(true);
            System.out.println("PASS");
        }else {
            System.out.println("Fail");

        }

        WebElement element2= driver.findElement(By.xpath("(//h3[@class='suggestion-title'])[1]"));
        System.out.println(element2.getText());
        Assert.assertTrue(element2.isDisplayed());

        }

        @Test
    public void RedsoxMethod() throws InterruptedException {
            extentLogger = report.createTest("Wikipedia test");

            extentLogger.info("Go to wikipedia");
            driver.get("https://www.wikipedia.com");
            extentLogger.info("go to redsox");
            WebElement element = driver.findElement(By.id("searchInput"));
            element.click();
            element.sendKeys("redsox");
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOf(element));

            extentLogger.info("verify more than 1");
            List<WebElement> searchOptions = driver.findElements(By.className("suggestion-title"));
            System.out.println("search option size " + searchOptions.size());
            int expected = 6;
            int actual = searchOptions.size();
            if (actual >1) {
                Assert.assertTrue(true);
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
            extentLogger.info("verify start with boston red sox");
            List<WebElement> searchOptions1 = driver.findElements(By.className("suggestion-title"));
            String firstOption = searchOptions1.get(0).getText();
            System.out.println(firstOption.startsWith("Boston Red Sox"));
            extentLogger.pass("PASS");
        }



}


