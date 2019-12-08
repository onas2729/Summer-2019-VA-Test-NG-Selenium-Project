package com.cybertek.tests.d1_basic_navigation;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenBrowserDemo {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup(); // Selenium codes
        WebDriver driver=new ChromeDriver();
        WebDriver driver1=new SafariDriver();
    }
}
