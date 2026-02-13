package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticMultiplyTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testMultiply_PositiveNumbers() {
        double result = arithmeticUtility.multiply(4.0, 5.0);
        assertEquals(20.0, result, 0.0001);
    }

    @Test
    void testMultiply_NegativeNumbers() {
        double result = arithmeticUtility.multiply(-4.0, -5.0);
        assertEquals(20.0, result, 0.0001);
    }

    @Test
    void testMultiply_MixedNumbers() {
        double result = arithmeticUtility.multiply(4.0, -5.0);
        assertEquals(-20.0, result, 0.0001);
    }

    @Test
    void testMultiply_WithZero() {
        double result = arithmeticUtility.multiply(4.0, 0.0);
        assertEquals(0.0, result, 0.0001);
    }
}
