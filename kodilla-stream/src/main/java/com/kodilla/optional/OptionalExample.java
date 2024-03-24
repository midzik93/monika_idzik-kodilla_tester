package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test");
        Optional<User> optionalUser = Optional.ofNullable(user);


        optionalUser.ifPresent(u -> System.out.println(u.getUserName()));


        // kod tworzy obiekt Optional dla obiektu użytkownika, a następnie sprawdza, czy obiekt użytkownika jest obecny.
        // Jeśli nie, używa pustego obiektu User jako wartości domyślnej. Następnie pobiera nazwę użytkownika i ją wyświetla.
        // Dzięki użyciu Optional można łatwo obsłużyć przypadki, gdy obiekt może być nullem.

    }
}
