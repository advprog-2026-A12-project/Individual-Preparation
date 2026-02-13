package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorMultiplyTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testMultiply_PositiveScalar() {
        double[] v1 = {1.0, 2.0, 3.0};

        double[] result = vectorUtility.multiply(v1, 2);

        double[] expected = {2.0, 4.0, 6.0};

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testMultiply_NegativeScalar() {
        double[] v1 = {1.0, -2.0, 3.0};

        double[] result = vectorUtility.multiply(v1, -1);

        double[] expected = {-1.0, 2.0, -3.0};

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testMultiply_ZeroScalar() {
        double[] v1 = {5.0, 10.0, -3.0};

        double[] result = vectorUtility.multiply(v1, 0);

        double[] expected = {0.0, 0.0, 0.0};

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testMultiply_NullVector() {
        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.multiply(null, 2);
        });
    }
}
