package com.bookstore.GeekText.service;

import com.bookstore.GeekText.model.Authors;
import com.bookstore.GeekText.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;

    }

    @Override
    public Authors createAuthor(Authors author){
        return authorRepository.save(author);
    }

}
