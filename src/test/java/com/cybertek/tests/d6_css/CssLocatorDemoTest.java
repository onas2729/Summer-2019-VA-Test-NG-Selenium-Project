package com.cybertek.tests.d6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssLocatorDemoTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cybertekschool.com/multiple_buttons");

        WebElement element=driver.findElement(By.cssSelector("button#disappearing_button"));
        //  WebElement element=driver.findElement(By.cssSelector("#disappearing_button"));
        System.out.println(element.getText());


        // class ile css bulma
        WebElement element1=driver.findElement(By.cssSelector("nav ul a"));
        System.out.println(element1.getText());

        driver.quit();
    }
}
