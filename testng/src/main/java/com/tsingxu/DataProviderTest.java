package com.tsingxu;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "numbers")
    public Object[][] dataProvider(ITestContext context) {
        System.out.println(context.getName());
        for (String group : context.getIncludedGroups()){
            System.out.println(group);
        }
        return new Object[][]{{10, 20}, {20, 30}, {100, 110}};
    }

    @Test(dataProvider = "numbers",groups = "consumer")
    public void test(int number, int expect) {
        Assert.assertEquals(number + 10, expect);
    }
}
