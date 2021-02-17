package no.ntnu.idatt2105.rokasb.oving2.repository;

import no.ntnu.idatt2105.rokasb.oving2.dao.AddressDao;
import no.ntnu.idatt2105.rokasb.oving2.dao.AuthorDao;
import no.ntnu.idatt2105.rokasb.oving2.object.Address;
import no.ntnu.idatt2105.rokasb.oving2.object.Author;
import no.ntnu.idatt2105.rokasb.oving2.object.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorRepository extends AuthorDao {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AddressDao addressDao;

    public Author addNewBook(int authorID, Book book) {
        Author tempAuth = getAuthor(authorID);
        tempAuth.getBooks().add(book); //adds book to author
        book.getAuthors().add(tempAuth); //adds author to book author list
        bookRepository.addBook(book);  //adds book to bookDao
        return updateAuthor(authorID, tempAuth);
    }

    public Author addExistingBook(int authorID, int bookID) {
        Author tempAuth = getAuthor(authorID);
        Book book = bookRepository.getBook(bookID);
        tempAuth.getBooks().add(book);
        book.getAuthors().add(tempAuth);
        return updateAuthor(authorID, tempAuth);
    }

    public Author addNewAddress(int authorID, Address address) {
        Author tempAuth = getAuthor(authorID);
        tempAuth.setAddress(address);
        address.setAuthor(tempAuth);
        addressDao.getAddresses().add(address);
        return updateAuthor(authorID, tempAuth);
    }

    public Author addExistingAddress(int authorID, int addressID) {
        Author tempAuthor = getAuthor(authorID);
        Address address = addressDao.getAddress(addressID);
        tempAuthor.setAddress(address);
        address.setAuthor(tempAuthor);
        return updateAuthor(authorID, tempAuthor);
    }

    public List<Book> getBooks(int authorID) {
        Author author = getAuthor(authorID);
        return author.getBooks();
    }

    public Address getAddress(int authorID) {
        Author author = getAuthor(authorID);
        return author.getAddress();
    }

    public Author deleteBook(int authorID, int bookID) {
        Author author = getAuthor(authorID);
        author.getBooks().removeIf(book -> book.getBookID() == bookID);
        return updateAuthor(authorID, author);
    }
}
