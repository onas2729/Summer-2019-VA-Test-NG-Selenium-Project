package com.cybertek.tests.d11_file_upload_actions_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecuterTest {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(20000);
        driver.quit();
    }

    @Test
    public  void click(){
        driver.get("https://practice.cybertekschool.com/");
        WebElement element=driver.findElement(By.linkText("Home"));
        //this how the JavascriptExecutor object is created
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        // ExecuteScript --> method used to pass jse command
        // first strinfg argument is the javascript code
        // second argument is the webelement on which the action will be take
        jse.executeScript("argument[0].click();", element);
    }

    @Test
    public void type() throws InterruptedException {
        driver.get("https://practice.cybertekschool.com/dynamic_controls");

        WebElement element=driver.findElement(By.cssSelector("input[disabled]"));

        JavascriptExecutor jse= (JavascriptExecutor) driver;
        Thread.sleep(3000);
        String str="hello";
        jse.executeScript("arguments[0].setAttribute('value', ' "+str+"')", element);
        element.sendKeys(str);

    }


}
