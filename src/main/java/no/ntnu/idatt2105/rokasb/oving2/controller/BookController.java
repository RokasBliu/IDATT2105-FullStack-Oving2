package no.ntnu.idatt2105.rokasb.oving2.controller;

import no.ntnu.idatt2105.rokasb.oving2.object.Book;
import no.ntnu.idatt2105.rokasb.oving2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks() { return bookService.getBooks(); }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @GetMapping("/books/{bookID}")
    public Book getBook(@PathVariable("bookID") int bookID) {
        return bookService.getBook(bookID);
    }

    @PutMapping("/books/{bookID}")
    public void updateBook(@PathVariable("bookID") int bookID, @RequestBody Book book) {
        bookService.updateBook(bookID, book);
    }

    @DeleteMapping("/books/{bookID}")
    public void removeBook(@PathVariable("bookID") int bookID) {
        bookService.removeBook(bookID);
    }

}
