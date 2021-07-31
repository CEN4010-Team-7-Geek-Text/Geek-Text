package BOOKBROWSING;

import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface BookBrowsingRepository extends CrudRepository<BookBrowsing, String> {

    BookBrowsing findByGenre(String genre);
    BookBrowsing findByCopies_Sold(String copies_sold);
    BookBrowsing findByRating(String rating);
    BookBrowsing findByBooksPerPage(int booksPerPage);

    List<BookBrowsing> findAll();





}
