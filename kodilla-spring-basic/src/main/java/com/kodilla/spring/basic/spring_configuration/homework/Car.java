package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.cglib.core.Local;

import java.time.LocalTime;

public interface Car {

     boolean hasHeadlightsTurnedOn(LocalTime time);
     String getCarType();

}
