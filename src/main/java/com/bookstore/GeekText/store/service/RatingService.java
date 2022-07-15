package com.bookstore.GeekText.store.service;

import com.bookstore.GeekText.store.model.RatingComment;
import com.bookstore.GeekText.store.repository.MyRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RatingService {
    @Autowired
    private MyRatingRepository ratingRepository;
    public List<RatingComment> listAllRatings () {
        return ratingRepository.findAll();
    }
    public void saveRating(RatingComment rating){
        ratingRepository.save(rating);
    }
    public RatingComment getRating (Integer id){
        return ratingRepository.findById(id).get();
    }

    public void deleteRating(Integer id){
        ratingRepository.deleteById(id);
    }
}