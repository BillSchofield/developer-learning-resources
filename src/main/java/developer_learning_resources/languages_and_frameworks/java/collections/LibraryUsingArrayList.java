package developer_learning_resources.languages_and_frameworks.java.collections;

import java.util.ArrayList;

public class LibraryUsingArrayList {
    private ArrayList<Book> books;

    public LibraryUsingArrayList(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> findBooksContainingWord(String word) {
        ArrayList<Book> booksToReturn = new ArrayList<>();
        for (Book book : books) {
            if (book.name().contains(word)){
                booksToReturn.add(book);
            }
        }
        return booksToReturn;
    }

    public void listBooks(ArrayList<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.name());
        }
    }
}
