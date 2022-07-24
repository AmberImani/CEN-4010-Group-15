package com.bookstore.GeekText.service;

import com.bookstore.GeekText.model.Authors;
import com.bookstore.GeekText.model.Books;
import com.bookstore.GeekText.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;

    }

    @Override
    @Transactional
    public void save (Authors admin) {
        authorRepository.save(admin);
    }

    @Override
    @Transactional
    public List<Authors> findAll() {
        return authorRepository.findAll();
    }
}
