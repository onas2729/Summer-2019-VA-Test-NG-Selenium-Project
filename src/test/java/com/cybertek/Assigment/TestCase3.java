package com.cybertek.Assigment;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");

        Thread.sleep(1000);
        driver.findElement(By.linkText("Multiple Buttons")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='button1()']")).click();
        Thread.sleep(1000);
        WebElement result=driver.findElement(By.id("result"));
        System.out.println(result.getText());

        String expected="Clicked on button one!";
        String actual=result.getText();

        if (expected.equals(actual)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }





        driver.quit();
    }
}
