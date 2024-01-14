package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(13, calculator.sum(5, 8));
        assertEquals(10, calculator.sum(5, 5));
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-5, subResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);
    }

    @Test
    public void testSub2() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        boolean correct1 = ResultChecker.assertEquals(3, subResult);
        if (correct1) {
            System.out.println("Metoda działa poprawnie dla tego zestawu danych");
        } else {
            System.out.println("Metoda działa niepoprawnie dla tego zestawu danych");

        }
    }

    @Test
    public void testSquare2() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = calculator.square(a);
        boolean correct3 = ResultChecker.assertEquals(25, squareResult);
        if (correct3) {
            System.out.println("Metoda działa poprawnie dla tego zestawu danych");
        } else {
            System.out.println("Metoda działa niepoprawnie dla tego zestawu danych");

        }

    }

    @Test
    public void testSquare3() {
        Calculator calculator = new Calculator();
        int a = -4;
        int squareResult = calculator.square(a);
        boolean correct3 = ResultChecker.assertEquals(16, squareResult);
        if (correct3) {
            System.out.println("Metoda działa poprawnie dla tego zestawu danych");
        } else {
            System.out.println("Metoda działa niepoprawnie dla tego zestawu danych");

        }

    }

    @Test
    public void testSquare4() {
        Calculator calculator = new Calculator();
        int a = 6;
        int squareResult = calculator.square(a);
        boolean correct3 = ResultChecker.assertEquals(36, squareResult);
        if (correct3) {
            System.out.println("Metoda działa poprawnie dla tego zestawu danych");
        } else {
            System.out.println("Metoda działa niepoprawnie dla tego zestawu danych");

        }


    }

    @Test
    public void testSquare5() {
        Calculator calculator = new Calculator();
        double c = 6.25;
        double squareResult = calculator.square2(c);
        double delta = 0;
        boolean correct3 = ResultChecker.assertEquals2(36, squareResult, 0.001);
        if (correct3) {
            System.out.println("Metoda działa poprawnie dla tego zestawu danych");
        } else {
            System.out.println("Metoda działa niepoprawnie dla tego zestawu danych");

        }


    }

    @Test
    public void testSquare6() {
        Calculator calculator = new Calculator();
        double c = -6.25;
        double squareResult = calculator.square2(c);
        double delta = 0;
        boolean correct3 = ResultChecker.assertEquals2(36, squareResult, 0.001);
        if (correct3) {
            System.out.println("Metoda działa poprawnie dla tego zestawu danych");
        } else {
            System.out.println("Metoda działa niepoprawnie dla tego zestawu danych");

        }
    }

    @Test
    public void testSquare7() {
        Calculator calculator = new Calculator();
        double c = 0;
        double squareResult = calculator.square2(c);
        double delta = 0;
        boolean correct3 = ResultChecker.assertEquals2(36, squareResult, 0.001);
        if (correct3) {
            System.out.println("Metoda działa poprawnie dla tego zestawu danych");
        } else {
            System.out.println("Metoda działa niepoprawnie dla tego zestawu danych");

        }


    }

}







