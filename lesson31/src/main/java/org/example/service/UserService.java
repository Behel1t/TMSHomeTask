package org.example.service;

import org.example.domain.User;
import org.example.web.UserNameEmptyException;

public interface UserService {
 void getUsers();

    void save(User user) throws UserNameEmptyException;
}
