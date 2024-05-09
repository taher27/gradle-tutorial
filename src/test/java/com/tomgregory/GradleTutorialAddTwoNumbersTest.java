

package com.tomgregory;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GradleTutorialAddTwoNumbersTest {
    @Test
    public void testAdditionOfTwoPositiveNumbers() {
        // If this test fails, check if the addTwoNumbers method is correctly implementing addition.
        int a = 5;
        int b = 7;
        int expected = 12;
        assertEquals(expected, addTwoNumbers(a, b));
    }
    @Test
    public void testAdditionOfTwoNegativeNumbers() {
        // If this test fails, check if the addTwoNumbers method is correctly implementing addition with negative numbers.
        int a = -5;
        int b = -7;
        int expected = -12;
        assertEquals(expected, addTwoNumbers(a, b));
    }
    @Test
    public void testAdditionOfPositiveAndNegativeNumber() {
        // If this test fails, check if the addTwoNumbers method is correctly implementing addition with a mix of positive and negative numbers.
        int a = 5;
        int b = -7;
        int expected = -2;
        assertEquals(expected, addTwoNumbers(a, b));
    }
    @Test
    public void testAdditionOfTwoZeroes() {
        // If this test fails, check if the addTwoNumbers method is correctly implementing addition with zero.
        int a = 0;
        int b = 0;
        int expected = 0;
        assertEquals(expected, addTwoNumbers(a, b));
    }
    public int addTwoNumbers(int a, int b) {
        // If there's a compilation error, it might be due to this method not being defined correctly.
        return a + b;
    }
}
