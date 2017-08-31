package me.kelei.emoticons.controller;

import me.kelei.emoticons.entity.User;
import me.kelei.emoticons.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;


    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public String save(@ModelAttribute User user) {
        return userService.save(user);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId){
        User user = new User();
        user.setId(userId);
        return user;
    }

}
