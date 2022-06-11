package com.bridgelabz.list;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestNG {

    /*The default order of execution of multiple test methods is alphabetical order
     *  When two test methods are dependent on each other, it results in to Testng Except
     * InvocationCount Attribute, priority, dependsOnMethods,enabled = false
     * When two test methods are dependent on each other, it results in to Testng Exception */

    @Test(priority = 2, dependsOnMethods = "signUp")
    public void login(){
        System.out.println("Logging inn");
    }

    @Test(priority = 1)
    public void signUp(){
        System.out.println("Sign Up");
        Assert.assertEquals(200, 201);
    }

    @Test(invocationCount = 1, priority = 3 /*enabled = false*/)
    public void acb(){
        System.out.println("abc running");
    }
}
