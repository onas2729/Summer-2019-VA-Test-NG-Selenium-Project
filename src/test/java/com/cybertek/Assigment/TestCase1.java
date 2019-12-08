package com.cybertek.Assigment;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver1=new ChromeDriver();

        driver.get("https://practice-cybertekschool.herokuapp.com");
        Thread.sleep(2000);
        WebElement SignUp=driver.findElement(By.linkText("Sign Up For Mailing List"));
        SignUp.click();

        Faker obj=new Faker();
        String name=obj.name().fullName();
        String email=obj.internet().emailAddress();
        driver.findElement(By.name("full_name")).sendKeys(name);
        driver.findElement(By.name("email")).sendKeys(email);

        driver.findElement(By.name("wooden_spoon")).click();

        String expected="Thank you for signing up. Click the button below to return to the home page.";
        String actual=driver.findElement(By.name("signup_message")).getText();

        if (expected.equals(actual)){
            System.out.println("PASS");
        } else{
            System.out.println("FAIL");
        }
        System.out.println(obj.name().fullName());
        System.out.println(obj.internet().emailAddress());


        driver.quit();



        //driver.quit();
    }
}
