package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOfAisports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("Warsaw", true);
        airports.put("LasPalmas", false);
        return airports;
    }

    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if (getListOfAisports().containsKey(airport))
            return getListOfAisports().get(airport);
        throw new AirportNotFoundException();

    }
}


