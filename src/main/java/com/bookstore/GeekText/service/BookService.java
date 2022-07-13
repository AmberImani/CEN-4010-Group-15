package com.bookstore.GeekText.service;

import java.util.List;

import com.bookstore.GeekText.model.Books;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    public List<Books> findAll();

    public Books findById(int theId);

    public void save(Books theEmployee);

    public void deleteById(int theId);

}
