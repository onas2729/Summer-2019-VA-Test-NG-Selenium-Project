package com.cybertek.AssigmentTestNg;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase6 {

    @Test
    public void Test6() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.tempmailaddress.com/");
        Thread.sleep(2000);
        String TempEmail=driver.findElement(By.xpath("//span[@id='email']")).getText();
        System.out.println(TempEmail);
        Thread.sleep(2000);
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com");
        WebElement SignUpMailingList=driver.findElement(By.xpath("//div[@id='content']/ul/li[43]/a"));
        SignUpMailingList.click();

        WebElement ValidName=driver.findElement(By.xpath("//input[@name='full_name']"));
        ValidName.sendKeys("Osman");
        WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
        Email.sendKeys(TempEmail);

        WebElement SignUp=driver.findElement(By.xpath("//button[@name='wooden_spoon']"));
        SignUp.click();

        WebElement VerifyMessage=driver.findElement(By.xpath("//h3[@name='signup_message']"));
        System.out.println(VerifyMessage.getText());
        Assert.assertTrue(VerifyMessage.isDisplayed());

        driver.navigate().to("https://www.tempmailaddress.com/");

       WebElement msg =  driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
        System.out.println(msg.getText());
        Assert.assertTrue(msg.isDisplayed());
        msg.click();

        WebElement EmailIsFrom=driver.findElement(By.xpath("//span[@id='odesilatel']"));
        System.out.println(EmailIsFrom.getText());
        Assert.assertTrue(EmailIsFrom.isDisplayed());

        WebElement submitMessage=driver.findElement(By.xpath("//span[@id='predmet']"));
        System.out.println(submitMessage.getText());
        Assert.assertTrue(submitMessage.isDisplayed());


        Thread.sleep(2000);
        driver.quit();
    }
}
