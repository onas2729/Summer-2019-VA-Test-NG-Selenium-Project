package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {

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
    public void switchWindowsTest(){
        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("Before new window is opened "+ driver.getTitle());
        // open the windows
      //  driver.findElement(By.linkText("Click Here")).click();
        // still shows the title of the old window because we did not switch to the new window
     //   System.out.println("After new window is opened "+ driver.getTitle());

        // window ()---> changes between tabs, windows
        // driver.switchTo().window("New Window");  // Fail veriyor

        String CurrentWindowHandle= driver.getWindowHandle();
        System.out.println("CurrentWindowHandle "+CurrentWindowHandle);


        // Set is just like ArrayList, but without the duplicate values
        // getWindowHandles() ---> returns a set
        Set<String> windowHandles = driver.getWindowHandles();

            for (String windowHandle: windowHandles){
                System.out.println(windowHandle);

                if (!CurrentWindowHandle.equals(windowHandles)){
                    driver.switchTo().window(windowHandle);

                }
        }
        System.out.println("After Switching "+ driver.getTitle());

    }


    @Test
    public void changeByTitle(){
        driver.get("http://practice.cybertekschool.com/windows");
        String targetTitle="New Window";
        driver.findElement(By.linkText("Click Here")).click();

        System.out.println(driver.getWindowHandles().size());

        // itirate through all windows
        for (String handle: driver.getWindowHandles()){
            // switch to them one by one
            driver.switchTo().window(handle);
            // get title and compare target title
            if (driver.getTitle().equals(targetTitle)){
                // stop looping
                break;
            }
        }
        System.out.println(driver.getTitle());
    }
}
