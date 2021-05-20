package com.hp.devops.demoapp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * check reports in case of failures in BeforeClass
 */
public class MyTest_beforeFailed {

    @Before
    public void before_failed() {
        String str = null;
        System.out.println(str.length());
    }

    @Test
    public void passed1() {
        Assert.assertNotNull("aaa");
    }

    @Test
    public void passed2() {
        Assert.assertNotNull("aaa");
    }

    @Test
    public void failed_Assertion() {
        Assert.assertNotNull(null);
    }

    @Test
    public void failed_NullPointerException() {
        String s = null;
        System.out.println(s.length());
    }
}


