package com.fdmgroup.AuthenticatedBackend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*") //Usually want to be more secure than this
public class UserController {

    @GetMapping("/")
    public String helloUserController(){
        return "User access level";
    }
    
}
