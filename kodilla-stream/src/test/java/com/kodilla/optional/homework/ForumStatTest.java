package com.kodilla.optional.homework;

import com.kodilla.stream.UsersRepository;
import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatTest {
    @Test
    public void testAveragePostsForUserOver40() {
        UsersRepository.getUsersList();
        double average = ForumStats.averagePostsForUserOver40(UsersRepository.getUsersList());
        assertEquals(18, average);
    }

    @Test
    public void testAveragePostsForUserUnder40() {
        UsersRepository.getUsersList();
        double average2 = ForumStats.averagePostsForUserUnder40(UsersRepository.getUsersList());
        assertEquals(3, average2);
    }

}
