package net.billschofield.oop_examples.java_language_features.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        {
            ArrayList<Book> bookList = new ArrayList<>();
            bookList.add(new Book("Pottery Projects"));
            bookList.add(new Book("Sewing Projects"));
            bookList.add(new Book("Harry Potter and the Goblet of Fire"));
            bookList.add(new Book("Harry Potter and the Sorcerer's Stone"));

            LibraryUsingArrayList libraryUsingArrayList = new LibraryUsingArrayList(bookList);
            ArrayList<Book> bookListContainingPotter = libraryUsingArrayList.findBooksContainingWord("Potter");
            libraryUsingArrayList.listBooks(bookListContainingPotter);

            // What would it look like to change this to use a Set
        }


        {
            Collection<Book> bookCollection = new ArrayList<>();
            bookCollection.add(new Book("Pottery Projects"));
            bookCollection.add(new Book("Sewing Projects"));
            bookCollection.add(new Book("Harry Potter and the Goblet of Fire"));
            bookCollection.add(new Book("Harry Potter and the Sorcerer's Stone"));

            LibraryUsingCollection libraryUsingCollection = new LibraryUsingCollection(bookCollection);
            Collection<Book> booksContainingPotter = libraryUsingCollection.findBooksContainingWord("Potter");
            libraryUsingCollection.listBooks(booksContainingPotter);

            // What would it look like to change this to use a Set
        }
    }
}
