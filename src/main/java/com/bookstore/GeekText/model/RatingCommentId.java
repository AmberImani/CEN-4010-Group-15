package com.bookstore.GeekText.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@EqualsAndHashCode
@Table(name = "rating")
public class RatingCommentId implements Serializable {
    @Id
    private int userid;
    @Id
    private BigInteger isbn;
    public RatingCommentId() {
    }
    public RatingCommentId(int userid, BigInteger isbn) {
        this.userid = userid;
        this.isbn = isbn;
    }


}
