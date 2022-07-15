package com.bookstore.GeekText.service;

import java.util.List;
import java.util.Optional;

import com.bookstore.GeekText.model.Books;
import com.bookstore.GeekText.repository.MyBookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookServiceImpl implements BookService {

    private MyBookRepository myBookRepository;

    public BookServiceImpl(MyBookRepository myBookRepository) {
        this.myBookRepository = myBookRepository;
    }

    @Override
    @Transactional
    public List<Books> findAll() {
        return myBookRepository.findAll();
    }

    @Override
    public Books findById(int isbn) {
        Optional<Books> result = myBookRepository.findById(isbn);

        Books books = null;

        if (result.isPresent())
            books = result.get();
        else
            throw new RuntimeException("Did not find Book ISBN :" + isbn);

        return books;
    }

    @Override
    @Transactional
    public void save(Books theEmployee) {
        myBookRepository.save(theEmployee);

    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        myBookRepository.deleteById(theId);

    }

}