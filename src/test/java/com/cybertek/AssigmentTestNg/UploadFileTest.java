package com.cybertek.AssigmentTestNg;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadFileTest {

    @Test
    public void Uploadfile () throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://demo.guru99.com/test/upload/");

        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        System.out.println(uploadElement.getText());
        Thread.sleep(5000);

        uploadElement.sendKeys("C:/Users/LAPTOP/Desktop/Try.txt");

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.name("send")).click();
    }
}
