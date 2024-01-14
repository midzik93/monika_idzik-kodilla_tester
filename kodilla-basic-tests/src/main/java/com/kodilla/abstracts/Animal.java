package com.kodilla.abstracts;

public abstract class Animal {
    private int numberOfLegs;
    public Animal(int numberOfLegs){
        this.numberOfLegs=numberOfLegs;

    }
    public int getNumberOfLegs(){
        return numberOfLegs;
    }

    //metoda abstrakcyjna będzie wyświetlać głos wydawany przez dane zwierzę
    //metoda ta wymusza żeby każda klasa dziedzicząca dodała swoją implementacje
    //każe zwierzę w inny sposób wydaje dźwięk
    public abstract void giveVoice(); //przy metodzie abstract brak zmiennej (brak klamr)
}
