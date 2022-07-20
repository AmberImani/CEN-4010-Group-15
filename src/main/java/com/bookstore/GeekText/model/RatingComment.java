package com.bookstore.GeekText.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
@Entity
@Table (name = "rating")
public class RatingComment{
    @Id
    @Column(name = "user_id", nullable = false)
    private int user_id;
    @Id
    @Column(name = "isbn", nullable = false)
    private BigInteger isbn;
    @Column(name = "rating")
    private float rating;
    @Column(name = "comment")
    private String comment;
    @Column(name = "date_stamp", nullable = false)
    private Timestamp date_stamp;

    public RatingComment(){
    }

    public RatingComment(int user_id, BigInteger isbn, float rating, String comment, Timestamp date_stamp){

        this.user_id = user_id;
        this.isbn = isbn;
        this.rating = rating;
        this.comment = comment;
        this.date_stamp = date_stamp;
    }

    //Setters and Getters
    @Id
    public int getUserId() {
        return user_id;
    }

    public void setUserId(int userId) {
        this.user_id = userId;
    }
    @Id
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
        return date_stamp;
    }

    public void setDateStamp(Timestamp datestamp) {
        this.date_stamp = datestamp;
    }
}