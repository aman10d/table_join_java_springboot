package table.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import table.example.demo.serivice.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")

public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("/with-authors")
    public List<Object[]> getAllBooksWithAuthors() {
        return bookService.getBooksAndAuthors();
    }
}
