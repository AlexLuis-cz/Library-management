package org.services;


import org.repository.UserRepository;
import org.utils.InputUtils;
import org.models.AbstractUser;
import org.models.User;

public class AuthService {

    public void create() {
        System.out.print("User:");
        String userName = InputUtils.returnString();

        System.out.println("Password");
        String passWord = InputUtils.returnString();

        User user = new User(userName, passWord);
        boolean isHave = isHaveAcoount(user);

        if(isHave){
            System.out.println("user already exists");
            create();
        }
    }

    private boolean isHaveAcoount(AbstractUser abstractUser) {
        for(AbstractUser value : UserRepository.getUsers()) {
            if (value == null)return false;
            //admin
            if(abstractUser.getNameUser().equals(UserRepository.getADMIN().getNameUser()) && abstractUser.getPassword().equals(UserRepository.getADMIN().getPassword())){
                System.out.println("Usuario indisponivel");
                return true;
            }


            //user
            if(abstractUser.getNameUser().equals(value.getNameUser()) && abstractUser.getPassword().equals(value.getPassword())){
                System.out.println("Usuario indisponivel");
                return true;
            }
        }
        return false;
    }
}
