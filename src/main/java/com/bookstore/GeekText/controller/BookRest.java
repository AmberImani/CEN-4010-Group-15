package com.bookstore.GeekText.controller;

import com.bookstore.GeekText.service.BookService;
import com.bookstore.GeekText.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
