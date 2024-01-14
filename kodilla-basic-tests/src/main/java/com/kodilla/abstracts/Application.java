package com.kodilla.abstracts;

import java.nio.file.attribute.DosFileAttributes;

public class Application {
    public static void main(String[] args) {

       Animal dog=new Dog();   //Animal lub Dog (nie ma znaczenia) tzw polimorfizm
                                //możemy  wywoałać wszystkie metody zdefiniowe w klasie Animal
                                // nie możemy wywołać metod zdefiniowanych tylko w klasie Dog


       AnimalProcessor animalProcessor=new AnimalProcessor();
        animalProcessor.process(dog);
    }
}
