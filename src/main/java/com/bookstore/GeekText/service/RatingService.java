package com.bookstore.GeekText.service;

import com.bookstore.GeekText.model.RatingComment;
import com.bookstore.GeekText.model.RatingCommentId;
import com.bookstore.GeekText.repository.MyRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
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
    public RatingComment getRating (int userId, BigInteger isbn){
        return ratingRepository.findById(new RatingCommentId(userId, isbn)).get();
    }

    public List<RatingComment> listSorted(BigInteger isbn){
        return ratingRepository.findAllByIsbn(isbn, Sort.by(Sort.Direction.DESC,"rating"));
    }
    public List<RatingComment> listByUser(int userId){
        return ratingRepository.findAllByUserid(userId, Sort.by(Sort.Direction.DESC,"rating"));
    }

    public float averageRating(BigInteger isbn){
        float avgRating = 0;
        List<RatingComment> ratings = listSorted(isbn);
        if(ratings!=null){
            for(RatingComment i: ratings){
                avgRating += i.getRating();
            }
        }
        avgRating = avgRating/ratings.size();
        return avgRating;
    }

    public void deleteRating(int userId, BigInteger isbn){
        ratingRepository.deleteById(new RatingCommentId(userId, isbn));
    }


    //Retrieve a SORTED ratings list by highest rating
    //Retrieve average rating of a book
}