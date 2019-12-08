package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class review {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        WebElement follow=driver.findElement(By.linkText("Sign Up For Mailing List"));
        System.out.println(follow.getText());
        Thread.sleep(2000);
        follow.click();
        Thread.sleep(3000);


        WebElement mail=driver.findElement(By.name("email"));
        mail.click();


        driver.quit();





    }
}
