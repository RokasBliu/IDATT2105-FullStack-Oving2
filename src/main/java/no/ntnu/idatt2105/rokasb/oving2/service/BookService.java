package no.ntnu.idatt2105.rokasb.oving2.service;

import no.ntnu.idatt2105.rokasb.oving2.object.Book;
import no.ntnu.idatt2105.rokasb.oving2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks() { return bookRepository.getBooks(); }

    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }

    public Book getBook(int bookID) {
        return bookRepository.getBook(bookID);
    }

    public Book getBook(String title) { return bookRepository.getBook(title); }

    public Book updateBook(int bookID, Book book) {
        return bookRepository.updateBook(bookID, book);
    }

    public Book removeBook(int bookID) { return bookRepository.removeBook(bookID); }
}
