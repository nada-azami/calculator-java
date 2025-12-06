// Test class
package com.pantxi.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


        private Calculator calculator = new Calculator();

        @Test
        public void testAdd() {
            // Test 1: Addition de nombres positifs
            assertEquals(5, calculator.add(2, 3), "2 + 3 devrait être 5");

            // Test 2: Addition avec zéro
            assertEquals(2, calculator.add(2, 0), "2 + 0 devrait être 2");

            // Test 3: Addition de nombres négatifs
            assertEquals(-1, calculator.add(2, -3), "2 + (-3) devrait être -1");

            // Test 4: Addition de deux nombres négatifs
            assertEquals(-5, calculator.add(-2, -3), "-2 + (-3) devrait être -5");
        }

        @Test
        public void testDivide() {
            // Test 1: Division normale
            assertEquals(2, calculator.divide(6, 3), "6 / 3 devrait être 2");

            // Test 2: Division avec résultat entier
            assertEquals(3, calculator.divide(7, 2), "7 / 2 devrait être 3 (division entière)");

            // Test 3: Division par 1
            assertEquals(5, calculator.divide(5, 1), "5 / 1 devrait être 5");
        }

        @Test
        public void testDivideByZero() {
            // Test: Division par zéro doit lancer une exception
            assertThrows(ArithmeticException.class,
                    () -> calculator.divide(5, 0),
                    "Division par zéro devrait lancer ArithmeticException");
        }
    }