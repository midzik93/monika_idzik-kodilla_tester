package com.kodilla.collections.adv.exercises.homework;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
  private List<Flight> flights;

  public FlightFinder(List<Flight> flights) {
    this.flights = flights;
  }

  public List<Flight> findFlightsFrom(String departure){
return flights.stream()
        .filter(flight -> flight.getDeparture().equals(departure))
        .collect(Collectors.toList());
  }
    public List<Flight> findFlightsTo(String arrival){
    return flights.stream()
            .filter(flight -> flight.getArrival().equals(arrival))
            .collect(Collectors.toList());

    }
}
