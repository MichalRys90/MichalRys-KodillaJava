package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;
    private Map<Book, LibraryUser> usersBook = new HashMap<Book, LibraryUser>();


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
        return false;
    }

    public int returnBooks(LibraryUser libraryUser) {
        return 0;
    }

}
