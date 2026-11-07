package org.models;

import org.repository.UserRepository;

public final class Admin extends AbstractUser{

    public Admin() {
        super("Admin","Admin123");
        UserRepository.setAdmin(this);
    }

}
