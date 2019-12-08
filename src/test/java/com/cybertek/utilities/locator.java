package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class locator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
//        List<String> searchStrs = Arrays.asList("Java ", "Unit ", "Selenium" );
//
        driver.get("https://google.com");
        driver.manage().window().maximize();

       WebElement searchBox= driver.findElement(By.name("q"));
       searchBox.sendKeys("Selenium WebDriver");
       searchBox.sendKeys(Keys.ENTER);
       Thread.sleep(1000);
       driver.findElement(By.className("LC20lb")).click();
       Thread.sleep(2000);
       String expectedUrl="https://www.seleniumhq.org/projects/webdriver/";
       String actualUrl=driver.getCurrentUrl();

       if (expectedUrl.equals(actualUrl)){
           System.out.println("Pass");
       }else {
           System.out.println("fail");
           System.out.println("expectedUrl = " + expectedUrl);
           System.out.println("actualUrl = " + actualUrl);
       }
       driver.navigate().back();
       searchBox.sendKeys("Java");
       searchBox.sendKeys(Keys.ENTER);

        driver.close();

//        for (int i=0; i<searchStrs.size(); i++){
////            WebElement search = driver.findElement(By.name("q"));
////            String searchWord=searchStrs.get(i);
////            search.sendKeys(searchWord);
////
//            WebElement searchenter=driver.findElement(By.name("btnk") );
//            searchenter.submit();
//        }


    }
}
