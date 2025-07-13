package com.library.librarymanagement;

import com.library.services.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bs = (BookService) context.getBean("bookService");
        bs.bookServiceShow();
    }
}