package developer_learning_resources.languages_and_frameworks.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class LibraryUsingCollection {
    private Collection<Book> books;

    public LibraryUsingCollection(Collection<Book> books) {
        this.books = books;
    }

    public Collection<Book> findBooksContainingWord(String word) {
        Collection<Book> booksToReturn = new ArrayList<>();
        for (Book book : books) {
            if (book.name().contains(word)){
                booksToReturn.add(book);
            }
        }
        return booksToReturn;
    }

    public void listBooks(Collection<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.name());
        }
    }
}
