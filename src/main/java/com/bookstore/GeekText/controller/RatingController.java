package com.bookstore.GeekText.controller;

import com.bookstore.GeekText.model.RatingComment;
import com.bookstore.GeekText.model.RatingCommentId;
import com.bookstore.GeekText.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    RatingService ratingService;
    //Get all
    @GetMapping("/")
    public List<RatingComment> list(){
        return ratingService.listAllRatings();
    }
    //Get specific
    @GetMapping("/get-rating")
    public ResponseEntity<RatingComment> get (@RequestParam int userid, @RequestParam BigInteger isbn){
        try {
            RatingComment ratingComment = ratingService.getRating(userid, isbn);
            return new ResponseEntity<RatingComment>(ratingComment, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<RatingComment>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/get-ratings/user/{user_id}")
    public List<RatingComment> list(@PathVariable int user_id){
        return ratingService.listByUser(user_id);
    }
    @GetMapping("/get-ratings/isbn/{isbn}")
    public List<RatingComment> list(@PathVariable BigInteger isbn){
        return ratingService.listSorted(isbn);
    }

    @GetMapping("/get-rating/average/{isbn}")
    public String average(@PathVariable BigInteger isbn){
        return "Average rating: " + ratingService.averageRating(isbn);
    }

    @PostMapping("/create-rating")
    public ResponseEntity<?> create (@RequestParam  Integer userid, @RequestParam BigInteger isbn,
                         @RequestParam String comment, @RequestParam Integer rating){

        if(rating < 1 || rating > 5){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else{
            try {
                if(userid != null && isbn != null){
                    long now = System.currentTimeMillis();
                    Timestamp sqlTimeStamp = new Timestamp(now);

                    RatingComment ratingComment = new RatingComment(userid, isbn, rating, comment, sqlTimeStamp);
                    ratingService.saveRating(ratingComment);
                    return new ResponseEntity<RatingComment>(ratingComment, HttpStatus.CREATED);
                }else{
                    return new ResponseEntity(HttpStatus.BAD_REQUEST);
                }
            }catch(Exception e){
                return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/delete")
    public void delete (@RequestParam Integer user_id, @RequestParam BigInteger isbn){
        ratingService.deleteRating(user_id, isbn);
    }


    //Retrieve a SORTED ratings list by highest rating
    //Retrieve average rating of a book
}