package no.ntnu.idatt2105.rokasb.oving2.repository;

import no.ntnu.idatt2105.rokasb.oving2.dao.BookDao;
import no.ntnu.idatt2105.rokasb.oving2.object.Author;
import no.ntnu.idatt2105.rokasb.oving2.object.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository extends BookDao {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Book removeBook(int bookID) {
        Book removedBook = super.removeBook(bookID);
        for(Author author : removedBook.getAuthors()) {
            authorRepository.deleteBook(author.getAuthorID(), bookID);
        }
        return removedBook;
    }
}
