package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticExponentTest {
    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testExponent_PositiveBasePositiveExponent() {
        // 2^3 = 8
        double result = arithmeticUtility.exponent(2.0, 3);
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    void testExponent_PositiveBaseZeroExponent() {
        // 5^0 = 1
        double result = arithmeticUtility.exponent(5.0, 0);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    void testExponent_ZeroBaseZeroExponent() {
        // 0^0 = 1 (by convention in code)
        double result = arithmeticUtility.exponent(0.0, 0);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    void testExponent_PositiveBaseNegativeExponent() {
        // 2^(-3) = 1/8 = 0.125
        double result = arithmeticUtility.exponent(2.0, -3);
        assertEquals(0.125, result, 0.0001);
    }

    @Test
    void testExponent_NegativeBasePositiveExponent() {
        // (-2)^3 = -8
        double result = arithmeticUtility.exponent(-2.0, 3);
        assertEquals(-8.0, result, 0.0001);
    }

    @Test
    void testExponent_NegativeBaseEvenExponent() {
        // (-2)^2 = 4
        double result = arithmeticUtility.exponent(-2.0, 2);
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    void testExponent_NegativeBaseNegativeExponent() {
        // (-2)^(-3) = 1/(-8) = -0.125
        double result = arithmeticUtility.exponent(-2.0, -3);
        assertEquals(-0.125, result, 0.0001);
    }

    @Test
    void testExponent_ExponentOne() {
        // 7^1 = 7
        double result = arithmeticUtility.exponent(7.0, 1);
        assertEquals(7.0, result, 0.0001);
    }

    @Test
    void testExponent_BaseOne() {
        // 1^10 = 1
        double result = arithmeticUtility.exponent(1.0, 10);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    void testExponent_BaseZeroPositiveExponent() {
        // 0^5 = 0
        double result = arithmeticUtility.exponent(0.0, 5);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void testExponent_DecimalBase() {
        // 0.5^2 = 0.25
        double result = arithmeticUtility.exponent(0.5, 2);
        assertEquals(0.25, result, 0.0001);
    }

    @Test
    void testExponent_DecimalBaseNegativeExponent() {
        // 0.5^(-2) = 1/0.25 = 4
        double result = arithmeticUtility.exponent(0.5, -2);
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    void testExponent_LargeExponent() {
        // 2^10 = 1024
        double result = arithmeticUtility.exponent(2.0, 10);
        assertEquals(1024.0, result, 0.0001);
    }

    @Test
    void testExponent_NegativeOne() {
        // (-1)^5 = -1
        double result = arithmeticUtility.exponent(-1.0, 5);
        assertEquals(-1.0, result, 0.0001);
    }

    @Test
    void testExponent_NegativeOneEvenExponent() {
        // (-1)^4 = 1
        double result = arithmeticUtility.exponent(-1.0, 4);
        assertEquals(1.0, result, 0.0001);
    }
}