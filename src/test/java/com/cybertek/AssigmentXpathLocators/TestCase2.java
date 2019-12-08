package com.cybertek.AssigmentXpathLocators;

import com.cybertek.utilities.StringUtility;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase2 {
    /*
    go to amazon
Go to ebay
enter search term
click on search button
verify title contains search term
     */

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        driver.navigate().to("https://www.ebay.com/");
        WebElement searchArea=driver.findElement(By.id("gh-ac"));
        searchArea.sendKeys("term");
        searchArea.submit();

       //driver.findElement(By.xpath("//*[contains(text(),'term')][2]"));

       String expected="term";
       String actual=driver.getTitle();
       StringUtility.verifyContains(actual,expected);

        if(actual.contains(expected)){
            System.out.println("PASS");
        }else {
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }
        driver.quit();
    }
}
