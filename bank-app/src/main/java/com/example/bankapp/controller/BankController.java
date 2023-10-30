package com.example.bankapp.controller;

import com.example.bankapp.model.User;
import com.example.bankapp.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// requests are handled by controllers
@RestController
@RequestMapping()
public class BankController {
    // import the UserService class
    private UserService userService;

    // create a constructor for the BankController class and inject the UserService class
    public BankController(UserService userService) {
        this.userService = userService;
    }

    // create endpoint for /users
    @GetMapping("/users")
    public ResponseEntity<List> allUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

//    @GetMapping("/users/{id}")
//    public ResponseEntity getUser(@PathVariable String id){
//        userService.throwError();
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

    // create endpoint for / - which is a test endpoint
    @GetMapping("/")
    public String hello() {
        return "Controller test";
    }

    // create endpoint for /users/{userId} - get a user by id
    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getAccountById(@PathVariable String userId) {
        // userService.throwError();
        System.out.println(userId + "" + ResponseEntity.ok(userService.getUserById(userId)).getBody());
        return ResponseEntity.ok(userService.getUserById(userId));
    }
}


