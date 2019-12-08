package com.cybertek.tests.VytrackAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrackAutomation {
    /*
    Go to the login page of VyTrack
     •Enter valid credential (can be any role)
     •Click login button
     •Verify that the user login successfully
     */

    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");

        WebElement emailInput=driver.findElement(By.name("_username"));
        emailInput.sendKeys("user1");

        //driver.findElement(By.name("_password")).sendKeys("UserUser123"); // veya bu sekilde yazilabilir.
        WebElement passInput=driver.findElement(By.name("_password"));
        passInput.sendKeys("UserUser123");

        WebElement login=driver.findElement(By.id("_submit"));
        login.click();

        String expected = "https://qa2.vytrack.com/";
        String actual = driver.getCurrentUrl();

        if (expected.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }
}
