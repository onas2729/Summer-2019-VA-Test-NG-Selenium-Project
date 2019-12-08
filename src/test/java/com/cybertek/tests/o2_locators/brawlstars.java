package com.cybertek.tests.o2_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class brawlstars {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("https://google.com");
        WebElement searchbtn=driver.findElement(By.xpath("//input[@name='q']"));
        searchbtn.sendKeys("Brawl Stars");
        searchbtn.submit();

        WebElement brawlstars=driver.findElement(By.xpath("(//h3[@class=\"LC20lb\"])[1]"));
        brawlstars.click();

        WebElement games=driver.findElement(By.xpath("//a[@class='link-games active-trail']"));
        games.click();

        WebElement seaplanes=driver.findElement(By.xpath("(//div[@class='field field-name-field-teaser-title field-type-text field-label-hidden'])[1]"));
        seaplanes.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
