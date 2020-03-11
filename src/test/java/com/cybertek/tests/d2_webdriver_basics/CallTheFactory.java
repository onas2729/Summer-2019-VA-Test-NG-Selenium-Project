package com.cybertek.tests.d2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class CallTheFactory {
    public static void main(String[] args) {
        //  WebDriverManager.chromedriver().setup();
        //   WebDriver driver=new ChromeDriver();


        WebDriver driver = WebDriverFactory.getDriver("CHROME");
        driver.get("http://google.com");
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();

        driver.close();

        WebDriver driver2 = WebDriverFactory.getDriver("FIREFOX");
        driver2.get("https://www.mozilla.org");


        driver2.close();
    }
}
