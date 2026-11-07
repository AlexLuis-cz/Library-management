package org.services;

import org.repository.BookRepository;

public class SearchService {

    public void search() {
        BookRepository.showBooks();
    }
}
