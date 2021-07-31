package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/book")
// http://localhost:8080/api/v1/book
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBook(){
        return bookService.getBook();
    }

    @PostMapping
    public void createNewBook(@RequestBody Book book){
        bookService.addNewBook(book);
    }
}

