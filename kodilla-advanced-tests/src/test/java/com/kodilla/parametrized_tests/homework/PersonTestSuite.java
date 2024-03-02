package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {
    @ParameterizedTest
    @MethodSource
    public void shouldCalculateCorrectBmi(double height, double weight, String expected) {
        Person person = new Person(height, weight);
        assertEquals(expected, person.getBMI());
    }

    private static Stream<Arguments> shouldCalculateCorrectBmi() {
        return Stream.of(
                Arguments.of(1.60, 35, "Very severely underweight"),
                Arguments.of(1.70, 45, "Severely underweight"),
                Arguments.of(1.75, 50, "Underweight"),
                Arguments.of(1.80, 65, "Normal (healthy weight)"),
                Arguments.of(1.75, 80, "Overweight"),
                Arguments.of(1.70, 95, "Obese Class I (Moderately obese)"),
                Arguments.of(1.65, 100, "Obese Class II (Severely obese)"),
                Arguments.of(1.70, 130, "Obese Class III (Very severely obese)"),
                Arguments.of(1.80, 150, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.75, 170, "Obese Class V (Super Obese)"),
                Arguments.of(1.70, 200, "Obese Class VI (Hyper Obese)")
        );
    }
}
