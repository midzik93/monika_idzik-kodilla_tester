package com.kodilla.parametrized_tests;

public class StringManipule {
    public String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        //to klasa w Javie, która pozwala na dynamiczną manipulację łańcuchami znaków.
        // Konstruktor StringBuilder(input) tworzy obiekt StringBuilder na podstawie istniejącego łańcucha input
        // zawartość obiektu builder będzie identyczna jak łańcuch input
        return builder.reverse().toString().toLowerCase(); // manipulacja łańcucha
        // Metoda builder.reverse() odwraca kolejność znaków w obiekcie builder
        //toString() konwertuje obiekt builder z powrotem na łańcuch typu String
        //toLowerCase() zmienia wszystkie znaki na małe litery.
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
        //replaceAll(" ", "") jest wywołaniem metody, która zamienia wszystkie wystąpienia spacji w łańcuchu input na puste ciągi znaków, czyli usuwa spacje.
    }
}
