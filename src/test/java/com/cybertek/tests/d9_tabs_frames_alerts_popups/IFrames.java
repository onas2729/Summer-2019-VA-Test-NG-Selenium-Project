package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class IFrames {

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

}
