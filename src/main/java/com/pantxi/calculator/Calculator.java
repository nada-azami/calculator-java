package com.pantxi.calculator;

public class Calculator {

    /**
     * Additionne deux nombres entiers
     * @param opG premier opérande (opérande gauche)
     * @param opD deuxième opérande (opérande droit)
     * @return la somme de opG et opD
     */
    public int add(int opG, int opD) {
        return opG + opD;
    }

    /**
     * Divise deux nombres entiers
     * @param opG dividende (opérande gauche)
     * @param opD diviseur (opérande droit)
     * @return le résultat de la division
     * @throws ArithmeticException si opD est zéro
     */
    public int divide(int opG, int opD) {
        if (opD == 0) {
            throw new ArithmeticException("Division par zéro !");
        }
        return opG / opD;
    }
}// Calculator class
