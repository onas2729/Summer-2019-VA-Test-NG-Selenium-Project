package com.cybertek.AssigmentTestCase4;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase2 extends TestBase {
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

        driver.findElement(By.xpath("//i[@class='fa-cog hide-text']")).click();
        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//table)[2]/tbody/tr[2]/td[3]")).click();
//        driver.findElement(By.xpath("(//table)[2]/tbody/tr[3]/td[3]")).click();
//        driver.findElement(By.xpath("(//table)[2]/tbody/tr[4]/td[3]")).click();
//        driver.findElement(By.xpath("(//table)[2]/tbody/tr[5]/td[3]")).click();
//        driver.findElement(By.xpath("(//table)[2]/tbody/tr[6]/td[3]")).click();
//        driver.findElement(By.xpath("(//table)[2]/tbody/tr[7]/td[3]")).click();
//
        for (int i =2; i<=7;i++){
            driver.findElement(By.xpath("(//table)[2]/tbody/tr["+i+"]/td[3]")).click();
        }

        WebElement Title = driver.findElement(By.xpath("(//table)[2]/tbody/tr[1]/td[3]"));

        actions.moveToElement(Title).build().perform();

        Assert.assertTrue(Title.isDisplayed());
        System.out.println("Title is available: " + Title.isDisplayed());
    }
}