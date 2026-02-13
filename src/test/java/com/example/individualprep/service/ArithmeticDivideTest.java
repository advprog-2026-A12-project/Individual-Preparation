package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticDivideTest {
    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testDivide_PositiveByPositive() {
        // 10 / 2 = 5
        double result = arithmeticUtility.divide(10.0, 2.0);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testDivide_PositiveByNegative() {
        // 10 / -2 = -5
        double result = arithmeticUtility.divide(10.0, -2.0);
        assertEquals(-5.0, result, 0.0001);
    }

    @Test
    void testDivide_NegativeByPositive() {
        // -10 / 2 = -5
        double result = arithmeticUtility.divide(-10.0, 2.0);
        assertEquals(-5.0, result, 0.0001);
    }

    @Test
    void testDivide_NegativeByNegative() {
        // -10 / -2 = 5
        double result = arithmeticUtility.divide(-10.0, -2.0);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testDivide_ZeroNumerator() {
        // 0 / 5 = 0
        double result = arithmeticUtility.divide(0.0, 5.0);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void testDivide_DecimalValues() {
        // 5.5 / 2 = 2.75
        double result = arithmeticUtility.divide(5.5, 2.0);
        assertEquals(2.75, result, 0.0001);
    }
    
    @Test
    void testDivide_SmallDecimalDivisor() {
        // 1 / 0.5 = 2
        double result = arithmeticUtility.divide(1.0, 0.5);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    void testDivide_DivideByZero() {
        // Expect IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            arithmeticUtility.divide(10.0, 0.0);
        });
    }

    @Test
    void testDivide_DivideByZeroNegativeNumerator() {
        // Expect IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            arithmeticUtility.divide(-5.0, 0.0);
        });
    }
}
