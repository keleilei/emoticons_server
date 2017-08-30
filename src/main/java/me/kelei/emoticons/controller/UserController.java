package me.kelei.emoticons.controller;

import me.kelei.emoticons.entity.User;
import me.kelei.emoticons.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;


    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    public String save(User user) {
        return "";
    }

}
