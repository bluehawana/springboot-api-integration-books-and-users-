package se.dsve.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.dsve.book.exceptions.ResourceNotFoundException;
import se.dsve.book.model.Book;
import se.dsve.book.service.BookService;

import java.util.List;

/**
 * The BookController class is responsible for handling HTTP requests related to books.
 * It provides methods for retrieving, adding, updating, and deleting books.
 * Business logic is handled by the BookService class.
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        // TODO: Skriv din kod här
        return bookService.getAllBooks() ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        // TODO: Skriv din kod här
        Book book = bookService.getBookById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + id));
        return ResponseEntity.ok(book);
            }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        // TODO: Skriv din kod här
        return bookService.addBook(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        // TODO: Skriv din kod här
     Book updateBook = bookService.updateBook(id, bookDetails);
     if (updateBook == null) {
         throw new ResourceNotFoundException("Book not found with id " + id);
     }
        return ResponseEntity.ok(updateBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        // TODO: Skriv din kod här
        try {
            bookService.deleteBook(id);
            return ResponseEntity.ok().build(); // Return 200 OK if no exception is thrown
        } catch (RuntimeException e) {
            return ResponseEntity.noContent().build(); // Return 204 NO_CONTENT when an exception is caught
        }
    }
}
