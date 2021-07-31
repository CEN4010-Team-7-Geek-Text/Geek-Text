package BOOKBROWSING;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookBrowsing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String genre;
    private String copies_sold;
    private String rating;
    private int booksPerPage;


    public BookBrowsing(String genre, String copies_sold, String rating, int booksPerPage){


        this.genre = genre;
        this.copies_sold = copies_sold;
        this.rating = rating;
        this. booksPerPage = booksPerPage;



    }




    public String getGenre(){
        return genre;
    }

    public String getCopies_sold(){
        return copies_sold;
    }
    public String getRating(){
        return rating;
    }
    public int getBooksPerPage(){
        return booksPerPage;
    }



}
