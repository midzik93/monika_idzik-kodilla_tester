package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @Test
    void shouldBeLeapYearIfDivisibleBy400() {
        Year year = new Year(1600);
        assertTrue(year.isLeap());
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy4ButNotBy100() {
        Year year = new Year(2020);
        assertTrue(year.isLeap());
    }

    @Test
    void shouldNotBeLeapYearIfDivisibleBy100ButNotBy400() {
        Year year = new Year(1800);
        assertFalse(year.isLeap());
    }

    @Test
   void shouldNotBeLeapYearIfNotDivisibleBy4() {
        Year year = new Year(2019);
        assertFalse(year.isLeap());
    }
}