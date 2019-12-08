package com.cybertek.AssigmentTestCase4;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCase3 extends TestBase {
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
        driver.findElement(By.xpath("//a[@class='btn-success btn dropdown-toggle']")).click();

        List<WebElement> images= driver.findElements(By.tagName("button"));
for (int i=2; i<5; i++){
   // System.out.println(i);
    WebElement image=images.get(i);
    actions.moveToElement(image).perform();
    // this is like calling Thread.sleep()
    actions.pause(2000);

    String xpath="(//button[@type='submit'])["+i+"]";
    System.out.println(xpath);

    WebElement text=driver.findElement(By.xpath(xpath));
    System.out.println("Verify element: "+i);
    Assert.assertTrue(text.isDisplayed());
}


        WebElement SaveAndClose=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        actions.moveToElement(SaveAndClose).build().perform();

        Assert.assertTrue(SaveAndClose.isDisplayed());
        System.out.println("Save and Close is available: " + SaveAndClose.isDisplayed());

        WebElement SaveAndNew=driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
        actions.moveToElement(SaveAndNew).build().perform();

        Assert.assertTrue(SaveAndNew.isDisplayed());
        System.out.println("Save and New is available: " + SaveAndNew.isDisplayed());

        WebElement Save=driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
        actions.moveToElement(Save).build().perform();

        Assert.assertTrue(Save.isDisplayed());
        System.out.println("Save is available: " + Save.isDisplayed());
}
}
