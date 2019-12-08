package com.cybertek.tests.o2_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bookDetailsTest {
    public static void main(String[] args) {
        bookDetailsTest1();


    }

    private static void bookDetailsTest1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("selenium cookbook");

        WebElement searchBtn = driver.findElement(By.className("nav-input"));
        searchBtn.click();

        String expectedBook = "Mastering Selenium WebDriver 3.0: Boost the performance and reliability of your automated checks by mastering Selenium WebDriver, 2nd Edition";
        WebElement res1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));


        String actualBook = res1.getText();

        if (expectedBook.equals(actualBook)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actualBook = " + actualBook);
            System.out.println("expectedBook = " + expectedBook);
        }

        String expectedAuthor="Mark Colli";
        WebElement author1=driver.findElement(By.xpath("//a[@class='a-size-base a-link-normal'][1]"));
        String  actualAuthor=author1.getText();

        if(expectedAuthor.equals(actualAuthor)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualAuthor = " + actualAuthor);
            System.out.println("expectedAuthor = " + expectedAuthor);
        }

        driver.quit();
    }
}

