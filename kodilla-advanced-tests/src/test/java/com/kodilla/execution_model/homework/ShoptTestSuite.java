package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShoptTestSuite {

    Shop shop = new Shop();

    Order order1 = new Order(195.40, "2024-02-02", "kolczak");
    Order order2 = new Order(1350.50, "2024-01-02", "mmazurek1");
    Order order3 = new Order(3270.60, "2023-02-15", "ekromlowska");
    Order order4 = new Order(900.90, "2023-12-13", "jkaczor");


    @BeforeEach
    public void addOrders() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
    }

    @Test
    public void shouldAddOrders() {  //1 i 8
        assertEquals(4, shop.getOrderCount());
    }

    @Test
    public void getOrderDetails() {
        assertEquals(195.40, order1.getOrderValue(),0.01);
        assertEquals(LocalDate.of(2024, 1, 2), order2.getDate());
        assertEquals("ekromlowska", order3.getLogin());
    }

    @Test
    public void shouldReturnNullWhenIndexExceedSizeOfList() {

        int result = shop.getOrderCount();
        assertNotNull(result);
    }

    @Test
    public void shouldReturnOrderWithinDateRange() {
        LocalDate startDate = LocalDate.parse("2024-01-01");
        LocalDate endDate = LocalDate.parse("2024-03-07");

        List<Order> ordersWithinDateRange = shop.getOrdersWithinDateRange(startDate, endDate);
        assertEquals(2, ordersWithinDateRange.size());
    }

    @Test
    public void shouldReturnOrdersWithinValueRange() {
        List<Order> ordersWithinValueRange = shop.getOrdersWithinValueRange(1000.00, 3000.00);
        assertEquals(1, ordersWithinValueRange.size());
    }

    @Test
    public void shouldReturnOrderCount() {
        assertEquals(4, shop.getOrderCount());
    }

    @Test
    public void shouldGetSumTheOrders() {
        assertEquals(5717.40, shop.getTotalSumOfOrders());
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessag() {
        System.out.println("Finish testing");
    }
}
