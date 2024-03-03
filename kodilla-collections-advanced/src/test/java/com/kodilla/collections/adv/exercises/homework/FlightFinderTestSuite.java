package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void shouldFindFlightFrom() {
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);
        List<Flight> flightsFromParis = flightFinder.findFlightsFrom("Paris");
        assertEquals(1, flightsFromParis.size());
        assertEquals("Paris", flightsFromParis.get(0).getDeparture());
    }

    @Test
    public void shouldFindFlightTo() {
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);
        List<Flight> flightToParis = flightFinder.findFlightsTo("Paris");
        assertEquals(2, flightToParis.size());
        assertEquals("Paris", flightToParis.get(1).getArrival());

    }
}
