package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTestSuite {


    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int sumResult = calculator.sum(5, 8);
        assertTrue(ResultChecker.assertEquals(13, sumResult));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int subResult = calculator.subtract(5, 8);
        assertTrue(ResultChecker.assertEquals(-3, subResult));
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int squareResult = calculator.square(5);
        assertTrue(ResultChecker.assertEquals(25, squareResult));
    }
}