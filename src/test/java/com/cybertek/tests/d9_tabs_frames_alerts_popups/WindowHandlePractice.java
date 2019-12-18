package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class WindowHandlePractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMetHod(){
        driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://qa1.vytrack.com/user/login");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


    @Test
    public void WindowHandle(){
        String CurrentWindowHandle= driver.getWindowHandle();
        System.out.println("CurrentWindowHandle "+CurrentWindowHandle);

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle: windowHandles){
            System.out.println(windowHandle);

            if (!CurrentWindowHandle.equals(windowHandles)){
                driver.switchTo().window(windowHandle);

            }
        }
        System.out.println("After Switching "+ driver.getTitle());

        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("http://google.com");
        driver.get("http://amazon.com");

    }

}
