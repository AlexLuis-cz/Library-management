package org.repository;

import org.models.Availability;
import org.models.Book;

public class RepositoryBook {
    private static Book[] books = new Book[500];
    private static int prox = 0;


    public static void addRepository(Book book) {
        books[prox] = book;
        prox++;
        book.setId(prox);
        book.setAvailability(Availability.AVAILABLE);
    }

    public static void showBooks() {
        System.out.println("Books:");
        for (int i = 0; i < prox; i++) {
            System.out.print("Book Id:"+ books[i].getId() +": ");
            System.out.println(
                    " Title:" + books[i].getTitulo() +
                            " Publisher:" + books[i].getPublisher() +
                            " Year:" + books[i].getYearLaunch() +
                            " Availability:" + books[i].getAvailability().getAvailableName());
        }
    }
}
