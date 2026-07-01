package com.cts.LibraryManagement;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.LibraryManagement.service.BookService;



public class Main {


    public static void main(String[] args)
    {


        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                "applicationContext.xml");



        BookService service =
                context.getBean(
                "bookService",
                BookService.class);



        service.displayBook();


    }

}