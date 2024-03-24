package com.kodilla.collections.adv.immutable;

public class Book {

    protected String author;
    protected String title;  //proctected -> prywatne z zastrzezeniem. Dostęp do nic mają klasy dziedziczace po Book oraz inne klasy w obrępie pakietu

    public Book (String author, String title) {
        this.author = author;
        this.title=title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
