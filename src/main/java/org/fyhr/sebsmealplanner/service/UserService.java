package org.fyhr.sebsmealplanner.service;


import org.fyhr.sebsmealplanner.entities.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    public User getUser(User user);
    public User insertIntoDB(User user);
}
