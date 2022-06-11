package com.bridgelabz.list;

import org.asynchttpclient.util.Assertions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;

public class Test_NG {

    /*-----------Checking sequence of Annotation in TestNG class-----------*/
    @BeforeMethod
    public void beforeMethod() {
         Reporter.log("beforeMethod", true);
     }

    @AfterMethod
    public void afterMethod() {
         Reporter.log("afterMethod", true);
     }

    @BeforeClass ()
    public void beforeClass() {
         Reporter.log("beforeClass", true);
     }

    @AfterClass
    public void afterClass() {
         Reporter.log("afterClass", false);
     }

    @BeforeTest
    public void beforeTest() {
         Reporter.log("beforeTest", true);
     }

    @AfterTest
    public void afterTest() {
         Reporter.log("afterTest", true);
     }

    @BeforeSuite
    public void beforeSuite() {
         Reporter.log("beforeSuite", true);
     }

    @AfterSuite
    public void afterSuite() {
         Reporter.log("afterSuite", true);
     }

     /*---------------------------Alphabetical Order--------------------*/
    @Test
    public void test01(){System.out.println("Test 1"); }

    @Test
    public void abc02(){System.out.println("ABC 2"); }

    @Test
    public void test03(){ System.out.println("Test 3"); }

    @Test
    public void test04(){ System.out.println("Test 4"); }

    @Test
    public void lmn05(){ System.out.println("LMN 5"); }

    /*--------------------------Group Attribute--------------------------*/
    @Test (groups = {"Module 1"})
    public void test06(){ System.out.println("Test 6");}

    @Test (groups = {"Module 2"})
    public void test07(){ System.out.println("Test 7"); }

    /*---------------------------------Priority------------------------------------*/
    @Test (priority = 1)
    public void test08(){ System.out.println("Test 8");}

    @Test (priority = 0)
    public void test09(){ System.out.println("Test 9"); }

    /*------------------------------Invocation Count------------------------------*/
    @Test (invocationCount = 2)
    public void test10(){ System.out.println("Test 10");}

    @Test (invocationCount = 0)
    public void test11(){ System.out.println("Test 11"); }

    @Test (invocationCount = 2, enabled = false)
    public void test12(){ System.out.println("Test 12");}

    @Test (priority = 2)
    public void test13(){ System.out.println("Test 13");}

//    /*-----------------------------Dependency Methods-------------------------*/
//    @Test(priority = 3, dependsOnMethods = "test15")
//    public void test14(){ System.out.println("Test 14");}
//
//    @Test (priority = 4, dependsOnMethods = "test14")
//    public void test15(){ System.out.println("Test 15");
//    }


    /*------------------------------Set Method Dependency-------------------------*/
    @Test
    public void test16(){ System.out.println("Test 16");
        Assert.fail();  }

    @Test (dependsOnMethods = "test16")
    public void test17(){ System.out.println("Test 17"); }

}
