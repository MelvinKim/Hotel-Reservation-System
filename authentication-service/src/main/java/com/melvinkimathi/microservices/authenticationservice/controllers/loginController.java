package com.melvinkimathi.microservices.authenticationservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class loginController {

    @GetMapping("/hello")
    public String welcomePage() {
        return "Hello, welcome to Spring boot :)";
    }
}
