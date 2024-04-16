package com.kodilla.mockitoo.homework;


public interface WeatherAlertService {

    void subscribe (Person person, Location location);
    void unsubscribe (Person person, Location location);
    void unsubscribeAll (Person person);
    void sendAlertToLocation(String message, Location location);
    void sendGeneralAlert (String message);
    void removeLocation(Location location);

}
