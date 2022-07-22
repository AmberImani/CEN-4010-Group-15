package com.bookstore.GeekText.controller;

import com.bookstore.GeekText.model.Authors;
import com.bookstore.GeekText.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class AuthorRest {

    private AuthorService authorService;
    private Authors authors;

    public AuthorRest(AuthorService authorService){
        this.authorService = authorService;
    }

    @PostMapping("/create-author")
    public Authors createAuthor(RequestBody Authors) {
        authorService.save(authors);
        return authors;

    }



}
