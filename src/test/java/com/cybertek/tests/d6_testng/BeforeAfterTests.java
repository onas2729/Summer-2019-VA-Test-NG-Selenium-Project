package com.cybertek.tests.d6_testng;

import org.testng.annotations.*;

public class BeforeAfterTests {

    @Test
    public void test1(){

        System.out.println("This is test one");
    }

    @Test
    public void test2(){

        System.out.println("This is test second");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("BEFORE METHOD");
        System.out.println("OPENING CHROME");
    }

    @AfterMethod
    public void tearDownTest(){
        System.out.println("AFTER METHOD");
        System.out.println("CLOSING CHROME");
    }

    @BeforeClass
    public void setupClass(){
        System.out.println("BEFORE CLASS: RUNNING ONLY ONE TIME");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("AFTER CLASS: RUNNING ONLY ONE TIME");
    }





}
