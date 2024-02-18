package com.kodilla.exception.homework.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouse {

    private List<Order> ordersList;

    public Warehouse() {
        this.ordersList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        ordersList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> foundOrder = ordersList.stream()
                .filter(n -> n.getNumber().equals(number))
                .findAny();

        if (foundOrder.isPresent()) {
            return foundOrder.get();
        } else {
            throw new OrderDoesntExistException();
        }
    }
}
