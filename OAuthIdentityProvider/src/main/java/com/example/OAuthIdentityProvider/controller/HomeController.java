package com.example.OAuthIdentityProvider.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home(@AuthenticationPrincipal UserDetails user) {
        return "Welcome " + user.getUsername() + "! You have successfully logged in.";
    }
}