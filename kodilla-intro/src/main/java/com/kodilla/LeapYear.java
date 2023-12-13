package com.kodilla;

public class LeapYear {
    public static void main(String[] args) {
        int nextYear = 2024;

        System.out.println("Czy rok 2024 będzie rokiem przystępnym ?");

        if (nextYear%4==0 && nextYear%100!=0)  {
       System.out.println("Rok 2024 będzie rokiem przystępnym");
        } else {
            System.out.println("Rok 2024 NIE będzie rokiem przystępnym");

        }
    }
}
