package com.cybertek.AssigmentXpathLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        WebElement searchArea=driver.findElement(By.id("gh-ac"));
        searchArea.sendKeys("term");
        searchArea.sendKeys(Keys.ENTER);
      //  searchArea.submit(); // yada bu kullanilabilir

        String result= driver.findElement(By.xpath(".//*[@class='srp-controls__count-heading']/span[@class='BOLD'][1]")).getText().split(" ")[0];
        System.out.println(result);

        Thread.sleep(1000);
        driver.quit();
    }
}
