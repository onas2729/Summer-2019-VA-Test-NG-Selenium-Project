package com.cybertek.tests.d14_properties_driver_class_test_base_class;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test1(){
        // Singleton s = new Singleton(); // So we cannot able to create an object of that class
        String s1 =Singleton.getInstance();
        String s2 =Singleton.getInstance();
        System.out.println("s1 = "+ s1);
        System.out.println("s2 = "+ s2);
    }
    @Test
    public void test2(){
        // this is how we created webdriver object from now on;
        // the type of the driver will come from the properties file.
        WebDriver driver = Driver.get();
        String url = ConfigurationReader.get("url");
        System.out.println(Driver.get().getTitle());
        Driver.closeDriver();
    }


    @Test
    public  void test3(){
        String url =ConfigurationReader.get("url");
        Driver.get().get(url);
        System.out.println(Driver.get().getTitle());
        // we use thid methodto coloe the driver.
        Driver.closeDriver();
    }

}
