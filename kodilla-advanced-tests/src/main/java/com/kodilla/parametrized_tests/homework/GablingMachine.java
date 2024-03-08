package com.kodilla.parametrized_tests.homework;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GablingMachine {
    //metoda zwraca liczby wybrane przez użytkownika- zgadzające się
    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            throw new InvalidNumbersException();
        }
    }

    //zakres liczb poza 1-49 (czyli 0,50,49,1)
    private boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) {
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 49);
    }

    // liczba w kolekcji nie może być równa 6
    private boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }
// generuje zestaw 6 liczb od 0 do 49 wlącznie
    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }
}
