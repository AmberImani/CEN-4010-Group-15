package com.bookstore.GeekText.service;

import java.util.List;
import java.util.Optional;

import com.bookstore.GeekText.model.Books;
import com.bookstore.GeekText.repository.MySqlRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookServiceImpl implements BookService {

    private MySqlRepository mySqlRepository;

    public BookServiceImpl(MySqlRepository mySqlRepository) {
        this.mySqlRepository = mySqlRepository;
    }

    @Override
    @Transactional
    public List<Books> findAll() {
        return mySqlRepository.findAll();
    }

    @Override
    public Books findById(int isbn) {
        Optional<Books> result = mySqlRepository.findById(isbn);

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
        mySqlRepository.save(theEmployee);

    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        mySqlRepository.deleteById(theId);

    }

}