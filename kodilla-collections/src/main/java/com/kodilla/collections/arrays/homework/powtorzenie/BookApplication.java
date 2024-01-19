package com.kodilla.collections.arrays.homework.powtorzenie;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.powtorzenie.Biography;
import com.kodilla.collections.interfaces.homework.powtorzenie.Book;
import com.kodilla.collections.interfaces.homework.powtorzenie.Novel;
import com.kodilla.collections.interfaces.homework.powtorzenie.Textbook;

import java.util.Random;

public class BookApplication {
    private static Random random = new Random();

    public static void main(String[] args) {
        int arrayNumber = random.nextInt(15) + 1;
        Book[] books = new Book[arrayNumber];

        for (int i = 0; i < arrayNumber; i++) {
            books[i] = drawBook();
        }
        for (Book book : books) {
            BookUtils.describeBook(book);
        }
    }

    public static Book drawBook() {
        int bookNumber = random.nextInt(3);

        return switch (bookNumber) {
            case 0 -> new Biography(random.nextInt(200));
            case 1 -> new Novel(random.nextInt(170));
            case 2 -> new Textbook(random.nextInt(150));
            default -> null;
        };
    }
}
