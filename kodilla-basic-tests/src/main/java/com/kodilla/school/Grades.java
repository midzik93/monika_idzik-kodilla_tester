package com.kodilla.school;

public class Grades {
    private int[] values;
    private int size;

    public Grades() {
        this.values = new int[0];
        this.size = 0;
    }

    //metoda dodająca oceny do tablicy
    public void add(int value) {
        this.size++; //zwiększamy wartość size o 1
        // pusta tablica z elementem o jeden większym niż poprzednia tablica
        int[] newTab = new int[this.size]; //tworzymy pustą tablice z nowym rozmiarem

        //kopiowanie wszystkich elementów i na końcu dodać nową wartość
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value; // przypisanie nowej wartości do ostatniego elementu
        this.values = newTab; // przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie.
    }


    // zwraca tablice ocen values umozliwiając dostęp do ocen z zewnątrz klasy
    public int[] getValues() {
        return values;
    }

    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum / this.values.length;
    }
}

