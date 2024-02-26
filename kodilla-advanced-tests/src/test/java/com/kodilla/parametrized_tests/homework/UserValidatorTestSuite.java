package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"1023adm", "AAa", "_1.wera", "a-9.monika", ".2Bartek-123"})
    public void shouldReturnTrueIfUsernameMatchesRegex(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"10", "a", "_1", "A-", ".2", "2", "-"})
    public void shouldReturnFalseIfUsernameNotMatchesRegex(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"karo@one.pl", "user!name@example.com", "jane.smith@example!net", "jane.smith@example.", "jane.smith@example .net", "2", "b@c.com"})
    public void shouldReturnFalseIfMaileNotMatchesRegex(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"john.doe@example.com", "jane.smith@example.net", "bob-123@example.com", "jane.smith@example99.net", "john.doe@sub.example.com", "a_very_long_username123456789@example.com"})
    public void shouldReturnTrueIfMailMatchesRegex(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);

    }
}
