package org.repository;

import org.models.Admin;
import org.models.User;

public class UserRepository {
    private static User[] users;
    private static Admin ADMIN;

    public static void setAdmin(Admin admin){
       ADMIN = admin;
    }

    public static User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        users = users;
    }

    public static Admin getADMIN() {
        return ADMIN;
    }

    public static void setADMIN(Admin ADMIN) {
        UserRepository.ADMIN = ADMIN;
    }
}
