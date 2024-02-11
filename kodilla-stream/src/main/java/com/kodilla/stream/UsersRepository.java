package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    // udostępnia metodę zwracającą kolekcje użytkownika

    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter white", 50, 7, "Bonuses"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Legal"));
        users.add(new User("Tuco Salamanca", 34, 116, "Legal"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "PowerOfAttorney"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Absences"));
        return users;
    }
}
