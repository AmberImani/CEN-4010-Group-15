package com.bookstore.GeekText.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
@Entity
@Table (name = "rating")
@IdClass(RatingCommentId.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingComment{
    @Id
    private int user_id;
    @Id
    private BigInteger isbn;
    private float rating;
    private String comment;
    @Column(name = "date_stamp", nullable = false)
    private Timestamp date_stamp;

    //Setters and Getters
    public int getUserId() {
        return user_id;
    }

    public void setUserId(int userId) {
        this.user_id = userId;
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
        return date_stamp;
    }

    public void setDateStamp(Timestamp datestamp) {
        this.date_stamp = datestamp;
    }
}