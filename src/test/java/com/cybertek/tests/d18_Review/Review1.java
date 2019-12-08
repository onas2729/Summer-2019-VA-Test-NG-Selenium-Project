package com.cybertek.tests.d18_Review;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class Review1 extends TestBase {


    @Test
    public void TestCase1(){
        LoginPage loginPage = new LoginPage();
        String username= ConfigurationReader.get("sales_manager_username");
        String password=ConfigurationReader.get("sales_manager_password");
        loginPage.login(username,password);
    }
}
