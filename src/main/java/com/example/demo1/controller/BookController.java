package com.example.demo1.controller;

import com.example.demo1.dto.BookDTO;
import com.example.demo1.entities.Book;
import com.example.demo1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3001")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping(value="/books/all")
    public ResponseEntity<List<Book>> getAllBooks(){
        return  ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping(value="/books/{bookId}")
    public ResponseEntity<Book>getBookById(@PathVariable(value="bookId") Integer id){
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    @PostMapping(value="/books/save")
    @ResponseStatus(value= HttpStatus.OK)
    public void saveBook(@RequestBody BookDTO bookDTO){
        bookService.saveBook(bookDTO);
    }

    @PutMapping(value="/books/{bookId}")
    @ResponseStatus(value = HttpStatus.OK)
    public Book updateBook(@PathVariable(value="bookId") Integer id,@RequestBody Book book){
        return bookService.updateBook(id,book);
    }

    @DeleteMapping(value="books/{bookId}")
    @ResponseStatus(value=HttpStatus.OK)
    public void deleteBookById(@PathVariable(value = "bookId") Integer id){
        bookService.deleteBookById(id);
    }
}
