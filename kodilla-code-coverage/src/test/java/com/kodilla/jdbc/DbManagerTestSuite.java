package com.kodilla.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        // Given
        String countQuery = "SELECT COUNT(*) AS total FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        rs.next();
        int initialCount = rs.getInt("total");
        rs.close();

        // When
        insertUsers();

        // Then
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery("SELECT * FROM USERS");
        int finalCount = getResultsCount(rs);
        rs.close();
        statement.close();

        int expectedCount = initialCount + 5;
        assertEquals(expectedCount, finalCount);
    }

    private void insertUsers() throws SQLException {
        Statement statement = dbManager.getConnection().createStatement();
        for (AbstractMap.SimpleEntry<String, String> user : getUsers()) {
            String firstName = user.getKey();
            String lastName = user.getValue();
            String sql = String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')", firstName, lastName);
            statement.executeUpdate(sql);
        }
        statement.close();
    }

    private List<AbstractMap.SimpleEntry<String, String>> getUsers() {
        return List.of(
                new AbstractMap.SimpleEntry<>("Zara", "Ali"),
                new AbstractMap.SimpleEntry<>("Otman", "Use"),
                new AbstractMap.SimpleEntry<>("Mark", "Boq"),
                new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
                new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
        );
    }

    private int getResultsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count++;
        }
        return count;
    }


    @Test
    void testSelectUsersAndPosts() throws SQLException {
        List<String> usersWithTwoOrMorePosts = getUsersWithTwoOrMorePosts();
        assertEquals(2, usersWithTwoOrMorePosts.size());
    }

    private List<String> getUsersWithTwoOrMorePosts() throws SQLException {
        String sqlQuery = "SELECT u.FIRSTNAME, u.LASTNAME " +
                "FROM USERS u " +
                "JOIN POSTS p ON u.ID = p.USER_ID " +
                "GROUP BY u.ID " +
                "HAVING COUNT(p.ID) >= 2";

        List<String> usersWithTwoOrMorePosts = new ArrayList<>();

        try (Statement statement = dbManager.getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {

            while (resultSet.next()) {
                String firstName = resultSet.getString("FIRSTNAME");
                String lastName = resultSet.getString("LASTNAME");
                usersWithTwoOrMorePosts.add(firstName + " " + lastName);
            }
        }

        return usersWithTwoOrMorePosts;
    }
}