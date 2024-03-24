package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarConfigurationTestSuite {

    @Test
    public void shouldReturnSuvInWinter() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car = context.getBean(Car.class, LocalDate.of(2023, 12, 15));
        assertEquals("SUV", car.getCarType());
    }

    @Test
    public void shouldReturnSedanInSpring() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car = context.getBean(Car.class, LocalDate.of(2024, 5, 15));
        assertEquals("Sedan", car.getCarType());
    }

    @Test
    public void shouldReturnCabrioInSummer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car = context.getBean(Car.class, LocalDate.of(2024, 7, 15));
        assertEquals("Cabrio", car.getCarType());
    }

    @Test
    public void shouldReturnSedanInAutumn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car = context.getBean(Car.class, LocalDate.of(2024, 9, 15));
        assertEquals("Sedan", car.getCarType());
    }

    @Test
    public void shouldReturnSedanInSpringWithHeadlightsOff() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);
        Car car = context.getBean(Car.class, LocalDate.of(2023, 4, 15));
        boolean headlightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(10, 0));
        assertEquals("Sedan", car.getCarType());
        assertFalse(headlightsTurnedOn);
    }

    @Test
    public void shouldReturnSedanInAutumnWithHeadlightsOff() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);
        Car car = context.getBean(Car.class, LocalDate.of(2023, 10, 15));
        // When
        boolean headlightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(18, 0));
        // Then
        assertEquals("Sedan", car.getCarType());
        assertFalse(headlightsTurnedOn);
    }

    @Test
    public void shouldReturnSedanInSpringWithHeadlightsOffAt6Am() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);
        Car car = context.getBean(Car.class, LocalDate.of(2023, 4, 15));
        boolean headlightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(6, 0));
        assertEquals("Sedan", car.getCarType());
        assertFalse(headlightsTurnedOn);
    }

    @Test
    public void shouldReturnSedanInAutumnWithHeadlightsOnAt20Pm() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);
        Car car = context.getBean(Car.class, LocalDate.of(2023, 10, 15));
        boolean headlightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(20, 0));
        assertEquals("Sedan", car.getCarType());
        assertTrue(headlightsTurnedOn);
    }
}