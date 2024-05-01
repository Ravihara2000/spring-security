package com.springsecurity.spring.security.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account")
@CrossOrigin
public class AccountController {

    @GetMapping("/my-account")
    public String getAccountDetails(){
        System.out.println("awa");
        return "here are the account details";
    }
}
