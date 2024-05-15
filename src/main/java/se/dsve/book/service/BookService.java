package se.dsve.book.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import se.dsve.book.exceptions.ResourceNotFoundException;
import se.dsve.book.model.Book;
import se.dsve.book.repository.BookRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * The BookService class is responsible for handling business logic related to books.
 * It provides methods for retrieving, adding, updating, and deleting books.
 * Data access is handled by the BookRepository class.
 */
@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostConstruct
    public void init() {
        List<Book>  books = Arrays.asList(
                new Book ("The Great Gatsby", "F. Scott Fitzgerald",    "9780743273565"),
                new Book ("To Kill a Mockingbird", "Harper Lee",   "9780061120084"),
                new Book ("1984", "George Orwell",   "9780451524935"),
                new Book ("Pride and Prejudice", "Jane Austen",   "9780679783268"),
                new Book ("The Catcher in the Rye", "J.D. Salinger",   "9780316769488"),
                new Book ("The Hobbit", "J.R.R. Tolkien",   "9780345534835")
        );
        bookRepository.saveAll(books);
    }

    public List<Book> getAllBooks() {
        // TODO: Skriv din kod här
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        // TODO: Skriv din kod här
        return bookRepository.findById(id);
    }

    public Book addBook(Book book) {
        // TODO: Skriv din kod här
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails) {
        // TODO: Skriv din kod här
        Book book = getBookOrFail(id);
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setIsbn(bookDetails.getIsbn());
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        // TODO: Skriv din kod här
        bookRepository.deleteById(id);

    }

    private Book getBookOrFail(Long id) {
        // TODO: Skriv din kod här
        return bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + id));
    }
}
