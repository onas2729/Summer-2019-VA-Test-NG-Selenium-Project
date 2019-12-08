package com.cybertek.AssigmentXpathLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrackTitleTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");

        WebElement Username=driver.findElement(By.id("prependedInput"));
        Username.sendKeys("storemanager51");

        WebElement Password=driver.findElement(By.id("prependedInput2"));
        Password.sendKeys("UserUser123");

        WebElement Login=driver.findElement(By.id("_submit"));
        Login.click();
        Thread.sleep(3000);
        WebElement element= driver.findElement(By.xpath("//a[@href=\"javascript: void(0);\"]"));
        element.click();
        Thread.sleep(3000);
        WebElement element2= driver.findElement(By.xpath("//ul[@class=\"dropdown-menu\"][@role=\"menu\"]/li[2]"));
        element2.click();

        System.out.println(element.getText());

        String menu="Edd Turner";
        String corner=driver.findElement(By.xpath("//a[@href=\"javascript: void(0);\"]")).getText();


        if (menu.equals(corner)){
    System.out.println("PASS");
        }else{
    System.out.println("FAIL");
}



        Thread.sleep(3000);

        driver.quit();
    }


}
