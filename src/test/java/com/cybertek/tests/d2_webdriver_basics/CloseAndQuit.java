package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        // TODO close one tab out of two tabs
        driver.get("http:google.com");

        Thread.sleep(1000);
        // close()---> close the current tab/window
        driver.close();

        // TODO close one tab out of two tabs
        driver.get("http:google.com/open_new_tab");
        Thread.sleep(5000);
        driver.close();

        //TODO close all open tabs
        driver.quit();
    }
}
