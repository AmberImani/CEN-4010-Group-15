package com.bookstore.GeekText.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Group 15: Welcome to GeekText Bookstore";
    }

}
