package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // tzn, że klasa jest beanem czyli obiekt tej klasy ma zostać utworzony w Springu
public class BookService {
    private List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks() {
        return books;
    }

    public void addBook(BookDto bookDto) {
        books.add(bookDto);
    }

    public void removeBook(BookDto bookDto) {
        books.remove(bookDto);
    }
}
