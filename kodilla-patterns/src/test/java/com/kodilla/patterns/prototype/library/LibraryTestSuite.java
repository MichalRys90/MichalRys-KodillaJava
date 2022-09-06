package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library");
        IntStream.iterate(0, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("title " + n, "author " + n,
                        LocalDate.of(1990 + n, 1 + n, 1 + n))));

        Book book = new Book("title 999", "author 999", LocalDate.of(2020, 12, 12));
        library.getBooks().add(book);

        Library cloneLibrary = null;

        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;

        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);

        //When
        library.getBooks().remove(book);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);

        assertEquals(10, library.getBooks().size());
        assertEquals(10, cloneLibrary.getBooks().size());
        assertEquals(11, deepClonedLibrary.getBooks().size());
        assertEquals(cloneLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
