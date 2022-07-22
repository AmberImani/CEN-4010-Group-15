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
    public Books findById(Long isbn) {
        Optional<Books> result = myBookRepository.findById(isbn);

        Books books = null;

        if (result.isPresent())
            books = result.get();

        return books;
    }

    @Override
    public List<Books> searchBooksByAuthor(Integer author_id) {
        List<Books> books = myBookRepository.searchBooksByAuthor(author_id);

        return books;
    }

    @Override
    @Transactional
    public void save(Books admin) {
        myBookRepository.save(admin);
    }

}