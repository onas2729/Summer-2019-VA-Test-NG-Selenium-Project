package com.cybertek.Assigment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase45678 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");

        Thread.sleep(2000);
        driver.findElement(By.linkText("Registration Form")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("123");
        Thread.sleep(2000);

        String expected="first name can only consist of alphabetical letters";
        String actual=driver.findElement(By.cssSelector("small[style='display: block;'][data-bv-for='firstname']")).getText();

        if (expected.equals(actual)){
            System.out.println("Test4-PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);

        }

        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("123");
        Thread.sleep(2000);

        String expected1="The last name can only consist of alphabetical letters and dash";
        String actual1=driver.findElement(By.cssSelector("small[data-bv-for='lastname'][data-bv-result='INVALID']")).getText();

        if (expected1.equals(actual1)){
            System.out.println("Test5-PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual = " + actual1);
            System.out.println("expected = " + expected1);

        }

        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("user");
        Thread.sleep(2000);

        String expected2="The username must be more than 6 and less than 30 characters long";
        String actual2=driver.findElement(By.cssSelector("small[data-bv-validator='stringLength'][data-bv-for='username']")).getText();
       // OR
      // String actual2=driver.findElement(By.xpath("//small[contains(text(),'The username must be more than 6 and less than 30')]")).getText();
        if (expected2.equals(actual2)){
            System.out.println("Test6-PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual = " + actual2);
            System.out.println("expected = " + expected2);

        }

        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("testers@email");
        Thread.sleep(2000);

        String expected3="email address is not a valid Email format is not correct";
        String actual3=driver.findElement(By.cssSelector("small[data-bv-validator='emailAddress']")).getText()+" "+driver.findElement(By.cssSelector("small[data-bv-validator='regexp'][data-bv-for='email']")).getText();

        if (expected3.equals(actual3)){
            System.out.println("Test7-PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual = " + actual3);
            System.out.println("expected = " + expected3);

        }

        Thread.sleep(2000);
        driver.findElement(By.name("phone")).sendKeys("5711234354");
        Thread.sleep(2000);

        String expected4="Phone format is not correct";
        String actual4=driver.findElement(By.cssSelector("small[data-bv-validator='regexp'][data-bv-for='phone']")).getText();

        if (expected4.equals(actual4)){
            System.out.println("Test8-PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual = " + actual4);
            System.out.println("expected = " + expected4);

        }
        driver.quit();
    }
}
