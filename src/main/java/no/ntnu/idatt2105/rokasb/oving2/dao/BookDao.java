package no.ntnu.idatt2105.rokasb.oving2.dao;

import no.ntnu.idatt2105.rokasb.oving2.object.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDao {

    private List<Book> books;

    public BookDao() {
        books = new ArrayList<>();
    }

    public BookDao(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(int bookID) {
        for(Book book : books) {
            if(book.getBookID() == bookID) return book;
        }
        return null;
    }

    public Book getBook(String title) {
        for(Book book : books) {
            if(book.getTitle().equals(title)) return book;
        }
        return null;
    }

    public Book addBook(Book book) {
        book.setBookID(books.size() + 1);
        books.add(book);
        return book;
    }

    public Book updateBook(int bookID, Book book) {
        int i;
        for(i = 0; i < books.size(); i++) {
            if(books.get(i).getBookID() == bookID) {
                book.setBookID(bookID);
                break;
            }
        }
        books.set(i, book);
        return book;
    }

    public Book removeBook(int bookID) {
        for(Book book : books) {
            if(book.getBookID() == bookID) {
                books.remove(book);
                return book;
            }
        }
        return null;
    }
}
