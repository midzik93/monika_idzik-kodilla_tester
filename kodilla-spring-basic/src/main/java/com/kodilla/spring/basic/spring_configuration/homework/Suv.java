package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;

public class Suv implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        int hour = time.getHour();
        return hour >= 20 || hour < 6;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
