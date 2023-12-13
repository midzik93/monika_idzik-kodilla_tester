package com.kodilla;

public class Loops2 {
    public static void main(String[] args){
        String[] names= new String[] {"Zygfryd", "Gwizdor", "Florentyna"};
        int numberOfNames= names.length;
        for (int i=0; i < numberOfNames; i++) {   //mogło być też być 1<name.length;
            System.out.println(names[i]);
        }
    }
}
