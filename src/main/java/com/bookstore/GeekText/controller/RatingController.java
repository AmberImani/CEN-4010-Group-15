package com.bookstore.GeekText.controller;

import com.bookstore.GeekText.model.RatingComment;
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

    @GetMapping("/")
    public List<RatingComment> list(){
        return ratingService.listAllRatings();
    }
    @GetMapping("/{id}")
    public ResponseEntity<RatingComment> get (@PathVariable Integer id){
        try {
            RatingComment ratingComment = ratingService.getRating(id);
            return new ResponseEntity<RatingComment>(ratingComment, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<RatingComment>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create-rating")
    public ResponseEntity<?> create (@RequestParam  Integer userid, @RequestParam BigInteger isbn,
                         @RequestParam String comment, @RequestParam Integer rating){

        if(rating < 1 || rating > 5 || comment.length() < 1){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else{
            try {
                if(userid != null && isbn != null){
                    RatingComment ratingComment = new RatingComment();
                    ratingComment.setUserId(userid);
                    ratingComment.setIsbn(isbn);
                    ratingComment.setRating(rating);
                    ratingComment.setComment(comment);

                    long now = System.currentTimeMillis();
                    Timestamp sqlTimeStamp = new Timestamp(now);
                    ratingComment.setDateStamp(sqlTimeStamp);

                    ratingService.saveRating(ratingComment);
                    return new ResponseEntity<>(HttpStatus.CREATED);
                }else{
                    return new ResponseEntity(HttpStatus.BAD_REQUEST);
                }
            }catch(Exception e){
                return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/")
    public ResponseEntity<?> update (@RequestParam Integer id, @RequestParam Integer newId){
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable Integer id){
        ratingService.deleteRating(id);
    }


    //Create a comment for a book by a user with a date stamp.
    //Retrieve a SORTED ratings list by highest rating
    //Retrieve average rating of a book
}