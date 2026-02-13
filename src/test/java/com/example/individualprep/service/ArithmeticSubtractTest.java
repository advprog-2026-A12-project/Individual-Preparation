package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticSubtractTest {
    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testSubtractWithPositiveResult() {
        assertEquals(6.0, arithmeticUtility.subtract(10, 4));
    }

    @Test
    void testSubtractWithNegativeResult() {
        assertEquals(-5.0, arithmeticUtility.subtract(5, 10));
    }

    @Test
    void testSubtractWithPositiveNumber() {
        assertEquals(5.0, arithmeticUtility.subtract(10.0, 5.0));
    }

    @Test
    void testSubtractWithNegativeNumber() {
        assertEquals(15.0, arithmeticUtility.subtract(5, -10));
    }

    @Test
    void testSubtractWithZero() {
        assertEquals(10.0, arithmeticUtility.subtract(10.0, 0.0));
    }
}
