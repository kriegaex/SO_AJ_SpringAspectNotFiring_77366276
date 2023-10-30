package com.example.bankapp.service;

import com.example.bankapp.model.User;
import com.example.bankapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// create a service class which will be used to access the database by the controller - the controller
// should never access the database directly

@Service
public class UserService {
    // instantiate the userRepository class and create and object of it
    // the userRepository class is used to access the database
    // create a private field of the UserRepository class to be used in the UserService class
    private UserRepository userRepository;

    // create a constructor for the UserService class and inject the UserRepository class
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // database access methods
    // to get all users from database, create a method that returns a list of users
    public List<User> getAllUsers() {
        // get all movies from the database
        // the findAll() method is provided by the MongoRepository interface out of the box
        return userRepository.findAll();
    }

    // get a user by id from the database

    public User getUserById(String userId) {
        Optional<User> userOptional = userRepository.findById(userId);

        if (!userOptional.isPresent()) {
            // throw new AccountNotFoundException("User with ID: " + userId + " not found");
        }

        return userOptional.get();
    }


}
