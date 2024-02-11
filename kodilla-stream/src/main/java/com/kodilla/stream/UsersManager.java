package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> listOfLegalGroup = filterLegalGroupUsername();
        System.out.println(listOfLegalGroup);
    }

    public static List<String> filterLegalGroupUsername() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Legal"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

//        UsersRepository.getUsersList()         //wywołana metoda która zwraca arrayList obiektów typu User
//                .stream()   //uruchamiamy strumień przez który przepływaja obiekty typu user
//                .filter(user->user.getGroup().equals("Legal"))
//                .map(UsersManager::getUserName)     //pierwsza operacja transformująca. Metoda map klasy Stream
//                //przez tą funkcje (wyrażenie lambda) przepuszczamy obiekty. Do zmiennej user będą wpadać kolejne obiekty klasy User
//                .forEach(username -> System.out.println(username)); // wyrażenie terminalne


    public static String getUserName(User user) {
        return user.getUserName();
    }

    public static List<User> getUserOlderThan(int age) {
        List<User> ages = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
        return ages;

    }

    // lista użytkwników których liczba poastów jest większa niż 50
    public static List<User> getUserWithPostsMoreThan(int numberOfPost) {
        List<User> posts = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > numberOfPost)
                .collect(Collectors.toList());
        return posts;
    }
}
