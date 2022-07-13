package com.bookstore.GeekText.store.repository;

import com.bookstore.GeekText.store.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookRepository extends JpaRepository<Books, Integer> {
}
