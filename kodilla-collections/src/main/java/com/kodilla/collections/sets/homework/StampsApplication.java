package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
Set<Stamp> stampList=new HashSet<>();
stampList.add(new Stamp("Official", 2.5, true));
stampList.add(new Stamp("Military", 2.7, false));
stampList.add(new Stamp("Charity", 3.0, true));
stampList.add(new Stamp("Personalized",4.5, false));
stampList.add(new Stamp("Surcharge", 2.3, true));
stampList.add(new Stamp("Surcharge", 2.3, true));

        System.out.println(stampList.size());
    }
}
