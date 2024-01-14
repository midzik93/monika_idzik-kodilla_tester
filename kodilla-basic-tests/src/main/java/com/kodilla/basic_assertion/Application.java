package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);

        //by sprawdzić czy wynik jest poprawny używamy metody assertEquals
        //z klasy ResultChecker który zwraca wartość boolean
        //wartość boolean można przypisać do zmiennej

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda działa poprawnie dla tego zestawu danych");
        } else {
            System.out.println("Metoda działa niepoprawnie dla tego zestawu danych");
        }

        int subResult = calculator.subtract(a, b);
        boolean correct1 = ResultChecker.assertEquals(3, subResult);
        if (correct1) {
            System.out.println("Metoda działa poprawnie dla tego zestawu danych");
        } else {
            System.out.println("Metoda działa niepoprawnie dla tego zestawu danych");

        }

        int squareResult = calculator.square(a);
        boolean correct3 = ResultChecker.assertEquals(25, squareResult);
        if (correct3) {
            System.out.println("Metoda działa poprawnie dla tego zestawu danych");
        } else {
            System.out.println("Metoda działa niepoprawnie dla tego zestawu danych");

        }
    }
}
