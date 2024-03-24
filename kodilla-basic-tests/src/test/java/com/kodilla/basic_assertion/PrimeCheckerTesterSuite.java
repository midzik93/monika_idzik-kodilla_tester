package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTesterSuite {

    private PrimeChecker checker = new PrimeChecker();
    private static int count =0;
    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        boolean result = checker.isPrime(14);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
        //wpisana liczba na starcie ma wartość true
        //assertfalse oczuje false (sprawcza czy jest false czy true)

    }
    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber(){
        boolean result = checker.isPrime(13);
        count++;
        System.out.println("Test number " + count);
        assertTrue(result);
    }
    @Test
    public void shouldReturnTrueWhenPassingTwo(){
        boolean result = checker.isPrime(2);
        count++;
        System.out.println("Test number " + count);
        assertTrue(result);
    }
    @Test
    public void shouldReturnFalseWhenPassingOne() {
        boolean result = checker.isPrime(1);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        boolean result = checker.isPrime(0);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        boolean result = checker.isPrime(-6);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }
}
//    przekazujemy liczbę 14, oczekujemy false,
//        przekazujemy liczbę 13, oczekujemy true,
//        przekazujemy cyfrę 2, oczekujemy true,
//        przekazujemy cyfrę 1, oczekujemy false,
//        przekazujemy cyfrę 0, oczekujemy false,
//        przekazujemy cyfrę -6, oczekujemy false.