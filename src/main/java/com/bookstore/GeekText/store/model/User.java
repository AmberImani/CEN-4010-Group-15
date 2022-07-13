package com.bookstore.GeekText.store.model;

import javax.persistence.Entity;
import javax.persistence.Table;

public class User {
    @Entity
    @Table(name = "rating_commenting")
    public class User{

        private int userId;
        private String username;

        public User(){
        }

        public User(int userId, String username){
            this.userId = userId;
            this.username = username;
        }

        //Setters and Getters

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
