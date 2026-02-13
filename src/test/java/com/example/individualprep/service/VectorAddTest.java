package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class VectorAddTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testAdd_StandardVectors() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        double[] expected = {5.0, 7.0, 9.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAdd_NegativeNumbers() {
        double[] v1 = {-1.0, -2.0, -3.0};
        double[] v2 = {1.0, 2.0, 3.0};
        double[] expected = {0.0, 0.0, 0.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAdd_ZeroVectors() {
        double[] v1 = {0.0, 0.0, 0.0};
        double[] v2 = {0.0, 0.0, 0.0};
        double[] expected = {0.0, 0.0, 0.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAdd_SingleElement() {
        double[] v1 = {5.0};
        double[] v2 = {3.0};
        double[] expected = {8.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAdd_EmptyVectors() {
        double[] v1 = {};
        double[] v2 = {};
        double[] expected = {};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAdd_FirstVectorNull() {
        double[] v2 = {1.0, 2.0};

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> vectorUtility.add(null, v2)
        );

        assertEquals("Vectors cannot be null", exception.getMessage());
    }

    @Test
    void testAdd_SecondVectorNull() {
        double[] v1 = {1.0, 2.0};

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> vectorUtility.add(v1, null)
        );

        assertEquals("Vectors cannot be null", exception.getMessage());
    }

    @Test
    void testAdd_BothVectorsNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> vectorUtility.add(null, null)
        );

        assertEquals("Vectors cannot be null", exception.getMessage());
    }

    @Test
    void testAdd_DifferentLengths() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0};

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> vectorUtility.add(v1, v2)
        );

        assertEquals("Vectors dont have same length", exception.getMessage());
    }

    @Test
    void testAdd_DecimalNumbers() {
        double[] v1 = {1.5, 2.7, 3.3};
        double[] v2 = {0.5, 0.3, 0.7};
        double[] expected = {2.0, 3.0, 4.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }
}