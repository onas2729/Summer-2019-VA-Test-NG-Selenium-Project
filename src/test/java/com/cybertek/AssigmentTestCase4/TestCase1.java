package com.cybertek.AssigmentTestCase4;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCase1 extends TestBase {


    @Test
    public void test1() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        driver.get(url);
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Calendar Events")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement element= driver.findElement(By.xpath("//table/tbody/tr[14]/td[9]"));
        actions.moveToElement(element).build().perform();

        WebElement view= driver.findElement(By.xpath("//a[@title='View']"));
        actions.moveToElement(view).build().perform();

        Assert.assertTrue(view.isDisplayed());
        System.out.println("View is available: "+view.isDisplayed());

        WebElement edit= driver.findElement(By.xpath("//a[@title='Edit']"));
        actions.moveToElement(edit).build().perform();

        Assert.assertTrue(edit.isDisplayed());
        System.out.println("Edit is available: "+edit.isDisplayed());

        WebElement delete = driver.findElement(By.xpath("(//i[@class='fa-trash-o hide-text'])[1]"));

        actions.moveToElement(delete).build().perform();

        Assert.assertTrue(delete.isDisplayed());
        System.out.println("Delete is available: " + delete.isDisplayed());

        }

    }


