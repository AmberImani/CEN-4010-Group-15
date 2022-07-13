package com.bookstore.GeekText.store.repository;

import com.bookstore.GeekText.store.model.RatingComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRatingRepository extends JpaRepository<RatingComment, Integer> {
}
