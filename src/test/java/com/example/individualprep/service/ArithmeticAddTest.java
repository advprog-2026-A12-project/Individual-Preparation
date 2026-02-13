package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticAddTest {
   private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

   @Test
   void testAdd_PositiveNumbers() {
      double result = arithmeticUtility.add(10.0, 5.0);
      assertEquals(15.0, result, 0.0001);
   }

   @Test
   void testAdd_NegativeNumbers() {
      // -10 + (-5) = -15
      double result = arithmeticUtility.add(-10.0, -5.0);
      assertEquals(-15.0, result, 0.0001);
   }

   @Test
   void testAdd_MixedNumbers() {
      // 10 + (-5) = 5
      double result = arithmeticUtility.add(10.0, -5.0);
      assertEquals(5.0, result, 0.0001);
   }

}