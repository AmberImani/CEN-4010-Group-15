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
public class RatingComment{
    @Id
    @JoinColumn(table = "user", name = "userid")
    private int userid;
    @Id
    private BigInteger isbn;
    private int rating;
    private String comment;

    @Column(name = "timestamp", nullable = false)
    private Timestamp timestamp;

    public RatingComment() {

    }

    //Setters and Getters
    public int getUserid() {
        return userid;
    }
    public RatingComment(int userid, BigInteger isbn, int rating, String comment, Timestamp timestamp) {
        this.userid = userid;
        this.isbn = isbn;
        this.rating = rating;
        this.comment = comment;
        this.timestamp = timestamp;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}