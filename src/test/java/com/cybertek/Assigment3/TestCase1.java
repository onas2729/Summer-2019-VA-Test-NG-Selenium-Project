package com.cybertek.Assigment3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase1 {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod (){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa1.vytrack.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod () throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(3000);

      //  List<WebElement> options= driver.findElements(By.xpath("//li[@class='dot-menu dropdown']/a/i"));
      //  System.out.println("options size= "+options.size());

      driver.findElement(By.xpath("//li[@class='dot-menu dropdown']/a/i")).click();
        Thread.sleep(3000);
      driver.findElement(By.linkText("Calendar Events - Activities")).click();
        Thread.sleep(3000);
      WebElement verify=driver.findElement(By.xpath("//div[@class=\"btn-group actions-group\"]"));
        System.out.println(verify.getText());

        Assert.assertTrue(verify.isDisplayed());


    }
    @Test
    public void test2() throws InterruptedException {
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(3000);



        driver.findElement(By.xpath("//li[@class='dot-menu dropdown']/a/i")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Calendar Events - Activities")).click();
        Thread.sleep(3000);


        String actual=driver.findElement(By.xpath("//ul[@class='icons-holder']/li[2]/input")).getAttribute("value");
        System.out.println(actual);
        String expected="1";

        if (actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


    }
    @Test
    public void test5() throws InterruptedException {
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(3000);



        driver.findElement(By.xpath("//li[@class='dot-menu dropdown']/a/i")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Calendar Events - Activities")).click();
        Thread.sleep(3000);


       WebElement allbox= driver.findElement(By.xpath("(//input)[10]"));
        allbox.click();
        Assert.assertTrue(allbox.isSelected());
        System.out.println("all box selected is "+allbox.isSelected());

    }

    @Test
    public void test6() throws InterruptedException {
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(3000);



        driver.findElement(By.xpath("//li[@class='dot-menu dropdown']/a/i")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Calendar Events - Activities")).click();
        Thread.sleep(3000);

        // Select “Testers meeting” (GOZUKMUYOR) (MARUFA SORDUM)
        WebElement allbox= driver.findElement(By.xpath("(//input)[10]"));
        allbox.click();
        Assert.assertTrue(allbox.isSelected());
        System.out.println("all box selected is "+allbox.isSelected());

    }
}
