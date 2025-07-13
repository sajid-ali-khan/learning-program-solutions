package com.sajid.services;

import com.sajid.repositories.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void bookServiceShow()
    {
        System.out.println("Inside BookService");
        bookRepository.bookRepositoryShow();
    }

}
