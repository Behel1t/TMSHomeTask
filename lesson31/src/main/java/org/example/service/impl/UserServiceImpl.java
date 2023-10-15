package org.example.service.impl;

import org.example.domain.User;
import org.example.service.UserService;
import org.example.web.UserNameEmptyException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void getUsers() {

    }

    @Override
    public void save(User user) throws UserNameEmptyException {
        String name= user.getName();
        if (name==null||name.isBlank()){
            throw new UserNameEmptyException();
        }
        if (name.equals("Admin")){
        System.out.println("Welcome Admin");
        }
        if (name.equals("User")){
            System.out.println("Welcome User");
        }
        if (name.equals("Support")){
            System.out.println("enter another role");
        }
        if (!name.equals("Admin")&&!name.equals("User")&&!name.equals("Support")){
            System.out.println("Invalid type of User");
        }

    }
}
