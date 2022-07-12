package com.bookstore.GeekText.store.controller;

import com.bookstore.GeekText.store.model.Books;
import com.bookstore.GeekText.store.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookRest {

    private BookService bookService;
    @Autowired
    public BookRest(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/get-all-books")
    public List<Books> getAllBooks(){

        return bookService.findAll();

    }
}
