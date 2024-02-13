package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.sql.SQLOutput;
import java.util.List;

public class ForumStats {

    public static double averagePostsForUserOver40(List<User> users) {
        double over40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return over40;
    }

    public static double averagePostsForUserUnder40(List<User> users) {

        double under40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return under40;
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();
        System.out.println(averagePostsForUserOver40(users));
        System.out.println(averagePostsForUserUnder40(users));

    }
}
