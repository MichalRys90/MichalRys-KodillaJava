package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("author1", "title1", 2000, "signature1");
        Book book2 = new Book("author2", "title2", 2002, "signature2");
        Book book3 = new Book("author3", "title3", 1990, "signature3");
        Book book4 = new Book("author4", "title4", 2010, "signature4");
        Book book5 = new Book("author5", "title5", 2005, "signature5");
        Book book6 = new Book("author6", "title6", 2001, "signature6");
        Book book7 = new Book("author7", "title7", 1999, "signature7");
        Book book8 = new Book("author8", "title8", 2018, "signature8");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        bookSet.add(book7);
        bookSet.add(book8);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int result = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2002, result);
    }
}
