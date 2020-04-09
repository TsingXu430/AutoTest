package com.tsingxu;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseAnnotation {

    public static void main(String[] args) {
        System.out.println("main");
    }

    @Test
    public void test() {
        System.out.println("test");
        Assert.assertEquals(2, 2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void test2() {
        int i = 1 / 0;
    }

    @Test(enabled = false)
    public void test3() {
        Assert.assertEquals(true, true);
    }

    @Test(timeOut = 2000)
    public void test4() throws InterruptedException {
        Thread.sleep(2500);
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }


    @BeforeClass
    public void BeforeClass() {
        System.out.println("BeforeClass");
    }
}
