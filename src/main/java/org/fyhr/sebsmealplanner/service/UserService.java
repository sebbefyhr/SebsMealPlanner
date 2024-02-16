package org.fyhr.sebsmealplanner.service;

import org.fyhr.sebsmealplanner.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    User getUser(User user);
    User insertIntoDB(User user);
    List<User> getAllUsers();
}
