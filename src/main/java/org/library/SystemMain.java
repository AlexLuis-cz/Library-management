package org.library;

import org.controller.MenuController;
import org.models.Admin;
import org.services.AuthService;

public class SystemMain {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        AuthService authService = new AuthService();
        authService.create();
    }
}
