package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocatorDemo {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullname=driver.findElement(By.tagName("input"));
        fullname.sendKeys("John Doe");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("johndoe@cybertekschool.com");

        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();


        WebElement element=driver.findElement(By.xpath("//input[@name='email']"));
    }
}
