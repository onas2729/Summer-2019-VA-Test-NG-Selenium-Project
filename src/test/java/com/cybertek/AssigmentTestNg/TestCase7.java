package com.cybertek.AssigmentTestNg;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase7 {

    @Test
    public void Test7() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice-cybertekschool.herokuapp.com");

        // And click on “File Upload".
        WebElement FileUpload=driver.findElement(By.xpath("//div[@id='content']/ul/li[18]/a"));
        FileUpload.click();
        Thread.sleep(2000);

        // Upload any file with .txt extension from your computer.
        WebElement ChooseFile=driver.findElement(By.id("file-upload"));
        Thread.sleep(2000);
        ChooseFile.sendKeys("C:/Users/LAPTOP/Desktop/Try.txt");

        // Click “Upload” button.
        WebElement Upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
        Upload.click();

        // Verify that subject is: “File Uploaded!”
        WebElement verify=driver.findElement(By.xpath("//div[@id='content']/div/h3"));
        System.out.println(verify.getText());

        // Verify that uploaded file name is displayed.
        Assert.assertTrue(verify.isDisplayed());


    }
}
