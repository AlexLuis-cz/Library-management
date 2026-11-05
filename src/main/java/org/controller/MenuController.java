package org.controller;

import org.Utils.InputUtils;
import org.services.AddBook;
import org.services.LateFeeService;
import org.services.SearchService;

public class MenuController {
    private final AddBook addBook = new AddBook();
    private final LateFeeService lateFeeService = new LateFeeService();
    private final SearchService searchService = new SearchService();

    public void menuLibrary() {
        byte opt;
        do {
            System.out.println(InputUtils.showMenu());
            System.out.print("Option:");
            opt = InputUtils.returnByte();

            switch (opt) {
                case 0:
                    break;
                case 1:
                    addBook.addForLibrary();
                    break;
                case 2:
                    searchService.search();
                    break;

            }
        }while (opt != 0);
    }
}
