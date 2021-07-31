/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "review")
public class Review implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @javax.persistence.Id
    private Long id;    
 
    @Column(name = "Revuewer", nullable = false, length = 100)
    private String ReviewerName;
 
    @Column(name = "Revieweremail", nullable = false, length = 100)
    private String ReviewerEmail;    
 
    @Column(name = "comment", nullable = false, length = 1000)
    @javax.persistence.Id
    private String comment;
 
    @Column(name = "rating", nullable = true)
    @javax.persistence.Id
    private int rating;
 
    @ManyToOne
    @JoinColumn(name = "product", nullable = false)
    private Book product;
 
    @Column(name = "created", nullable = true)
    private Date created;    
 
    @PrePersist
      protected void onCreate() {
        created = new Date();
      }
 
    //getters and setters
//toString method

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    void setProduct(Book product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}

