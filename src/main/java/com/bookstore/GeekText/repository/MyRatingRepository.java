package com.bookstore.GeekText.repository;

import com.bookstore.GeekText.model.RatingComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRatingRepository extends JpaRepository<RatingComment, Integer> {
}