package com.cybertek.tests.d11_file_upload_actions_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void UploadTest() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice-cybertekschool.herokuapp.com");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content']/ul/li[18]/a")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:/Users/LAPTOP/Desktop/file.txt");
        driver.findElement(By.id("file-submit")).click();

        String actual = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actual, "file.txt");
/*
        // And click on “File Upload".
        WebElement FileUpload = driver.findElement(By.xpath("//div[@id='content']/ul/li[18]/a"));
        FileUpload.click();
        Thread.sleep(2000);

        // Upload any file with .txt extension from your computer.
        WebElement ChooseFile = driver.findElement(By.id("file-upload"));
        Thread.sleep(2000);
        ChooseFile.sendKeys("C:/Users/LAPTOP/Desktop/file.txt");

        // Click “Upload” button.
        WebElement Upload=driver.findElement(By.id("file-submit"));
        Upload.click();

        // Verify that subject is: “File Uploaded!”
        WebElement verify=driver.findElement(By.xpath("//div[@id='content']/div/h3"));
        System.out.println(verify.getText());

        // Verify that uploaded file name is displayed.
        String actual=verify.getText();
        Assert.assertEquals(actual,"file.txt");

        // Verify that uploaded file name is displayed.
     //   Assert.assertTrue(verify.isDisplayed()); */
    }
}
