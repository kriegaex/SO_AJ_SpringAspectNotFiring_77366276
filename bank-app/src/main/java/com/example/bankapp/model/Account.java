package com.example.bankapp.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "accounts")
public class Account {
    @Id
    private ObjectId id;
    private ObjectId user_id;
    private int bankBalance;
    private String accountNumber;
    private String sortCode;

    public Account(ObjectId user_id, int bankBalance, String accountNumber, String sortCode) {
        this.user_id = user_id;
        this.bankBalance = bankBalance;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    // because of lombok @Data annotation, we don't need to write getters and setters
}
