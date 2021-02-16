package no.ntnu.idatt2105.rokasb.oving2.controller;

import no.ntnu.idatt2105.rokasb.oving2.object.Address;
import no.ntnu.idatt2105.rokasb.oving2.object.Author;
import no.ntnu.idatt2105.rokasb.oving2.object.Book;
import no.ntnu.idatt2105.rokasb.oving2.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    public List<Author> getAuthors() { return authorService.getAuthors(); }

    @PostMapping("/authors")
    public void addAuthor(@RequestBody Author author) {
        authorService.addAuthor(author);
    }

    @GetMapping("/authors/{authorID}")
    public Author getAuthor(@PathVariable("authorID") int authorID) {
        return authorService.getAuthor(authorID);
    }

    @GetMapping("/authors/{firstName}/{lastName}")
    public Author getAuthor(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
        return authorService.getAuthor(firstName, lastName);
    }

    @PutMapping("/authors/{authorID}")
    public Author updateAuthor(@PathVariable("authorID") int authorID, @RequestBody Author author) {
        return authorService.updateAuthor(authorID, author);
    }

    @DeleteMapping("/authors/{authorID}")
    public void removeAuthor(@PathVariable("authorID") int authorID) {
        authorService.removeAuthor(authorID);
    }

    @PutMapping("/authors/{authorID}/books")
    public void addNewBook(@PathVariable("authorID") int authorID, @RequestBody Book book) {
        authorService.addNewBook(authorID, book);
    }

    @PutMapping("/authors/{authorID}/books/{bookID}")
    public void addExistingBook(@PathVariable("authorID") int authorID, @PathVariable("bookID") int bookID) {
        authorService.addExistingBook(authorID, bookID);
    }

    @PutMapping("/authors/{authorID}/address")
    public void addNewAddress(@PathVariable("authorID") int authorID, @RequestBody Address address) {
        authorService.addNewAddress(authorID, address);
    }

    @PutMapping("/authors/{authorID}/address/{addressID}")
    public void addExistingAddress(@PathVariable("authorID") int authorID, @PathVariable("addressID") int addressID) {
        authorService.addExistingAddress(authorID, addressID);
    }

    @GetMapping("/authors/{authorID}/books")
    public List<Book> getBooks(@PathVariable("authorID") int authorID) {
        return authorService.getBooks(authorID);
    }

    @GetMapping("/authors/{authorID}/address")
    public Address getAddress(@PathVariable("authorID") int authorID) {
        return authorService.getAddress(authorID);
    }
}
