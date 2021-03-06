package com.bookstore.GeekText.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Books {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;
    @Column(name = "name")
    private String title;
    private String description;
    private Double price;
    private String author;
    private String genre;
    private String publisher;
    @Column(name = "year_published")
    private Integer yearPublished;
    private Integer sold;
    private Integer author_id;


    public Books() {
    }

    public Books(Long isbn, String title, String description, Double price, String author, String genre, String publisher, Integer yearPublished, Integer sold, Integer author_id) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.price = price;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.sold = sold;
        this.author_id = author_id;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer year_published) {
        this.yearPublished = year_published;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }
}
