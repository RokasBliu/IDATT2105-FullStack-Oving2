package no.ntnu.idatt2105.rokasb.oving2.service;

import no.ntnu.idatt2105.rokasb.oving2.object.Book;
import no.ntnu.idatt2105.rokasb.oving2.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    private final Logger LOGGER = LoggerFactory.getLogger(BookService.class);

    public List<Book> getBooks() {
        LOGGER.info("BookService.getBooks() was called.");
        return bookRepository.getBooks();
    }

    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }

    public Book getBook(int bookID) {
        Book book = bookRepository.getBook(bookID);
        if(book != null) LOGGER.info("BookService.getBook() was called and returned: " + book);
        else LOGGER.warn("BookService.getBook() was called and returned null. No book with such bookID found.");
        return book;
    }

    public Book getBook(String title) {
        Book book = bookRepository.getBook(title);
        if(book != null) LOGGER.info("BookService.getBook() was called and returned: " + book);
        else LOGGER.warn("BookService.getBook() was called and returned null. No book with such title found.");
        return book;
    }

    public Book updateBook(int bookID, Book book) {
        return bookRepository.updateBook(bookID, book);
    }

    public Book removeBook(int bookID) { return bookRepository.removeBook(bookID); }
}
