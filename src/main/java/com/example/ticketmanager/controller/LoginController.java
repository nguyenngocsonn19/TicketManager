package com.example.ticketmanager.controller;

import com.example.ticketmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    private final UserService userService;

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
    return "fancy-login";

}

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }
@GetMapping("/access-denied")
    public String accessDenied(){
    return "access-denied";
}

}
