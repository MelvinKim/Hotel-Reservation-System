package com.melvinkimathi.microservices.hotelcatalogservice.controller;

import com.melvinkimathi.microservices.hotelcatalogservice.entity.Room;
import com.melvinkimathi.microservices.hotelcatalogservice.entity.User;
import com.melvinkimathi.microservices.hotelcatalogservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    public UserController(UserService theUserService) {
        this.userService = theUserService;
    }

    //get all users
    @GetMapping("/users")
    public List<User> listUsers() {
        return userService.findAll();
    }

    //save/update a user
    @PostMapping("/users")
    public User createUser(@RequestBody User theUser) {
        return userService.save(theUser);
    }

    //get a specific user
    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {
        return userService.findById(userId);
    }

    //delete a specific user
    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteById(userId);
    }

}
