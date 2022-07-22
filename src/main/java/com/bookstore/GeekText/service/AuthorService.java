package com.bookstore.GeekText.service;

import com.bookstore.GeekText.model.Authors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface AuthorService {

    @Autowired
    public void save (Authors authors);

}
