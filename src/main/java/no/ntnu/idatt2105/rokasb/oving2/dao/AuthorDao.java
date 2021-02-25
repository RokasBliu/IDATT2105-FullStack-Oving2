package no.ntnu.idatt2105.rokasb.oving2.dao;

import no.ntnu.idatt2105.rokasb.oving2.object.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorDao {
    private List<Author> authors;

    public AuthorDao() {
        authors = new ArrayList<>();
    }

    public AuthorDao(List<Author> authors) {
        this.authors = authors;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Author getAuthor(int authorID) {
        for(Author author : authors) {
            if(author.getAuthorID() == authorID) return author;
        }
        return null;
    }

    public Author getAuthor(String firstName, String lastName) {
        for(Author author : authors) {
            if(author.getFirstName().equals(firstName) && author.getLastName().equals(lastName)) {
                return author;
            }
        }
        return null;
    }

    public Author addAuthor(Author author) {
        author.setAuthorID(authors.size() + 1);
        authors.add(author);
        return author;
    }

    public Author updateAuthor(int authorID, Author author) {
        int i;
        for(i = 0; i < authors.size(); i++) {
            if(authors.get(i).getAuthorID() == authorID) {
                author.setAuthorID(authorID);
                break;
            }
        }
        authors. set(i, author);
        return author;
    }

    public Author removeAuthor(int authorID) {
        for(Author author : authors) {
            if(author.getAuthorID() == authorID) {
                authors.remove(author);
                return author;
            }
        }
        return null;
    }
}
