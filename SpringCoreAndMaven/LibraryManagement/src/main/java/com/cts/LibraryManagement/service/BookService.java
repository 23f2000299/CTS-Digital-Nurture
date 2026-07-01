package com.cts.LibraryManagement.service;


import com.cts.LibraryManagement.repository.BookRepository;


public class BookService {


    private BookRepository bookRepository;


    public void setBookRepository(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }


    public void displayBook()
    {
        System.out.println("Book Service Running");

        bookRepository.getBook();
    }

}
