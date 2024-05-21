package com.tomgregory;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GradleTutorialAddTwoNumbersTest {
    @Test
    public void addTwoPositiveNumbers() {
        assertEquals(5, addTwoNumbers(2, 3));
    }
    @Test
    public void addPositiveAndNegativeNumbers() {
        assertEquals(-1, addTwoNumbers(2, -3));
    }
    @Test
    public void addTwoNegativeNumbers() {
        assertEquals(-5, addTwoNumbers(-2, -3));
    }
    
    @Test
    public void addNumberToZero() {
        assertEquals(2, addTwoNumbers(2, 0));
    }
    @Test(expected = ArithmeticException.class)
    public void addTwoMaxIntegers() {
        addTwoNumbers(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}