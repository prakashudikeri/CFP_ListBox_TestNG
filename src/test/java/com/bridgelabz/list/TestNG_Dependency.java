package com.bridgelabz.list;

import org.asynchttpclient.util.Assertions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Dependency {

        @Test(groups={"user"})
        public void CreateUser(){ Reporter.log("1", true); }

        @Test(priority=2, invocationCount=1, enabled=true, groups={"user"})
        public void editUser(){ Reporter.log("2", true); }

        @Test(groups={"abc", "smoke"})
        public void deleteUser(){ Reporter.log("3", true); }

        @Test(priority=1, groups={"product", "smoke"})
        public void createProduct(){ Reporter.log("4", true); }

        @Test(priority=2, invocationCount=1, enabled=true, groups={"product"})
        public void editProduct(){ Reporter.log("5", true); }

        @Test(priority=3, groups={"product"})
        public void deleteProduct(){ Reporter.log("6", true);
        }
}


