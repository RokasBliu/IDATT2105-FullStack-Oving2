package no.ntnu.idatt2105.rokasb.oving2.object;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int bookID;
    private String title;
    private int pageAmount;
    @JsonIgnore
    private List<Author> authors;

    public Book() {
        this.authors = new ArrayList<>();
    }

    public Book(String title, int pageAmount) {
        this.title = title;
        this.pageAmount = pageAmount;
        this.authors = new ArrayList<>();
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", title='" + title + '\'' +
                ", pageAmount=" + pageAmount +
                '}';
    }
}
