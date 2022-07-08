package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;
import static org.testng.Assert.assertEquals;


@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

        @Test
        void testListBooksWithConditionsReturnList () {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

            // When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

            // Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBooksWithConditionMoreThan20 () {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                    .thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                    .thenReturn(resultListOf40Books);

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
            // Then

            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3 () {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            // When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            // Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }

        @Test
        void testListBooksInHandsOfZeroBooks () {
            // Given
            LibraryUser user = new LibraryUser("firstName", "lastName", "pedelID");
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            // When
            List<Book> resultListForZeroBooks = bookLibrary.listBooksInHandsOf(user);

            // Then
            assertEquals(0, resultListForZeroBooks.size());
        }

        @Test
        void testListBooksInHandsOfOneBooks () {
            // Given
            LibraryUser user = new LibraryUser("firstName", "lastName", "pedelID");
            List<Book> listBookInHandsOfOneBooks = generateListOfNBooks(1);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listBookInHandsOfOneBooks);

            // When
            List<Book> resultListForOneBooks = bookLibrary.listBooksInHandsOf(user);

            // Then
            assertEquals(1, resultListForOneBooks.size());
        }

        @Test
        void testListBooksInHandsOfFiveBooks () {
            // Given
            LibraryUser user = new LibraryUser("firstName", "lastName", "pedelID");
            List<Book> listBookInHandsOfFiveBooks = generateListOfNBooks(5);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listBookInHandsOfFiveBooks);

            // When
            List<Book> resultListForFiveBooks = bookLibrary.listBooksInHandsOf(user);

            // Then
            assertEquals(5, resultListForFiveBooks.size());
        }

    @Test
    void test_For_Rent_A_Book () {
        // Given
        LibraryUser user = new LibraryUser("firstName", "lastName", "pedelID");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listBook = new ArrayList<>();
        Book book = new Book("title","author", 1990);
        Book book1 = new Book("title1","author1", 1991);
        listBook.add(book);
        boolean isTrue = true;
        boolean isFalse = false;
        when(libraryDatabaseMock.rentABook(user, book)).thenReturn(isFalse);
        when(libraryDatabaseMock.rentABook(user, book1)).thenReturn(isTrue);

        // When
        boolean result1 = bookLibrary.rentABook(user, book);
        boolean result2 = bookLibrary.rentABook(user, book1);

        // Then
        assertEquals(false, result1);
        assertEquals(true, result2);
    }
    @Test
    void test_For_Return_A_Book () {
        // Given
        LibraryUser user = new LibraryUser("firstName", "lastName", "pedelID");
        LibraryUser user1 = new LibraryUser("firstName1", "lastName1", "pedelID1");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listBookInHandsOfFiveBooks = generateListOfNBooks(5);
        List<Book> listBookInHandsOfSevenBooks = generateListOfNBooks(7);
        when(libraryDatabaseMock.returnBooks(user)).thenReturn(listBookInHandsOfFiveBooks.size());
        when(libraryDatabaseMock.returnBooks(user1)).thenReturn(listBookInHandsOfSevenBooks.size());

        // When
        int result1 = bookLibrary.returnBooks(user);
        int result2 = bookLibrary.returnBooks(user1);

        // Then
        assertEquals(4, result1);
        assertEquals(6, result2);
    }

    }
