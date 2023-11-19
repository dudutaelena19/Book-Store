package com.example.demo1.service;

import com.example.demo1.dto.BookDTO;
import com.example.demo1.entities.Book;
import com.example.demo1.repository.BookJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookJPARepository bookJPARepository;

    public List<Book> getAllBooks(){
        return bookJPARepository.findAll();
    }

    public Book getBookById(Integer id){
        return bookJPARepository.getBookById(id);
    }

    public void saveBook(BookDTO bookDTO){
        Book book=new Book();
        book.setBookTitle(bookDTO.getBookTitle());
        book.setBookAuthor(bookDTO.getBookAuthor());
        book.setBookPrice(Float.parseFloat(bookDTO.getBookPrice()));
        book.setBookPublishingHouse(bookDTO.getBookPublishingHouse());
        bookJPARepository.save(book);
    }

    public Book updateBook(Integer id, Book book){
        book.setId(Long.parseLong(id.toString()));
        return bookJPARepository.save(book);
    }

    public void deleteBookById(Integer id){
        bookJPARepository.deleteById(Long.parseLong(id.toString()));
    }
}
