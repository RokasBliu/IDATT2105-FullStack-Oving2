package no.ntnu.idatt2105.rokasb.oving2.service;

import no.ntnu.idatt2105.rokasb.oving2.dao.BookDao;
import no.ntnu.idatt2105.rokasb.oving2.object.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public List<Book> getBooks() { return bookDao.getBooks(); }

    public Book addBook(Book book) {
        return bookDao.addBook(book);
    }

    public Book getBook(int bookID) {
        return bookDao.getBook(bookID);
    }

    public Book updateBook(int bookID, Book book) {
        return bookDao.updateBook(bookID, book);
    }

    public Book removeBook(int bookID) { return bookDao.removeBook(bookID); }
}
