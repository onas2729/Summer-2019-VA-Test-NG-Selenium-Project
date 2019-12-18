package com.cybertek.AssigmentTestCase4;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase4 extends TestBase {
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
        driver.findElement(By.xpath("//a[@title='Create Calendar event']")).click();
        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@title='Cancel']")).click();

        WebElement AllCalendarEvents=driver.findElement(By.xpath("//*[@id='container']/div/div/div/div/div/div/div/div/div/h1"));
        System.out.println(AllCalendarEvents.getText());
        Assert.assertTrue(AllCalendarEvents.isDisplayed());
    }
}