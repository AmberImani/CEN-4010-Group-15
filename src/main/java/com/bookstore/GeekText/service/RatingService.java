package com.bookstore.GeekText.service;

import com.bookstore.GeekText.model.RatingComment;
import com.bookstore.GeekText.repository.MyRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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