package com.cybertek.AssigmentTestNg;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase1To5 {
    @BeforeMethod
    public void setupMethod (){
        System.out.println("BEFORE METHOD");
        System.out.println("OPEN CHROME BROWSER");
    }
    @Test
    public void Test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice-cybertekschool.herokuapp.com");

//        List<WebElement> buttons=driver.findElements(By.tagName("li"));
////
////        System.out.println(buttons.size());
////
////        Assert.assertEquals(buttons.size(), 49);

        // click on Registration Form
        WebElement RegistrationForm=driver.findElement(By.xpath("//div[@id='content']/ul/li[40]/a"));
        RegistrationForm.click();
        System.out.println("This is test one");

        //Enter “wrong_dob” into date of birth input box.
        WebElement DateofBirth=driver.findElement(By.xpath("//input[@name='birthday']"));
        DateofBirth.sendKeys("wrong_dob");
        Thread.sleep(2000);

        //Verify that warning message is displayed:“The date of birth is not valid”
       /*
        WebElement VerifyMessage=driver.findElement(By.xpath("//small[@data-bv-validator=\"date\"][@data-bv-for='birthday']"));
        System.out.println(VerifyMessage.getText());
        Assert.assertTrue(VerifyMessage.isDisplayed());

        */

        String VerifyMessage1=driver.findElement(By.xpath("//small[@data-bv-validator=\"date\"][@data-bv-for='birthday']")).getText();
        System.out.println(VerifyMessage1);
        Assert.assertEquals(VerifyMessage1, "The date of birth is not valid");




        Thread.sleep(1000);
        driver.quit();

    }
    @Test
    public void test2() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice-cybertekschool.herokuapp.com");
        // click on Registration Form
        WebElement RegistrationForm=driver.findElement(By.xpath("//div[@id='content']/ul/li[40]/a"));
        RegistrationForm.click();
        System.out.println("This is test two");

        WebElement CPlus=driver.findElement(By.xpath("//label[@for='inlineCheckbox1']"));
       // CPlus.click();
        Assert.assertTrue(CPlus.isDisplayed());

        WebElement Java=driver.findElement(By.xpath("//label[@for='inlineCheckbox2']"));
       // Java.click();
        Assert.assertTrue(Java.isDisplayed());

        WebElement JavaScript=driver.findElement(By.xpath("//label[@for='inlineCheckbox3']"));
       // JavaScript.click();
        Assert.assertTrue(JavaScript.isDisplayed());

        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    public void test3() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice-cybertekschool.herokuapp.com");
        // click on Registration Form
        WebElement RegistrationForm = driver.findElement(By.xpath("//div[@id='content']/ul/li[40]/a"));
        RegistrationForm.click();
        System.out.println("This is test three");

        //Enter only one alphabetic character into first name input box.
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("a");

        //Verify that warning message is displayed:
        // “first name must be more than 2 and less than 64 characters long”
        WebElement WarningMessage=driver.findElement(By.xpath("//small[@data-bv-result='INVALID']"));
        System.out.println(WarningMessage.getText());
        Assert.assertTrue(WarningMessage.isDisplayed());

        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void test4() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice-cybertekschool.herokuapp.com");
        // click on Registration Form
        WebElement RegistrationForm = driver.findElement(By.xpath("//div[@id='content']/ul/li[40]/a"));
        RegistrationForm.click();
        System.out.println("This is test four");

        //Enter only one alphabetic character into last name input box.
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("a");

        //Verify that warning message is displayed:
        // “The last name must be more than 2 and less than 64 characters long”
        WebElement WarningLastNameMessage=driver.findElement(By.xpath("//small[@data-bv-for='lastname'][@data-bv-result='INVALID']"));
        System.out.println(WarningLastNameMessage.getText());
        Assert.assertTrue(WarningLastNameMessage.isDisplayed());
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void test5() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice-cybertekschool.herokuapp.com");
        // click on Registration Form
        WebElement RegistrationForm = driver.findElement(By.xpath("//div[@id='content']/ul/li[40]/a"));
        RegistrationForm.click();
        System.out.println("This is test five");

        //Enter any valid first name.
        WebElement ValidFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        ValidFirstName.sendKeys("ali");

        //Enter any valid last name.
        WebElement ValidLastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        ValidLastName.sendKeys("Karabacak");

        //Enter any valid user name.
        WebElement ValidUserName = driver.findElement(By.xpath("//input[@name='username']"));
        ValidUserName.sendKeys("Onas2729");

        // Enter valid email
        WebElement ValidEmail = driver.findElement(By.xpath("//input[@name='email']"));
        ValidEmail.sendKeys("karabacakn35@gmail.com");


        //Enter any valid password.
        WebElement ValidPassword = driver.findElement(By.xpath("//input[@name='password']"));
        ValidPassword.sendKeys("Sami100907");

        // Enter any valid phone number.
        WebElement ValidPhoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        ValidPhoneNumber.sendKeys("917-742-0617");

        // Select gender.
        WebElement SelectGender = driver.findElement(By.xpath("//input[@value='male']"));
        SelectGender.click();

        // Enter any valid date of birth.
        WebElement ValidDOB = driver.findElement(By.xpath("//input[@name='birthday']"));
        ValidDOB.sendKeys("06/27/1979");


        // Select any department
        Select AnyDepartment= new Select(driver.findElement(By.xpath("//select[@name='department']")));
        AnyDepartment.selectByVisibleText("Department of Agriculture");

        // Enter any job title.
        Select AnyJobTitle=new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        AnyJobTitle.selectByVisibleText("Designer");

        // Select java as a programming language.
        WebElement JAVA=driver.findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        JAVA.click();

        // Click Sign up.
        WebElement SignUp=driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
        SignUp.click();

        // Verify that following success message is
        //displayed: “You've successfully completed registration!”
        WebElement Verify=driver.findElement(By.xpath("//div[@id='content']/div/div/p"));
        System.out.println(Verify.getText());
        Assert.assertTrue(Verify.isDisplayed());



        Thread.sleep(1000);
        driver.quit();
    }
   @AfterMethod
    public void tearDownMethod(){
       System.out.println("AFTER METHOD");
       System.out.println("CLOSE CHROME BROWSER");

   }


}
