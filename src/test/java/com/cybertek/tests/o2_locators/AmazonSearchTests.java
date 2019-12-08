package com.cybertek.tests.o2_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchTests {

    public static void main(String[] args) {
        priceDetails();
        bookDetailsTest();
        titleTest();
    }
    private static void priceDetails(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("selenium cookbook");

        WebElement searchBtn=driver.findElement(By.className("nav-input"));
        searchBtn.click();

        WebElement book=driver.findElement(By.linkText("Selenium-Testing-Tools-Cookbook-Second"));
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




    private static void bookDetailsTest(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("selenium cookbook");

        WebElement searchBtn=driver.findElement(By.className("nav-input"));
        searchBtn.click();

        String expectedBook= "Mastering Selenium WebDriver 3.0: Boost the performance and reliability of your automated checks by mastering Selenium WebDriver, 2nd Edition";
        WebElement res1=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-secondary a-text-normal'])[1]"));

        String actualBook=res1.getText();

        if (expectedBook.equals(actualBook)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualBook = " + actualBook);
            System.out.println("expectedBook = " + expectedBook);
        }
        driver.quit();
    }

    private static void titleTest(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("selenium cookbook");

        WebElement searchBtn=driver.findElement(By.className("nav-input"));
        searchBtn.click();

        WebElement bookslink=driver.findElement(By.linkText("Books"));
        bookslink.click();

        String title=driver.getTitle();
        System.out.println(title);

        if (title.endsWith("Books")){
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println(title+"did not end with books");
        }

        WebElement anyDepartment=driver.findElement(By.linkText("Any Department"));
        anyDepartment.click();
        title=driver.getTitle();
        if (!title.endsWith("Books")){
            System.out.println("PAss");
        }else{
            System.out.println("Fail");
            System.out.println("ACTUAL: "+title);
        }
        driver.quit();
    }
}
