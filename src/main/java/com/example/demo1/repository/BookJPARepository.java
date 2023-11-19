package com.example.demo1.repository;

import com.example.demo1.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookJPARepository extends JpaRepository<Book,Long> {
    Book getBookById(Integer id);
}
