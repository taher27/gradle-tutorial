package com.tomgregory;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GradleTutorialAddTwoNumbersTest {
    @Test
    public void addPositiveNumbers() {
        int a = 5;
        int b = 7;
        int expected = 12;
        assertEquals(expected, addTwoNumbers(a, b));
    }
    @Test
    public void addPositiveNumberAndZero() {
        int a = 5;
        int b = 0;
        int expected = 5;
        assertEquals(expected, addTwoNumbers(a, b));
    }
    @Test
    public void addNegativeNumbers() {
        int a = -5;
        int b = -7;
        int expected = -12;
        assertEquals(expected, addTwoNumbers(a, b));
    }
    @Test
    public void addPositiveAndNegativeNumbers() {
        int a = 5;
        int b = -7;
        int expected = -2;
        assertEquals(expected, addTwoNumbers(a, b));
    }
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }
}