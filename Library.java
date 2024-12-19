package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByYearPublished(String yearPublished) {
        for (Book book : books) {
            if (book.getYearPublished().equals(yearPublished)) {
                return book;
            }
        }
        return null;
    }

    public boolean lendBook(String yearPublished) {
        Book book = findBookByYearPublished(yearPublished);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public void returnBook(String yearPublished) {
        Book book = findBookByYearPublished(yearPublished);
        if (book != null) {
            book.setAvailable(true);
        }
    }
}
