package com.cybertek.selfStudies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d2_review {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");
        // getTitle(); get title of page
        String title=driver.getTitle();
        System.out.println("title = "+title);

        // getCurrentUrl();
        String url=driver.getCurrentUrl();
        System.out.println("url = "+url);

        // getPageSource();
        String pageSorce=driver.getPageSource();
        System.out.println("pageSource = "+pageSorce);



    }
}
