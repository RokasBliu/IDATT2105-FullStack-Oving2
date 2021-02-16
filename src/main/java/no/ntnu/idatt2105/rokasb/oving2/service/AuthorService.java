package no.ntnu.idatt2105.rokasb.oving2.service;

import no.ntnu.idatt2105.rokasb.oving2.object.Address;
import no.ntnu.idatt2105.rokasb.oving2.object.Author;
import no.ntnu.idatt2105.rokasb.oving2.object.Book;
import no.ntnu.idatt2105.rokasb.oving2.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAuthors() { return authorRepository.getAuthors(); }

    public Author addAuthor(Author author) {
        return authorRepository.addAuthor(author);
    }

    public Author getAuthor(int authorID) {
        return authorRepository.getAuthor(authorID);
    }

    public Author getAuthor(String firstName, String lastName) { return authorRepository.getAuthor(firstName, lastName); }

    public Author updateAuthor(int authorID, Author author) {
        return authorRepository.updateAuthor(authorID, author);
    }

    public Author removeAuthor(int authorID) { return authorRepository.removeAuthor(authorID); }

    public Author addNewBook(int authorID, Book book) { return authorRepository.addNewBook(authorID, book); }

    public Author addExistingBook(int authorID, int bookID) { return authorRepository.addExistingBook(authorID, bookID); }

    public Author addNewAddress(int authorID, Address address) { return authorRepository.addNewAddress(authorID, address); }

    public Author addExistingAddress(int authorID, int addressID) { return authorRepository.addExistingAddress(authorID, addressID); }

    public List<Book> getBooks(int authorID) { return authorRepository.getBooks(authorID); }

    public Address getAddress(int authorID) { return authorRepository.getAddress(authorID); }
}
