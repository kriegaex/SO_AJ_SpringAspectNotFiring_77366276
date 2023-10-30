package com.example.bankapp.repository;

import com.example.bankapp.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// create a repository interface that extends the MongoRepository interface
// the MongoRepository interface provides methods for performing CRUD operations on the database
// it takes two parameters: the model class and the type of the id field

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
    Optional<User> findById(String userId);
}
