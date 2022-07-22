package com.bookstore.GeekText.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

//@NoArgsConstructor
@Entity
@Table(name = "author")
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer author_id;
    private String first_name;
    private String last_name;
    private String bio;
    private String publisher;

    public Authors() {
    }

    public Authors(Integer author_id, String first_name, String last_name, String bio, String publisher) {
        this.author_id = author_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.bio = bio;
        this.publisher = publisher;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

