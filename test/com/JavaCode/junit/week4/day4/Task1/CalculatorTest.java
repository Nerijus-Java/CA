package com.JavaCode.junit.week4.day4.Task1;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    public static final int LAST_NUMBER = 1000;
    public static final int FIRST_NUMBER = 1000;

    @Test
    public void testSum() {

        for (int a = 0; a < FIRST_NUMBER; a++) {
            for (int b = 0; b < LAST_NUMBER; b++) {
                Calculator calculator = new Calculator(a, b);
                int number = calculator.sum();
                Assert.assertEquals(a + b, number);
            }
        }
    }

    @Test
    public void testSubtraction() {
        for (int a = 0; a < FIRST_NUMBER; a++) {
            for (int b = 0; b < LAST_NUMBER; b++) {
                Calculator calculator = new Calculator(a, b);
                int number = calculator.subtraction();
                Assert.assertEquals(a - b, number);
            }
        }
    }

    @Test
    public void testTimes() {
        for (int a = 0; a < FIRST_NUMBER; a++) {
            for (int b = 0; b < LAST_NUMBER; b++) {
                Calculator calculator = new Calculator(a, b);
                int number = calculator.times();
                Assert.assertEquals(a * b, number);
            }
        }
    }

    @Test
    public void testDivide() {
        for (int a = 1; a < FIRST_NUMBER; a++) {
            for (int b = 1; b < LAST_NUMBER; b++) {
                Calculator calculator = new Calculator(a, b);
                int number = calculator.divide();
                Assert.assertEquals(a / b, number);
            }
        }
    }
}
