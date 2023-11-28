package org.example;

import lt.techin.library.Author;
import lt.techin.library.Book;
import lt.techin.library.BookCatalog;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;

public class CatalogImpl implements BookCatalog {

private BookCatalog catalog;
    @BeforeEach
    void setUp() {
        this.catalog = this;
    }
Set<Book> Booklist = new HashSet<>();

    @Override
    public void addBook(Book book) {
Booklist.add(book);
    }

    @Override
    public Book getBookByIsbn(String s) {
        for (Book book : Booklist) {
            if (book.getIsbn().equals(s))
                return getBookByIsbn(s);
        }
        return null;
    }

    @Override
    public List<Book> searchBooksByAuthor(String s) {



        return null;
    }

    @Override
    public int getTotalNumberOfBooks() {

return Booklist.size();

    }

    @Override
    public boolean isBookInCatalog(String s) {
        return false;
    }

    @Override
    public boolean isBookAvailable(String s) {
        return false;
    }

    @Override
    public Book findNewestBookByPublisher(String s) {
        return null;
    }

    @Override
    public List<Book> getSortedBooks() {
        return null;
    }

    @Override
    public Map<String, List<Book>> groupBooksByPublisher() {
        return null;
    }

    @Override
    public List<Book> filterBooks(Predicate<Book> predicate) {
       Book book = new Book();
        this.catalog.addBook(book);



        return null;
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        return null;

    }


}
