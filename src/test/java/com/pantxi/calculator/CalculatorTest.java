// Test class
package com.pantxi.calculator;



import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        // Test 1: Addition de nombres positifs (AssertJ style)
        assertThat(calculator.add(2, 3)).as("2 + 3").isEqualTo(5);

        // Test 2: Addition avec zéro
        assertThat(calculator.add(2, 0)).isEqualTo(2);

        // Test 3: Addition de nombres négatifs
        assertThat(calculator.add(2, -3)).isEqualTo(-1);

        // Test 4: Addition de deux nombres négatifs
        assertThat(calculator.add(-2, -3)).isEqualTo(-5);
    }

    @Test
    public void testDivide() {
        // Test 1: Division normale
        assertThat(calculator.divide(6, 3)).isEqualTo(2);

        // Test 2: Division avec résultat entier
        assertThat(calculator.divide(7, 2)).isEqualTo(3);

        // Test 3: Division par 1
        assertThat(calculator.divide(5, 1)).isEqualTo(5);
    }

    @Test
    public void testDivideByZero() {
        // Test: Division par zéro doit lancer une exception (AssertJ style)
        assertThatThrownBy(() -> calculator.divide(5, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Division par zéro !");
    }
}