package com.cybertek.tests.d12_Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTest {

    WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void setupMethod(){
    driver=WebDriverFactory.getDriver("chrome");
    actions =new Actions(driver);


    driver.get("http://practice.cybertekschool.com/hovers");

    }

    @Test
    public void test (){
       // find all images outside the loop
        List<WebElement> images= driver.findElements(By.tagName("img"));

        for (int i=0; i<3; i++){
            // hover over the each image
            // verify text user1, user2, user3
            System.out.println(i);

            // eye = /html[1]/body[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/i[1]
            // edit = /html[1]/body[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/i[1]
            // delete = /html[1]/body[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]/i[1]

            WebElement image= images.get(i);
            actions.moveToElement(image).perform();
            // this is like calling Thread.sleep()
            actions.pause(2000);

            String xpath="//h5[.='name: user"+(i+1)+"']";
            System.out.println(xpath);

            WebElement text=driver.findElement(By.xpath(xpath));
            System.out.println("Verify element: "+i);
            Assert.assertTrue(text.isDisplayed());
            // console da gormek istiyorsak asgidaki gibi yazabiliriz
          //  System.out.println(text.getText());

        }
    }

    @Test
    public void tearDownMethod() throws InterruptedException {
       // Thread.sleep(3000);
        driver.quit();
    }
}
