package org.models;

public class User extends AbstractUser {
    private Book[] books = new Book[10];
    private byte prox = 0;

    public User(String nameUser, String password) {
        super(nameUser, password);
    }

    public void setBooks(Book book) {
        this.books[prox] = book;
        prox++;
    }
}
