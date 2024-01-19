package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;


import java.util.Arrays;
import java.util.Random;

public class CarsApplication {
    private static Random random = new Random();

    // w tablicy o lozowym rozmiarze
    public static void main(String[] args) {
        int arraySize = random.nextInt(15)+1;
        Car[] cars = new Car[arraySize];

        for (int i = 0; i < arraySize; i++){
            cars[i] = drawCar();
        }
        for (Car car : cars){
          CarUtils.describeCar(car);
        }
    }

    // która będzie tworzyła losowy samochód z losowo zwiększoną prędkością.
    public static Car drawCar() {
        int carNumber = random.nextInt(3);

        return switch (carNumber) {
            case 0 -> new Bmw(random.nextInt(200));
            case 1 -> new Opel(random.nextInt(190));
            case 2 -> new Ford(random.nextInt(170));
            default -> null;
        };
    }
}
