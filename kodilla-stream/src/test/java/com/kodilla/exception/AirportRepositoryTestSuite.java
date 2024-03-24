package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTestSuite {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {

        AirportRepository airportRepository = new AirportRepository();
        boolean isWarsawAirportUse = airportRepository.isAirportInUse("Warsaw");
        assertTrue(isWarsawAirportUse);
    }

    @Test
    public void testIsAisportInUseWithException() {
        AirportRepository airportRepository=new AirportRepository();
        assertThrows(AirportNotFoundException.class, ()->airportRepository.isAirportInUse("Krakow"));
    }
}