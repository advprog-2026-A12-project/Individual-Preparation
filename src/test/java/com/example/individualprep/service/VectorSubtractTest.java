package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class VectorSubtractTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testSubtract_StandardVectors() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        double[] expected = {-3.0, -3.0, -3.0};

        double[] result = vectorUtility.subtract(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testSubtract_NegativeNumbers() {
        double[] v1 = {-1.0, -2.0, -3.0};
        double[] v2 = {1.0, 2.0, 3.0};
        double[] expected = {-2.0, -4.0, -6.0};

        double[] result = vectorUtility.subtract(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testSubtract_ZeroVectors() {
        double[] v1 = {0.0, 0.0, 0.0};
        double[] v2 = {0.0, 0.0, 0.0};
        double[] expected = {0.0, 0.0, 0.0};

        double[] result = vectorUtility.subtract(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testSubtract_SingleElement() {
        double[] v1 = {5.0};
        double[] v2 = {3.0};
        double[] expected = {2.0};

        double[] result = vectorUtility.subtract(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testSubtract_EmptyVectors() {
        double[] v1 = {};
        double[] v2 = {};
        double[] expected = {};

        double[] result = vectorUtility.subtract(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testSubtract_DifferentLengths() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0};

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> vectorUtility.subtract(v1, v2)
        );

        assertEquals("Vectors dont have same length", exception.getMessage());
    }

    @Test
    void testSubtract_DecimalNumbers() {
        double[] v1 = {1.5, 2.7, 3.3};
        double[] v2 = {0.5, 0.3, 0.7};
        double[] expected = {1.0, 2.4, 2.6};

        double[] result = vectorUtility.subtract(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }
}
