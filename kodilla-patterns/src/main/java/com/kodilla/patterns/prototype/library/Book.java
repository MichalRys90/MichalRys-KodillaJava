package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public final class Book implements Comparable<Book>{

    private final String title;
    private final String author;
    private final LocalDate publicationDate;

    public Book(final String title, final String author, final LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return title + '\'' + author + '\'' + publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publicationDate, book.publicationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationDate);
    }

    public static final Comparator<Book> comparator =
    Comparator.comparing(Book::getTitle)
            .thenComparing(Book::getAuthor)
            .thenComparing(Book::getPublicationDate);

    @Override
    public int compareTo(Book o) {
        return comparator.compare(this, o);
    }
}
