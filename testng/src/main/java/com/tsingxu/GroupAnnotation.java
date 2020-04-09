package com.tsingxu;

import org.testng.annotations.Test;

public class GroupAnnotation {

    @Test(groups = "A")
    public void testA1() {
        System.out.println("分组A1");
    }

    @Test(groups = "A")
    public void testA2() {
        System.out.println("分组A2");
    }

    @Test(groups = "B")
    public void testB1() {
        System.out.println("分组B1");
    }
}
