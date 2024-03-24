package com.kodilla.parametrized_tests;


public class StringValidator {
    public boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
        //sprawdzamy, czy podany łańcuch text jest pusty lub składa się tylko z białych znaków (np. spacje, tabulatory).
        //text.trim().isEmpty() usuwa początkowe i końcowe białe znaki z łańcucha (trim()) i sprawdza, czy otrzymany łańcuch jest pusty
        // zwracane jest true jeśli którykolwiek warunek jest spełniony (czyli jest null lub ma białe znaki)

    }

}
