// ********RoostGPT********
/*
Test generated by RoostGPT for test testGradleReport using AI Type Open AI and AI Model gpt-4

ROOST_METHOD_HASH=addTwoNumbers_cca9997f57
ROOST_METHOD_SIG_HASH=addTwoNumbers_da7966707b

Scenario 1: Test Addition of Two Positive Numbers

Details:  
  TestName: testAdditionOfPositiveNumbers
  Description: This test is meant to check the correct addition of two positive numbers. The target scenario is the normal operation of the addTwoNumbers method.
Execution:
  Arrange: Set up two positive integers.
  Act: Invoke the addTwoNumbers method with the two positive integers.
  Assert: Use JUnit assertions to check if the result is the correct sum of the two numbers.
Validation: 
  The assertion verifies if the method correctly adds two positive numbers. This is a basic functionality of the method and is crucial for the application's correct operation.

Scenario 2: Test Addition of Two Negative Numbers

Details:  
  TestName: testAdditionOfNegativeNumbers
  Description: This test is meant to check the correct addition of two negative numbers. The target scenario is the normal operation of the addTwoNumbers method when provided with negative numbers.
Execution:
  Arrange: Set up two negative integers.
  Act: Invoke the addTwoNumbers method with the two negative integers.
  Assert: Use JUnit assertions to check if the result is the correct sum of the two numbers.
Validation: 
  The assertion verifies if the method correctly adds two negative numbers. This is a basic functionality of the method and is crucial for the application's correct operation.

Scenario 3: Test Addition of a Positive Number and a Negative Number

Details:  
  TestName: testAdditionOfPositiveAndNegativeNumbers
  Description: This test is meant to check the correct addition of a positive number and a negative number. The target scenario is the normal operation of the addTwoNumbers method when provided with a positive and a negative number.
Execution:
  Arrange: Set up a positive integer and a negative integer.
  Act: Invoke the addTwoNumbers method with the positive and negative integers.
  Assert: Use JUnit assertions to check if the result is the correct sum of the two numbers.
Validation: 
  The assertion verifies if the method correctly adds a positive number and a negative number. This is a basic functionality of the method and is crucial for the application's correct operation.

Scenario 4: Test Addition of Zero and a Number

Details:  
  TestName: testAdditionOfZeroAndNumber
  Description: This test is meant to check the correct addition of zero and any number. The target scenario is the normal operation of the addTwoNumbers method when provided with zero and another number.
Execution:
  Arrange: Set up zero and any integer.
  Act: Invoke the addTwoNumbers method with zero and the integer.
  Assert: Use JUnit assertions to check if the result is equal to the non-zero number.
Validation: 
  The assertion verifies if the method correctly adds zero and a number. This is a basic functionality of the method and is crucial for the application's correct operation.
*/

// ********RoostGPT********

package com.tomgregory;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradleTutorialAddTwoNumbersTest {
    @ParameterizedTest
    @MethodSource("additionProvider")
    public void testAddition(int a, int b, int expected) {
        int result = addTwoNumbers(a, b);
        assertEquals(expected, result);
    }

    private static Stream<Object[]> additionProvider() {
        return Stream.of(
                new Object[]{5, 10, 15},
                new Object[]{-5, -10, -15},
                new Object[]{5, -10, -5},
                new Object[]{0, 10, 10}
        );
    }

    private int addTwoNumbers(int a, int b) {
        return a + b;
    }
}
