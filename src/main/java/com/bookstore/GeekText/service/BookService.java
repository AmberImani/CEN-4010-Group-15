package com.bookstore.GeekText.service;

import java.util.List;

import com.bookstore.GeekText.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    @Autowired
    public List<Books> findAll();

    public Books findById(Long isbn);

    public void save(Books theEmployee);

    public void deleteById(Long theId);

}
