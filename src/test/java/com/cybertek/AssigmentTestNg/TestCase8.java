package com.cybertek.AssigmentTestNg;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase8 {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver=WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void Test8() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        // And click on “Autocomplete”.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content']/ul/li[3]/a")).click();
        // Enter “United States of America” into country input box.
        Thread.sleep(2000);
        driver.findElement(By.id("myCountry")).sendKeys("United States of America");

        driver.findElement(By.xpath("//input[@value='Submit']")).click();

        WebElement verify=driver.findElement(By.id("result"));
        Assert.assertTrue(verify.isDisplayed());
        System.out.println(verify.getText());

    }

}
