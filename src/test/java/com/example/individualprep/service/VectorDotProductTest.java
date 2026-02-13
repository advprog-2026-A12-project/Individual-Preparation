package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorDotProductTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testDotProductResult() {
        double[] v1 = {1, 2, 3};
        double[] v2 = {4, 5, 6};

        double result = vectorUtility.dotProduct(v1, v2);

        assertEquals(32.0, result);
    }

    @Test
    void testDotProductWithNegativeNumbers() {
        double[] v1 = {-1, 2, -3};
        double[] v2 = {4, -5, 6};

        double result = vectorUtility.dotProduct(v1, v2);

        assertEquals(-32.0, result);
    }

    @Test
    void testDotProductForZeroVector() {
        double[] v1 = {0, 0, 0};
        double[] v2 = {4, 5, 6};

        double result = vectorUtility.dotProduct(v1, v2);

        assertEquals(0.0, result);
    }

    @Test
    void testDotProductForMismatchInput() {
        double[] v1 = {1, 2};
        double[] v2 = {3, 4, 5};

        assertThrows(IllegalArgumentException.class,
                () -> vectorUtility.dotProduct(v1, v2));
    }
}
