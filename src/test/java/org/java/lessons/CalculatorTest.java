package org.java.lessons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator clc = null;

    @BeforeEach
    void init() {
        System.out.println("init before each");
        clc = new Calculator();
    }

    @Test
    void add() {
        assertEquals(4, clc.add(2,2), "Test fallito");
    }

    @Test
    void subtract() {
        assertEquals(2, clc.subtract(4,2), "Test fallito");
    }

    @Test
    void divide() {
        assertEquals(2, clc.divide(4,2), "Test fallito");
    }

    @Test
    void multiply() {
        assertEquals(4, clc.multiply(2,2), "Test fallito");
    }
}