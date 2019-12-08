package com.cybertek.tests.o2_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class priceDetails {
    public static void main(String[] args) throws InterruptedException {
        priceDetails();
    }
    private static void priceDetails() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("selenium cookbook");
        Thread.sleep(2000);
        WebElement searchBtn=driver.findElement(By.className("nav-input"));
        searchBtn.click();
        Thread.sleep(2000);
        WebElement book=driver.findElement(By.linkText("Selenium Testing Tools Cookbook - Second Edition"));
        book.click();

        String expectedprice="$44.99";
        WebElement price=driver.findElement(By.xpath("(//span[@class='a-size-base mediaTab_subtitle'])[2]"));
        String actualprice=price.getText();

        if (expectedprice.equals(actualprice)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("actualprice = " + actualprice);
            System.out.println("expectedprice = " + expectedprice);
        }

        String expectedKindlePrice="$22.39";
        WebElement kprice=driver.findElement(By.xpath("(//span[@class='a-size-base mediaTab_subtitle'])[1]"));
        String  actualKindlePrice=kprice.getText();

        if (expectedKindlePrice.equals(actualKindlePrice)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualKindlePrice = " + actualKindlePrice);
            System.out.println("expectedKindlePrice = " + expectedKindlePrice);
        }
        driver.quit();
    }
}
