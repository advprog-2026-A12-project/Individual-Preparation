package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorNormTest {

   private final VectorUtility vectorUtility = new VectorUtility();

   @Test
   void testNorm_StandardPositive() {
      double[] vector = {3.0, 4.0};
      double result = vectorUtility.norm(vector);

      assertEquals(5.0, result, 0.0001);
   }

   @Test
   void testNorm_NegativeNumbers() {
      double[] vector = {-3.0, -4.0};
      double result = vectorUtility.norm(vector);

      assertEquals(5.0, result, 0.0001);
   }

   @Test
   void testNorm_ZeroVector() {
      double[] vector = {0.0, 0.0};
      double result = vectorUtility.norm(vector);

      assertEquals(0.0, result, 0.0001);
   }

   @Test
   void testNorm_SingleElement() {
      double[] vector = {9.0};
      double result = vectorUtility.norm(vector);

      assertEquals(9.0, result, 0.0001);
   }
}
