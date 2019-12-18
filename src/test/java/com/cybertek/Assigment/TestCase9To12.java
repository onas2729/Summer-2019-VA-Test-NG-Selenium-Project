package com.cybertek.Assigment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase9To12 {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod (){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod () throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @DataProvider(name="TestCase9To12")
    public Object [] data(){
       return new Object []{"200", "301", "404", "500"};


    }

    @Test (dataProvider = "TestCase9To12")
    public void test(String data) throws InterruptedException{

        driver.findElement(By.xpath("//a[.='Status Codes']")).click();
        driver.findElement(By.linkText(data)).click();
        String actual = driver.findElement(By.xpath("//p")).getText();
        System.out.println(actual);
        String expected = "This page returned a " + data + " status code";
        Assert.assertTrue(actual.contains(expected));

    }
}
