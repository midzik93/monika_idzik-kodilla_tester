package com.kodilla.collections.interfaces.homework.powtorzenie;

public class Biography implements Book {

    int pages;

    public Biography(int pages) {
        this.pages = pages;
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public void increasePages() {
        pages += 30;
    }

    @Override
    public void decreasePages() {
        pages -= 10;
    }

    @Override
    public String toString() {
        return "Biography{" +
                "pages=" + pages +
                '}';
    }
}
