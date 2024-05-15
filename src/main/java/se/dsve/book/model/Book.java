package se.dsve.book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String isbn;

    public Book() {
    }


    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Long getId() {
        // TODO: Skriv din kod här  ;
        return id;
    }

    public void setId(Long id) {
        // TODO: Skriv din kod
        this.id = id;

    }

    public String getTitle() {
        // TODO: Skriv din kod här
        return title;
    }

    public void setTitle(String title) {
        // TODO: Skriv din kod här
        this.title = title;
    }

    public String getAuthor() {
        // TODO: Skriv din kod här
        return author;
    }

    public void setAuthor(String author) {
        // TODO: Skriv din kod här
        this.author = author;
    }

    public String getIsbn() {
        // TODO: Skriv din kod här
        return isbn;
    }

    public void setIsbn(String isbn) {
        // TODO: Skriv din kod här
        this.isbn = isbn;
    }
}
