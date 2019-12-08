package com.cybertek.AssigmentXpathLocators;

import com.cybertek.utilities.StringUtility;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EtsySearchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://ebay.com");

        WebElement searchArea = driver.findElement(By.id("gh-ac"));
        searchArea.sendKeys("wooden spoon");

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.sendKeys(Keys.ENTER);


        String result = driver.findElement(By.xpath(".//*[@class='srp-controls__count-heading']/span[@class='BOLD'][1]")).getText().split(" ")[0].replace(",", "");
        int TotalNumberOfResult = Integer.parseInt(result);
        System.out.println("total number of result is " + TotalNumberOfResult);


        WebElement src = driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/a/span"));
        src.click();
        Thread.sleep(1000);
        String result1 = driver.findElement(By.xpath(".//*[@class='srp-controls__count-heading']/span[@class='BOLD'][1]")).getText();
        System.out.println("result 1 is "+ result1);
       String afterSplit =  result1.split(" ")[0].replace(",", "");
        System.out.println("after split is " + afterSplit);
        int secondResult = Integer.parseInt(afterSplit);
        System.out.println(" secound result " + secondResult);

        if (secondResult>TotalNumberOfResult){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
        }


        driver.navigate().back();
        String actual=driver.findElement(By.cssSelector("[name='_nkw']")).getAttribute("value");
        System.out.println("the text expected is wooden spoon " +actual);
        String expected="wooden spoon";

        if(expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.navigate().back();
        driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));

        String actual1=driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).getText();
        String expected1="";

        if(actual1.equals(expected1)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        }


    }

