package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.homework.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorSuiteTest {
    @Test
    public void shouldAddNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(2.6, 7.5);
        Assertions.assertEquals(10.1, result);
    }

    @Test
    public void shouldSubstractNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(7.5, 2.5);
        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void shouldMultiplyNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(2.5, 2.5);
        Assertions.assertEquals(6.25, result);
    }

    @Test
    public void shouldDivideNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(2.5, 2.5);
        Assertions.assertEquals(1, result);
    }
}
