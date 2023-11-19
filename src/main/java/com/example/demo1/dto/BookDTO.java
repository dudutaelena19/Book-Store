package com.example.demo1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO {
    private String bookTitle;
    private String bookAuthor;
    private String bookPrice;
    private String bookPublishingHouse;
}
