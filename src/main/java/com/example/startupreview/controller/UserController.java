package com.example.startupreview.controller;

import com.example.startupreview.beans.User;
import com.example.startupreview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return userService.createUser(user);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping ("/getuser/{id}")
    public Optional<User> getuser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/signin")
    public String signin(@RequestBody User user) {
        return userService.verifySignin(user);
    }

}
