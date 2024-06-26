package com.springsecurity.spring.security.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account")
@CrossOrigin
public class AccountController {

    @GetMapping("/my-account")
    //@Secured("ROLE_ADMIN")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")//check at the beginning
    //@PostAuthorize("hasAnyAuthority('ROLE_ADMIN')")//check at the return
    public String getAccountDetails(){
        System.out.println("awa");
        return "here are the account details";
    }
}
