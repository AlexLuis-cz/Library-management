package org.services;

import org.Utils.InputUtils;
import org.models.Book;
import org.repository.RepositoryBook;

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

        RepositoryBook.addRepository(book);
    }
}
