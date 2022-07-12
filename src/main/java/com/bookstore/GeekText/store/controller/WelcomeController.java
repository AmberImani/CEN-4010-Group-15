package com.bookstore.GeekText.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class WelcomeController {

    @RequestMapping
    public String welcome(){
        return "Group 15: Welcome to GeekText Bookstore";
    }

}
