package com.example.demo1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "book_id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "book_name")
    private String bookTitle;
    @Basic
    @Column(name = "book_author")
    private String bookAuthor;
    @Basic
    @Column(name = "book_publishing_house")
    private String bookPublishingHouse;
    @Basic
    @Column(name = "book_price")
    private Float bookPrice;
}
