package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // obsługa nadpływających żadań request i generowanie response
//wewnatrz tej klasy umieszczone sa wszystkie metody
@RequestMapping("/books") // wskazuje jaki będzie adres url http://localhost:8080/books (port 8080 <- domyślnie aplikacja w spring)
class BookController {
    private final BookService bookService;

    //Java będzie wymagała przekazania takiego obiektu przez konstruktor.
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping // obsługa żądań http request wysyłanych do naszej aplikacji przy pomocy metpdy get
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping //mówi, że metoda addBook odpowiedzialna za obsługę żądań wysyłanych metodą POST protokołu http.
    public void addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);

        // @RequestBody mówi, że obiekt ten będzie przekazywany przez body żądania http request.
    }

    @DeleteMapping
    public void removeBook(@RequestBody BookDto bookDto) {
        bookService.removeBook(bookDto);
    }
}