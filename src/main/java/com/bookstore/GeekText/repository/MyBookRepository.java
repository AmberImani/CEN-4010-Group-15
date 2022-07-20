package com.bookstore.GeekText.repository;

import com.bookstore.GeekText.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface MyBookRepository extends JpaRepository<Books, Long> {

    @Query(value = "SELECT * from book p WHERE " +
            "p.author_id LIKE :author_id", nativeQuery = true)
    List<Books> searchBooksByAuthor(Integer author_id);
}
