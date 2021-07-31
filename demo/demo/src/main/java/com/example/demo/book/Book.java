package com.example.demo.book;

import javax.persistence.*;

@Entity
@Table
public class Book {
    @Id // this makes book into a table in the database
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private Integer ISBN;
    private String bookName;
    private String bookDescription;
    private Double bookPrice;
    private String bookAuthor;
    private String bookGenre;
    private Integer yearPublished;
    private Integer copiesSold;

    public Book() {

    }

    public Book(Integer ISBN, String bookName, String bookDescription, Double bookPrice,
                String bookAuthor, String bookGenre, Integer yearPublished, Integer copiesSold) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.bookDescription = bookDescription;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
        this.yearPublished = yearPublished;
        this.copiesSold = copiesSold;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    public Integer getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(Integer copiesSold) {
        this.copiesSold = copiesSold;
    }
}
