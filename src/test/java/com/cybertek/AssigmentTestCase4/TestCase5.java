package com.cybertek.AssigmentTestCase4;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class TestCase5 extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        String url = ConfigurationReader.get("url");

        driver.get(url);
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Calendar Events")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title='Create Calendar event']")).click();
        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);

        WebElement first = driver.findElement(By.xpath("//*[@class='input-small timepicker-input start ui-timepicker-input']"));
        String start = first.getAttribute("value");
        String replace = start.replace(":", "").replace("PM", "").trim();

        WebElement second = driver.findElement(By.xpath("//*[@class='input-small timepicker-input end ui-timepicker-input']"));
        String actual2 = second.getAttribute("value");
        String replace2 = actual2.replace(":", "").replace("PM", "").trim();

        Integer result = Integer.parseInt(replace);
        Integer result2 = Integer.parseInt(replace2);

        System.out.println(result);
        System.out.println(result2);
        if (result == 11) {
            result = 00;
            if ((result2 - result) == 100) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
    }
}
