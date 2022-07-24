package com.bookstore.GeekText.controller;

import com.bookstore.GeekText.model.Authors;
import com.bookstore.GeekText.model.Books;
import com.bookstore.GeekText.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AuthorRest {

    @Autowired
    private AuthorService authorService;

    public AuthorRest(AuthorService authorService){
        this.authorService = authorService;
    }

    @GetMapping("/get-authors")
    public List<Authors> getAuthors(){

        return authorService.findAll();

    }

    @PostMapping("/admin/add-author")
    public Authors addAuthor(@RequestBody Authors authors) {
        authorService.save(authors);
        return authors;

    }



}
