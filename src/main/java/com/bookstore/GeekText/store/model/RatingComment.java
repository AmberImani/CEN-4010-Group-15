package com.bookstore.GeekText.store.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

public class RatingComment {
    @Entity
    @Table (name = "rating_commenting")
    public class RatingAndCommenting{

        @Id
        private int commentId;
        private int userId;
        private int isbn;
        private float rating;
        private String comment;

        private Timestamp dateStamp;

        public RatingAndCommenting(){
        }

        public RatingAndCommenting(int commentId, int userId, int isbn, float rating, String comment, Timestamp dateStamp){
            this.commentId = commentId;
            this.userId = userId;
            this.isbn = isbn;
            this.rating = rating;
            this.comment = comment;
            this.dateStamp = dateStamp;
        }

        //Setters and Getters

        public int getCommentId() {
            return commentId;
        }

        public void setCommentId(int commentId) {
            this.commentId = commentId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getIsbn() {
            return isbn;
        }

        public void setIsbn(int isbn) {
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
}
