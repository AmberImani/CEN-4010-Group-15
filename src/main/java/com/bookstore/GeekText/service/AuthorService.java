package com.bookstore.GeekText.service;

import com.bookstore.GeekText.controller.AuthorRest;
import com.bookstore.GeekText.model.Authors;
import com.bookstore.GeekText.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {

    @Autowired
    public void save (Authors admin);

    public List<Authors> findAll();

}
