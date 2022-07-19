package com.bookstore.GeekText.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table (name = "rating")
public class RatingComment {
    private int ratingId;
    private int userId;
    private BigInteger isbn;
    private float rating;
    private String comment;

    private Timestamp dateStamp;

    public RatingComment(){
    }

    public RatingComment(int ratingId, int userId, BigInteger isbn, float rating, String comment, Timestamp dateStamp){
        this.ratingId = ratingId;
        this.userId = userId;
        this.isbn = isbn;
        this.rating = rating;
        this.comment = comment;
        this.dateStamp = dateStamp;
    }

    //Setters and Getters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int commentId) {
        this.ratingId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public BigInteger getIsbn() {
        return isbn;
    }

    public void setIsbn(BigInteger isbn) {
        this.isbn = isbn;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getDateStamp() {
        return dateStamp;
    }

    public void setDateStamp(Timestamp dateStamp) {
        this.dateStamp = dateStamp;
    }
}