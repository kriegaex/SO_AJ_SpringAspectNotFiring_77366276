package com.example.bankapp.repository;

import com.example.bankapp.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AccountRepository {

    public Optional<Account> findById(String accountId) {
        return Optional.empty();
    }


    public List<Account> findAll() {
        return null;
    }
}
