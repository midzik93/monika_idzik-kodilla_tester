package com.kodilla.parametrized_tests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class StringValidatorTestSuite {

    StringValidator stringValidator = new StringValidator();

    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void shouldReturnTrueIfStrinsIsEmpty(String text){
        assertTrue(stringValidator.isBlank(text));
    }

    //null nie może być przekazany jako string więc...

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text){
        assertTrue(stringValidator.isBlank(text));
    }


//    @Test
//    public void shouldReturnFalseIfStrinsIsNotEmpty(){
//        boolean result = stringValidator.isBlank("Test");
//        assertFalse(result);
//    }
//
//    @Test
//    public void shouldReturnTrueIfStrinsIsEmpty(){
//        boolean result = stringValidator.isBlank("");
//        assertTrue(result);
//    }
//    @Test
//    public void shouldReturnTrueIfStringHasOnlySpaces(){
//        boolean result = stringValidator.isBlank(" ");
//        assertTrue(result);
//    }
//    @Test
//    public void shouldReturnTrueIfStringIsNull(){
//        boolean result = stringValidator.isBlank(null);
//        assertTrue(result);
//    }

}
