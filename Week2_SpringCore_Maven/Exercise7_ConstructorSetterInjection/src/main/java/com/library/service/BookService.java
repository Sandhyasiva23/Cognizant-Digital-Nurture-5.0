package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private String name;

    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(String name) {
        this.name = name;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {

        System.out.println("Name : " + name);

        System.out.println("Book Service is working...");

        bookRepository.displayRepository();
    }

}