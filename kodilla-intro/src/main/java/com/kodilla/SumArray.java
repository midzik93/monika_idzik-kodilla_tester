package com.kodilla;

public class SumArray {
    public static int sumaElementow(int[] tablica) {
        int suma = 0;

        for (int element : tablica) {
            suma += element;
        }

        return suma;
    }

    public static void main(String[] args) {
        int[] mojaTablica = {5, 10, 15, 20, 25};

        int wynik = sumaElementow(mojaTablica);
        System.out.println("Suma wszystkich elementów tablicy: " + wynik);
    }
}
