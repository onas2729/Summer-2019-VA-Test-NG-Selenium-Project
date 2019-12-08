package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPathandCSSReview {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullname = driver.findElement(By.name("full_name"));
        fullname.sendKeys("John Doe");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("JohnDoe@cybertekschool.com");
        WebElement  submitButton = driver.findElement(By.name("wooden_spoon"));
        submitButton.click();
        // to confirm after click button gets you to correct place get listed URL
        String urlResult = driver.getCurrentUrl();
        System.out.println(urlResult);
        WebElement signUpMessage = driver.findElement(By.xpath("//h3[@name='signup_message']"));
        signUpMessage.getText();
        System.out.println("This is the confirmation message: " + signUpMessage.getText());
        String confirmMessage = "Thank you for signing up. Click the button below to return to the home page.";
        if(confirmMessage.equals(signUpMessage.getText())){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }

    }
}



