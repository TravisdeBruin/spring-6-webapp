package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * At runtime when spring sees that we require a service it will have spring bean
 * which implements the bookServiceImpl that will be an implementation of bookservice
 *  When spring creates the controller component it will wire in the functionality for us.
 *
 */
@Controller
public class BookController {

    // make use of the interface here so that further down the line we can
    // possibly make use of different implementations of the service
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookService.findAll());

        return "books";
    }
}
