package com.bookstore.GeekText.repository;

import com.bookstore.GeekText.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MyBookRepository extends JpaRepository<Books, Long> {

}
