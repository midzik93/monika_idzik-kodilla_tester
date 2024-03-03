package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("London", "Paris"));
        flights.add(new Flight("Paris", "Berlin"));
        flights.add(new Flight("Berlin", "Rome"));
        flights.add(new Flight("Rome", "Paris"));
        flights.add(new Flight("Madrid", "New York"));
        return flights;
    }
}