package com.bookstore.GeekText.repository;

import com.bookstore.GeekText.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MySqlRepository extends JpaRepository<Books, Integer> {

}
