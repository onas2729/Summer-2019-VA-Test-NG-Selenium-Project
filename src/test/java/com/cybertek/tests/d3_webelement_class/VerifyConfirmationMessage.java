package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    public static void main(String[] args) {
        // open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        // go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any mail
        WebElement emailInput=driver.findElement(By.name("email"));

        // sendKeys()---> enters given text
        String expectedEmail="admiralkunkka@email.com";
        emailInput.sendKeys(expectedEmail);

        // verify that email
        // .getAttribute("value")
        String actualEmail=emailInput.getAttribute("value");
        if (expectedEmail.equals(actualEmail)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ExpectedEmail = "+expectedEmail);
            System.out.println("ActualEmail = "+actualEmail);

        }

        // click on Retrieve password
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        // verify that confirmation message says 'Your e-mail's been sent!'

        String expectedMessage = "'Your e-mail's been sent!'";
        WebElement messageElement = driver.findElement(By.name("confirmation_message"));
        String actualMessage = messageElement.getText();

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

        driver.quit();
    }
}
