package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void helloJenkinsTest() {
        System.out.println("Hello, Jenkins! This is a simple test case.");
        // A basic assertion; the test passes if true
        Assert.assertTrue(true, "The test should always pass.");
    }
}
