package com.kodilla;

public class Loop3 {
    public static void main(String[] args) {
        String[] languages = new String[] {"Spanish", "English", "German", "Greek", "Polish"};
        for (int i=languages.length - 1; i >= 0 ;i--) {
            System.out.println(languages[i]);
        }
    }
}
