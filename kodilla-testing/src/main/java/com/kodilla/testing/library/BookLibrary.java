package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;


    public BookLibrary(LibraryDatabase libraryDatabase) {

        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        return libraryDatabase.listBooksInHandsOf(libraryUser);
    }

    public boolean rentABook(LibraryUser libraryUser, Book book) {
        if (!libraryDatabase.rentABook(libraryUser, book)) {
            return false;
        }
        else if (listBooksInHandsOf(libraryUser).contains(book)) {
            return false;
        }
        else if (listBooksInHandsOf(libraryUser).size() >= 5) {
            return false;
        }
        else {
            return true;
        }
    }

    public int returnBooks(LibraryUser libraryUser) {
        int result = libraryDatabase.returnBooks(libraryUser) -1;
        return result;
    }

}
