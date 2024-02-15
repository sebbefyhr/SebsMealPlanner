package org.fyhr.sebsmealplanner.controllers;


import org.fyhr.sebsmealplanner.entities.User;
import org.fyhr.sebsmealplanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/getUser")
    public User getUser(@RequestBody User user){
        return userService.getUser(user);
    }

    @PutMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.insertIntoDB(user);
    }
}
