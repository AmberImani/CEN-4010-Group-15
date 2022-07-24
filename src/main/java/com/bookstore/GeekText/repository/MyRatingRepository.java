package com.bookstore.GeekText.repository;

import com.bookstore.GeekText.model.RatingComment;
import com.bookstore.GeekText.model.RatingCommentId;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface MyRatingRepository extends JpaRepository<RatingComment, RatingCommentId> {
    List<RatingComment> findAllByUserid(int userId, Sort sort);
    List<RatingComment> findAllByIsbn(BigInteger isbn, Sort sort);
}