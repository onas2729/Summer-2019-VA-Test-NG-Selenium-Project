package com.cybertek.tests.d14_properties_driver_class_test_base_class;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test
    public void test1(){
        String browser= ConfigurationReader.get("browser");
        System.out.println(browser);
        System.out.println(ConfigurationReader.get("url"));
        System.out.println(ConfigurationReader.get("mybrowser"));


    }
}
