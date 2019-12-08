package com.cybertek.tests.d6_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {
    //this one will fail
    @Test
    public void test1(){
        System.out.println("first assertion");
        Assert.assertEquals("one","one");

        System.out.println("second assertion");
        Assert.assertEquals(1,1);

        System.out.println("third assertion");
        Assert.assertEquals(1.5,1.5);
    }
    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Assertion NOT Equals");
        Assert.assertNotEquals("one","two");
    }

    @Test
    public void test3() throws InterruptedException {
        Thread.sleep(1000);
        String ExpectedTitle="Cbt";
        String actualTitle="C";

        Assert.assertTrue(ExpectedTitle.contains(actualTitle));
        System.out.println("Test-3 first");
        Assert.assertTrue("karabacakn35@gmail.com".contains("@"));
        System.out.println("Test-3 second");
        Assert.assertTrue(1>0);
        System.out.println("Test-3 third");
        //System.out.println("a".equals("a"));

    }

    @Test
    public void test4() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertFalse(1<0);
        System.out.println("Test-4 false");
    }

    @Test
    public void test5() throws InterruptedException {
//Assert.assertEquals("cbt","CCBT", "Title did not match");
        Thread.sleep(1000);
        Assert.assertTrue("cbt.com".contains("."),"All emails MUST contain @ sign");
        System.out.println("All emails MUST contain @ sign");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("CLOSE CHROME");
    }

}
