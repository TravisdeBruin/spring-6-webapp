package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;

// When injecting components best practice is to be writing to an interface
public interface BookService {

    Iterable<Book> findAll();
}
