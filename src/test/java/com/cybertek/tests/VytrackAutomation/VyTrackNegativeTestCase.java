package com.cybertek.tests.VytrackAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VyTrackNegativeTestCase {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();

        driver.findElement(By.name("_username")).sendKeys("user1");
        driver.findElement(By.name("_password")).sendKeys("User123");
        driver.findElement(By.id("_submit")).click();

        String expected="Invalid user name or password.";
        String actual=driver.findElement(By.xpath("//div[@class='alert alert-error']/div")).getText();

        if (expected.equals(actual)){
            System.out.println("pass");

        }else {
            System.out.println("fail");
        }

        driver.quit();
    }
}
