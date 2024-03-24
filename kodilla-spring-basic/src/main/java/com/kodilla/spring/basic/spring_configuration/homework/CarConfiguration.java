package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

@Configuration
public class CarConfiguration {

    @Bean("car")
    @Scope("prototype")
    public Car getCar(LocalDate date) {
        int month = date.getMonthValue();
        if (month >= 6 && month <= 8) {
            return new Cabrio();
        } else if (month >= 12 || month <= 2) {
            return new Suv();
        } else {
            return new Sedan();
        }
    }
}