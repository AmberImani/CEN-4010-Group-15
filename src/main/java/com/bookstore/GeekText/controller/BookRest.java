package com.bookstore.GeekText.controller;

import com.bookstore.GeekText.service.BookService;
import com.bookstore.GeekText.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRest {

    @Autowired
    private BookService bookService;

    public BookRest(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/get-all-books")
    public List<Books> getAllBooks(){

        return bookService.findAll();

    }

    @GetMapping("/get-book/{isbn}")
    public Books getBooksById(@PathVariable Long isbn) {

        Books books = bookService.findById(isbn);

        return books;

    }

    @GetMapping("/searchByAuthor/{authorId}")
    public List<Books> searchBooksByAuthor(@PathVariable Integer authorId){

        List<Books> books = bookService.searchBooksByAuthor(authorId);

        return books;
    }

    @PostMapping("/add-book")
    public Books addBook(@RequestBody Books books) {
        //System.out.println("ISBN number: " + books.getIsbn());
        bookService.save(books);
        return books;

    }

}
