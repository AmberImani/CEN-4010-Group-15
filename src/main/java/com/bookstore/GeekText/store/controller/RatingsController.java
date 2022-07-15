package com.bookstore.GeekText.store.controller;

import com.bookstore.GeekText.store.model.RatingComment;
import com.bookstore.GeekText.store.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("rating_commenting")
public class RatingsController {
    @Autowired
    RatingService ratingService;

    @GetMapping("")
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
    @PostMapping("/")
    public void add (@RequestBody RatingComment rating){
        ratingService.saveRating(rating);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update (@RequestBody RatingComment ratingComment, @PathVariable Integer id){
        try {
            RatingComment existsRating = ratingService.getRating(id);
            ratingComment.setRatingId(id);
            ratingService.saveRating(ratingComment);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @DeleteMapping("/{id}")
    public void delete (@PathVariable Integer id){
        ratingService.deleteRating(id);
    }
}
