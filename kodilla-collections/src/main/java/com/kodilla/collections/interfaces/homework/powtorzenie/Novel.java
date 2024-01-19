package com.kodilla.collections.interfaces.homework.powtorzenie;

public class Novel implements Book {

    int pages;

    public Novel(int pages) {
        this.pages = pages;
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public void increasePages() {
        pages += 50;
    }

    @Override
    public void decreasePages() {
        pages -= 20;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "pages=" + pages +
                '}';
    }
}
