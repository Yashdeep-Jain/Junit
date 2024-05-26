package com.lcwy.test.services;

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {

    int counter = 0;

    @BeforeClass
    public static void init() {
        System.out.println("Before all testcases");
        System.out.println("Started test : " + new Date());
    }
    //test method of addTwoNumbers
    @Before
    public void beforeEach(){
        System.out.println("Before each test case");
        counter=0;
    }

    @Test(timeout = 2000)
    public void addTwoNumbersTest() throws InterruptedException {
        for(int i = 0; i <=20;i++){
            counter+=i;
        }

        Thread.sleep(3000);

        System.out.println("Add test");
        int result = CalculatorService.addTwoNumbers(12, 45);
        int expected=57;
        System.out.println("Counter in first test : " + counter);
        Assert.assertEquals(expected,result);
        //actual result
        //expected result
    }

    @Test
    public void sumAnyNumberTest(){
        for(int i = 0; i <=100;i++){
            counter+=i;
        }
        System.out.println("Sum test");
        int result = CalculatorService.sumAnyNymbers(2,7,8,9);
        int expectedResult = 26;
        System.out.println("Counter in second test : " + counter);

        Assert.assertEquals(expectedResult,result);
    }

    @AfterClass
    public static void cleanup(){
        System.out.println("After all tests");
        System.out.println("End test : " + new Date());
    }
}
