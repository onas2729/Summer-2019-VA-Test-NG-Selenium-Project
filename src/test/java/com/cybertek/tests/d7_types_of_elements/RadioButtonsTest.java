package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTest {


    @Test
    public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue=driver.findElement(By.id("blue"));
        WebElement red=driver.findElement(By.id("red"));
        WebElement football=driver.findElement(By.id("football"));

        System.out.println("is blue selected: "+blue.isSelected());
        System.out.println("is red selected: " + red.isSelected());


        // verify if blue is selected
        Assert.assertTrue(blue.isSelected());
        // verify if red is not selected
        Assert.assertFalse(red.isSelected());

        System.out.println("Clicking on red");
        red.click();
        System.out.println("is blue selected: "+blue.isSelected());
        System.out.println("is red selected: " + red.isSelected());

        // verify blue is NOT selected
        Assert.assertFalse(blue.isSelected());
        // verify if red is selected
        Assert.assertTrue(red.isSelected());

        football.click();
        System.out.println("is football selected: "+football.isSelected());
        // verify if red is selected
        Assert.assertTrue(football.isSelected());
        Thread.sleep(1000);
        driver.quit();

    }
}
