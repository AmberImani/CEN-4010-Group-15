package com.bookstore.GeekText.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "author")
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author_id;
    private String first_name;
    private String last_name;
    private String bio;
    private String publisher;

    public Authors(Integer id){
        this.author_id = id;
    }
}
