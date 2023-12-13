package com.kodilla;

public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5];
        animals[0] = "lew";
        animals[1] = "tygrys";
        animals[2] = "kot";
        animals[3] = "pantera";
        animals[4] = "gepard";

        String animal = animals[2];    //pobieramy 4 element
        System.out.println("Zwierzę domowe to "+animal); //wyświetlamy 4 element

      int numberOfElements = animals.length;  //długość tablicy
      System.out.println("Moja tablica zawiera " +numberOfElements+ " elementów");
    }
}