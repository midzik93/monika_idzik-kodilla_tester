package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GamblingMachineTestSuite {

    GablingMachine gablingMachine=new GablingMachine();
    @ParameterizedTest
    @CsvFileSource(resources = "/fileWithNumber.csv", numLinesToSkip = 1)
    public void shouldCountCorrectNumberOfWins(int expectedWins, String numbers) throws InvalidNumbersException {
        String[] numbersArray = numbers.split(",");
        Set<Integer> userNumbers = new HashSet<>();; // inicjalizacja w metodzie testowej
        for (String number : numbersArray) {
            userNumbers.add(Integer.parseInt(number));
        }

        assertEquals(expectedWins, gablingMachine.howManyWins(userNumbers));
    }
}
