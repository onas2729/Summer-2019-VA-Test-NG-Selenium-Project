package com.cybertek.Assigment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TestCase2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");

       // int elements = driver.findElements(By.className("list-group-item")).size();
       // List<WebElement> element=driver.findElements(By.className("list-group-item"));
       // element.size();
        ArrayList<WebElement> element1= new ArrayList<WebElement>( driver.findElements(By.className("list-group-item")));
        System.out.println(element1.size());
        //element.get(2).click();

       // System.out.println(element);

        if(element1.size()==48){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Thread.sleep(4000);
        driver.quit();
    }
}
