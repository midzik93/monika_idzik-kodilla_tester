package com.kodilla.mockitoo.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class WeatherAlertServiceImpl implements WeatherAlertService {
    private Map<Location, Set<Person>> locationSubscriptions = new HashMap<>();

    @Override
    public void subscribe(Person person, Location location) {
        if (!locationSubscriptions.containsKey(location)) {
            locationSubscriptions.put(location, new HashSet<>());
        }
        locationSubscriptions.get(location).add(person);
    }

    @Override
    public void unsubscribe(Person person, Location location) {
        if (locationSubscriptions.containsKey(location)) {
            locationSubscriptions.get(location).remove(person);
            if (locationSubscriptions.get(location).isEmpty()) {
                locationSubscriptions.remove(location);
            }
        }
    }

    @Override
    public void unsubscribeAll(Person person) {
        for (Location location : locationSubscriptions.keySet()) {
            locationSubscriptions.get(location).remove(person);
        }
    }

    @Override
    public void sendAlertToLocation(String message, Location location) {
        if (locationSubscriptions.containsKey(location)) {
            for (Person person : locationSubscriptions.get(location)) {
                System.out.println("Sending alert to " + person.getEmail() + ": " + message);
            }
        }
    }

    @Override
    public void sendGeneralAlert(String message) {
        for (Set<Person> subscribers : locationSubscriptions.values()) {
            for (Person person : subscribers) {
                System.out.println("Sending general alert to " + person.getEmail() + ": " + message);
            }
        }

    }

    @Override
    public void removeLocation(Location location) {
        locationSubscriptions.remove(location);
    }
}
