package com.kodilla.collections.lists.homework;


import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Bmw> bmwList = new ArrayList<>();
        bmwList.add(new Bmw(250));
        bmwList.add(new Bmw(230));
        bmwList.add(new Bmw(200));
        bmwList.add(new Bmw(190));
        bmwList.add(new Bmw(120));

        Bmw bmw = new Bmw(100);
        bmwList.add(bmw);

        bmwList.remove(2);
        bmwList.remove(bmw);

        System.out.println(bmwList.size());

        for (Car car : bmwList) {
            CarUtils.describeCar(car);

        }
    }
}
