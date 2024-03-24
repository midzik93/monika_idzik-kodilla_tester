package com.kodilla.spring.basic.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class AnimalFactory { //klasa która tworzy obiekty
    @Bean
    public Dog createDog() { //metoda która ma tworzyć obiekt
        return new Dog();
    }

    @Bean // zwracany jest jeden z obiektór o konkretnym typie ogólnym animal
    public Animal randomAnimal() {
        Animal animal;
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        if (chosen == 0) {
            animal = new Dog();
        } else if (chosen == 1) {
            animal = new Cat();
        } else {
            animal = new Duck();
        }
        return animal;

    }
}
