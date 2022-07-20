package com.bookstore.GeekText.repository;

import com.bookstore.GeekText.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository <Authors, Long>{
}
