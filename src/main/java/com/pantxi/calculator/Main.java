// Main class
package com.pantxi.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test de l'addition
        int resultAdd = calc.add(10, 5);
        System.out.println("10 + 5 = " + resultAdd);

        // Test de la division
        try {
            int resultDivide = calc.divide(10, 2);
            System.out.println("10 / 2 = " + resultDivide);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}