package org.services;

import org.utils.InputUtils;
import org.models.Book;
import org.repository.BookRepository;

public class AddBook {

    public void addForLibrary(){
        InputUtils.returnString();

        System.out.print("Name book:");
        String nameBook = InputUtils.returnString();

        System.out.print("Publisher:");
        String publisher = InputUtils.returnString();

        System.out.print("Year:");
        int yearLaunched = InputUtils.returnInt();

        Book book = new Book(nameBook,publisher,yearLaunched);

        BookRepository.addRepository(book);
    }
}
