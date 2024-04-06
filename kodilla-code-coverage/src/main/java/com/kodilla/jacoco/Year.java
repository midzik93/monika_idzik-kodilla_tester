package com.kodilla.jacoco;

public class Year {
    private final int yearValue;

    public Year(int year) {
        this.yearValue = year;
    }

    public boolean isLeap() {
        if (this.yearValue % 4 == 0) {
            if (this.yearValue % 100 == 0) {
                return this.yearValue % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}