package no.ntnu.idatt2105.rokasb.oving2.service;

import no.ntnu.idatt2105.rokasb.oving2.object.Address;
import no.ntnu.idatt2105.rokasb.oving2.object.Author;
import no.ntnu.idatt2105.rokasb.oving2.object.Book;
import no.ntnu.idatt2105.rokasb.oving2.repository.AuthorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    private final Logger LOGGER = LoggerFactory.getLogger(AuthorService.class);

    public List<Author> getAuthors() {
        LOGGER.info("AuthorService.getAuthors() was called.");
        return authorRepository.getAuthors();
    }

    public Author addAuthor(Author author) {
        return authorRepository.addAuthor(author);
    }

    public Author getAuthor(int authorID) {
        Author author = authorRepository.getAuthor(authorID);
        if(author != null) LOGGER.info("AuthorService.getAuthor() was called and returned: " + author);
        else LOGGER.warn("AuthorService.getAuthor() was called and returned null. No author with such authorID found.");
        return author;
    }

    public Author getAuthor(String firstName, String lastName) {
        Author author = authorRepository.getAuthor(firstName, lastName);
        if(author != null) LOGGER.info("AuthorService.getAuthor() was called and returned: " + author);
        else LOGGER.warn("AuthorService.getAuthor() was called and returned null. No author with such firstName and lastName found.");
        return author;
    }

    public Author updateAuthor(int authorID, Author author) {
        return authorRepository.updateAuthor(authorID, author);
    }

    public Author removeAuthor(int authorID) { return authorRepository.removeAuthor(authorID); }

    public Author addNewBook(int authorID, Book book) { return authorRepository.addNewBook(authorID, book); }

    public Author addExistingBook(int authorID, int bookID) { return authorRepository.addExistingBook(authorID, bookID); }

    public Author addNewAddress(int authorID, Address address) { return authorRepository.addNewAddress(authorID, address); }

    public Author addExistingAddress(int authorID, int addressID) { return authorRepository.addExistingAddress(authorID, addressID); }

    public List<Book> getBooks(int authorID) {
        LOGGER.info("AuthorService.getBooks() was called.");
        return authorRepository.getBooks(authorID);
    }

    public Address getAddress(int authorID) {
        Address address = authorRepository.getAddress(authorID);
        if(address != null) LOGGER.info("AuthorService.getAddress() was called and returned: " + address);
        else LOGGER.warn("AuthorService.getAddress() was called and returned null. Author has no address.");
        return address;
    }
}
