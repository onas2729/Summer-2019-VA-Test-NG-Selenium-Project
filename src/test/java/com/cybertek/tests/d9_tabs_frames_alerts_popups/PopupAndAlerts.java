package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupAndAlerts {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod (){
        driver= WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void htmlPopUp() throws InterruptedException {
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        driver.manage().window().maximize();
        // Destroy the world
        driver.findElement(By.xpath("//button[@id='j_idt710:j_idt711']/span")).click();
        // no butonu icin
        driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-times']")).click();
//        WebElement element= driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-times']"));
//        element.click();
        Thread.sleep(2000);
     //   System.out.println(element.getText());
    }

    @Test
    public void jsAlerts() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        // trigger the alert
        driver.findElement(By.xpath("//button[1]")).click();
        // accept alert
        Alert alert=driver.switchTo().alert();
        // accept alert ----> clicking ok alerts
       Thread.sleep(4000);
        alert.accept();

        // trigger the second alert
        driver.findElement(By.xpath("//button[2]")).click();
        //switch to new alert
        alert=driver.switchTo().alert();
        // dismiss ---> clicking x to close selecting no/cancel
        Thread.sleep(4000);
        alert.dismiss();

        // trigger the second alert
        driver.findElement(By.xpath("//button[3]")).click();
        //switch to new alert
        alert=driver.switchTo().alert();
        // sendkeys to alert
        Thread.sleep(4000);
        alert.sendKeys("red alert");
        // print text of alert
        System.out.println(alert.getText());
        // close the alert
        alert.accept();
    }
}
