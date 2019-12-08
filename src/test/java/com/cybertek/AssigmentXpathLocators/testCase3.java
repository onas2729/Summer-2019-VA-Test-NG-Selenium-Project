package com.cybertek.AssigmentXpathLocators;

import com.cybertek.utilities.StringUtility;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase3 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://wikipedia.org");

        WebElement search=driver.findElement(By.id("searchInput"));
        search.sendKeys("selenium webdriver");

        WebElement searchBtn=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
        searchBtn.submit();

        WebElement searchresult=driver.findElement(By.xpath("//a[@title='Selenium (software)']"));
        searchresult.click();

        String expected="Selenium_(software)";
        String actual=driver.getCurrentUrl();


        if (actual.endsWith("Selenium_(software)")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("acttual = " + actual);
            System.out.println("expected = " + expected);
        }

        driver.quit();
    }
}
