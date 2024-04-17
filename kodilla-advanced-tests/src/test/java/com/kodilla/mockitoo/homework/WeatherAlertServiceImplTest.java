package com.kodilla.mockitoo.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class WeatherAlertServiceImplTest {

    private WeatherAlertServiceImpl alertService;
    private Person person1;
    private Person person2;
    private Location location1;
    private Location location2;

    @BeforeEach
    public void setUp() {
        alertService = new WeatherAlertServiceImpl();
        person1 = Mockito.mock(Person.class);
        person2 = Mockito.mock(Person.class);
        location1 = new Location("City A");
        location2 = new Location("City B");
    }


    @Test
    public void subscribingPersonShouldReceiveAlert() {
        alertService.subscribe(person1, location1);
        alertService.sendAlertToLocation("Dangerous storm approaching", location1);
        verify(person1).getEmail();
    }

    @Test
    public void unsubscribingPersonShouldNotReceiveAlert() {
        alertService.subscribe(person1, location1);
        alertService.unsubscribe(person1, location1);
        alertService.sendAlertToLocation("Dangerous storm approaching", location1);
        verify(person1, never()).getEmail();
    }

    @Test
    public void alertShouldBeSentToAllSubscribedPersons() {
        alertService.subscribe(person1, location1);
        alertService.subscribe(person2, location1);
        alertService.sendAlertToLocation("Dangerous storm approaching", location1);
        verify(person1).getEmail();
        verify(person2).getEmail();
    }

    @Test
    public void shouldSendOnlyOneAlertToDuplicateSubscribers() {
        alertService.subscribe(person1, location1);
        alertService.subscribe(person1, location1);
        alertService.subscribe(person1, location1);
        alertService.sendAlertToLocation("Dangerous storm approaching", location1);
        verify(person1, times(1)).getEmail();
    }

    @Test
    public void unsubscribingPersonFromAllLocationsShouldWork() {
        alertService.subscribe(person1, location1);
        alertService.subscribe(person1, location2);
        alertService.unsubscribeAll(person1);
        alertService.sendAlertToLocation("Dangerous storm approaching", location1);
        alertService.sendAlertToLocation("Dangerous storm approaching", location2);
        verify(person1, never()).getEmail();
    }

    @Test
    public void sendingGeneralAlertShouldReachAllSubscribedPersons() {
        alertService.subscribe(person1, location1);
        alertService.subscribe(person2, location2);
        alertService.sendGeneralAlert("Heavy rainfall expected");
        verify(person1).getEmail();
        verify(person2).getEmail();
    }

    @Test
    public void removingLocationShouldUnsubscribeAllPersons() {
        alertService.subscribe(person1, location1);
        alertService.subscribe(person2, location1);
        alertService.removeLocation(location1);
        alertService.sendAlertToLocation("Dangerous storm approaching", location1);
        verify(person1, never()).getEmail();
        verify(person2, never()).getEmail();
    }
}