package com.example.demo.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {
    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository){
        return args -> {
            Book DonQuixote = new Book(123-345-459,"Don Quixote",
                    "Spanish book",10.99,"Miguel de Cervantes",
                    "Fiction",1605,100000);

            Book BraveNewWorld = new Book(321-345-459,"Brave New World",
                    "Dystopian Book",12.99,"Aldous Huxley",
                    "Fiction",1932,300000);

            repository.saveAll(List.of(DonQuixote, BraveNewWorld));


        };
    }
}
