package com.kodilla.exception.homework.homework2;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("ORDER1"));
        warehouse.addOrder(new Order("ORDER2"));
        warehouse.addOrder(new Order("ORDER3"));
        warehouse.addOrder(new Order("ORDER4"));


        //nieistniejące zamówienie
        String orderToFind = "ORDER0123";
        try {
            Order foundOrder = warehouse.getOrder(orderToFind);
            System.out.println("This is your number order " + orderToFind);
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry this " + orderToFind + " doean't exist");
        }

    }
}
