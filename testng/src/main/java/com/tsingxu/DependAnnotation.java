package com.tsingxu;

import org.testng.annotations.Test;

public class DependAnnotation {

    @Test(dependsOnGroups = "A")
    public void test1() {
        System.out.println("depend group A");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("depend method test1");
    }
}
