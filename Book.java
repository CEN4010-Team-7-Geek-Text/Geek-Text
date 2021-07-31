/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "Book")
public class Book implements Serializable 
{
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
 
    //other variables
 
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<Review> reviews;
 
    @Column(name="rating", columnDefinition = "int default 0")
    private int rating;
 
    //other getters and setters
 
    public List<Review> getReviews() {
        return reviews;
    }
 
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
 
    public int getRating() {
        return rating;
    }
 
    public void setRating(int rating) 
    {
        this.rating = rating;
    }
}