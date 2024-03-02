package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

    public List<Order> getOrdersWithinDateRange(LocalDate startDate, LocalDate endDate) {
        List<Order> ordersWithinDateRange = new ArrayList<>();
        for (Order order : orderList) {
            LocalDate orderDate = order.getDate();
            if (orderDate.compareTo(startDate) >= 0 && orderDate.compareTo(endDate) <= 0) {
                ordersWithinDateRange.add(order);
            }
        }
        return ordersWithinDateRange;
    }

    public List<Order> getOrdersWithinValueRange(double minValue, double maxValue) {
        return orderList.stream()
                .filter(order -> order.getOrderValue() >= minValue && order.getOrderValue() <= maxValue)
                .collect(Collectors.toList()); //zbiera przefiltrowane zamówienia i umieszcza w liście

    }

    public int getOrderCount() {
        return orderList.size();
    }

    public double getTotalSumOfOrders() {
        return orderList.stream()
                .mapToDouble(Order::getOrderValue)
                .sum();
    }
}
