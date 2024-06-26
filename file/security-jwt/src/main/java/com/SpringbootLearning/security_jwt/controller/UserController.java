package com.SpringbootLearning.security_jwt.controller;

import com.SpringbootLearning.security_jwt.entity.User;
import com.SpringbootLearning.security_jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping({"register-new-user"})
    public User registerNewUser(@RequestBody User user){
     return userService.RegisterNewUser(user);
    }

    @PostConstruct
    public void initRoleAndUser(){
        userService.initRoleAndUser();
    }

    @GetMapping({"for-admin"})
    public String forAdmin(){
        return "This url is only accessible for admin";
    }

    @GetMapping({"for-user"})
    public String forUser(){
        return "This url is only accessible for user";
    }
}
