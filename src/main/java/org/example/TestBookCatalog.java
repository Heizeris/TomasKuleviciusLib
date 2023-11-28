package org.example;

import lt.techin.library.Book;
import lt.techin.library.BookCatalog;
import lt.techin.library.test.AbstractLibraryTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBookCatalog extends AbstractLibraryTest {
    @Override
    protected BookCatalog createBookCatalog() {
        return new CatalogImpl();
        
    }



}
