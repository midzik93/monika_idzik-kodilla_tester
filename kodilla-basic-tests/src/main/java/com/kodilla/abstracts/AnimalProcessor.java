package com.kodilla.abstracts;

public class AnimalProcessor {


    public void process(Animal animal){    //metoda przyjmuje ogólny typ
        System.out.println("Animal has " +animal.getNumberOfLegs() + " legs");
        animal.giveVoice();
    }
}
