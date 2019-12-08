package com.cybertek.tests.d5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTestDemoClass {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cybertekschool.com/multiple_buttons");

        WebElement link=driver.findElement(By.xpath("/html/body/div/div/div/div/h3"));
        link.getText();
    }
}
