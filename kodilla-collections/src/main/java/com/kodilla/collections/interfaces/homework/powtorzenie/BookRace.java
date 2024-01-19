package com.kodilla.collections.interfaces.homework.powtorzenie;

public class BookRace {
    public static void main(String[] args) {
        Biography biography = new Biography(50);
        System.out.println("The biography has " + biography.getPages() + " pages");
        readBook(biography);


        Novel novel = new Novel(70);
        System.out.println("The novel has " + novel.getPages() + " pages");
        readBook(novel);

        Textbook textbook = new Textbook(20);
        System.out.println("The textbook has " + textbook.getPages() + " pages");
        readBook(textbook);
    }

    public static void readBook(Book book) {
        for (int i = 0; i < 3; i++) {
            book.decreasePages();
        }
        for (int i = 0; i < 2; i++) {
            book.increasePages();
        }
        System.out.println("Book pages : " + book.getPages());
    }

}