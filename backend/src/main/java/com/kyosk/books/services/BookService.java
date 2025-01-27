package com.kyosk.books.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kyosk.books.dtos.BookRequest;
import com.kyosk.books.models.Book;
import com.kyosk.books.repositories.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    // Fetch all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Save a new book
    public Book createBook(BookRequest bookRequest) {
        Book book = new Book();
        book.setAuthor(bookRequest.getAuthor());
        book.setTitle(bookRequest.getTitle());
        return bookRepository.save(book);
    }

    // Fetch a single book by ID
    public Book getBookById(String id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    // Delete a book by ID
    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }
}
