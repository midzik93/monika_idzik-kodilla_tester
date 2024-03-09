package com.kodilla.spring.basic.spring_scopes.homeworkk;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    private LocalTime currentTime;

    public Clock() {
        this.currentTime = LocalTime.now();
    }

    public LocalTime getCurrnetTime() {
        return currentTime;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "currentTime=" + currentTime +
                '}';
    }
}
