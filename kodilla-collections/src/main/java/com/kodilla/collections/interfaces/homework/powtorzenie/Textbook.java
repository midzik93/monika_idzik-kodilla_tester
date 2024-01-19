package com.kodilla.collections.interfaces.homework.powtorzenie;

public class Textbook implements Book {

    int pages;

    public Textbook(int pages) {
        this.pages = pages;
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public void increasePages() {
        pages += 10;

    }

    @Override
    public void decreasePages() {
        pages -= 5;

    }
    @Override
    public String toString() {
        return "Textbook{" +
                "pages=" + pages +
                '}';
    }
}
