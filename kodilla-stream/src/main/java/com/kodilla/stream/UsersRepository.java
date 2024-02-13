package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    // udostępnia metodę zwracającą kolekcje użytkownika

    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter white",39 , 7, "Bonuses"));
        users.add(new User("Jessie Pinkman", 40, 40, "Legal"));
        users.add(new User("Tuco Salamanca", 41, 14, "Legal"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 34, 2, "PowerOfAttorney"));
        users.add(new User("Mike Ehrmantraut", 23, 0, "Absences"));
        return users;
    }
}
