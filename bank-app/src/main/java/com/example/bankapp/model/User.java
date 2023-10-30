package com.example.bankapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
// lombok annotation to create getters and setters - the lombok dependency helps to create fields, constructors, getters, setters, and toString methods with the @Data annotation
@AllArgsConstructor // lombok annotation to create a constructor with all the fields
@NoArgsConstructor // lombok annotation to create a constructor with no fields

@Document(collection = "users")

public class User {
  @Id
    private ObjectId id;
    private String name;
    private String username;
    private String password;

  public User(String name, String username, String password) {
    this.name = name;
    this.username = username;
    this.password = password;
  }

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
