package com.library.next.controllers;

import com.library.next.model.Book;
import com.library.next.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("books")
public class BooksController {
    private BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("{id}")        //GET http://localhost:8080/books/23
    public Book getBookInfo(@PathVariable Long id) {
        return bookService.findBook(id);
    }

    @PostMapping        //POST http://localhost:8080/books
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

/*    @PutMapping        //PUT http://localhost:8080/books
    public Book putBook(@RequestBody Book book) {
        return bookService.editBook(book);
    }

    @DeleteMapping
    public Book deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }*/
}
