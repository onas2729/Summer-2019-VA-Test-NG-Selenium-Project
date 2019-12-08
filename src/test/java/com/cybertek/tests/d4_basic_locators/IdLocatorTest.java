package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {

    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cybertekschool.com/multiple_buttons");
        driver.manage().window().maximize();

        WebElement bitdefender = driver.findElement(By.id("proceedAnyway"));
        bitdefender.click();

        WebElement element= driver.findElement(By.id("disappearing_button"));
        // String txt=element.getText();
        element.click();

        driver.quit();
    }
}
