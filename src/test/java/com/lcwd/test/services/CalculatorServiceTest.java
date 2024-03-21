package com.lcwd.test.services;


import org.junit.jupiter.api.*;

public class CalculatorServiceTest
{

    @BeforeAll //This help in initializing  logic before executing any test  cases
    public static void init()
    {
        System.out.println("Before all Test case I am Executed :) ");
        System.out.println("Testing Begin");
    }

    @BeforeEach
    public void beforeEach()
    {
        //This Executes before each test case
        System.out.println("I Execute Before Each Test Case");
    }

    //Test Method of add Two Numbers
    @Test
    //@Disabled// If we want to Ignore any test case
    public void addTwoNumbersTest()
    {
        System.out.println("Test Beginning for addTwoNumbers");
        int result=CalculatorService.addTwoNumbers(12,45);
        int expected=57;
        Assertions.assertEquals(expected,result);
        System.out.println("Test Ending for addTwoNumbers");
    }

    @Test
    public void sumAnyNumbersTest() throws InterruptedException {
        //It has time limit of 2 seconds
        System.out.println("Test Beginning for addAnyNumbers");
        int result=CalculatorService.sumAnyNumbers(2,8,9,1,9);
        int expected=29;
        //Thread.sleep(3000);
        Assertions.assertEquals(expected,result,"Test Failed");
        System.out.println("Test Ending for addAnyNumbers");
    }

    @AfterEach
    public void afterEach()
    {
        System.out.println("I Execute After Each Test Case");
    }

    @AfterAll //This Executes after all test cases
    public static void cleanup()
    {
        System.out.println("Testing Ended");
        System.out.println("After all Test case I am Executed :) ");
    }
}
