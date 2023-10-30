package com.example.bankapp.service;

import com.example.bankapp.model.Account;
import com.example.bankapp.repository.AccountRepository;
import com.projects.errorhandling.annotation.ExceptionAnnotation;
import com.projects.errorhandling.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // return all accounts
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    // return an account by ID
    @ExceptionAnnotation
    public Account getAccountById(String accountId) {
        Optional<Account> accountOptional = accountRepository.findById(accountId);

        if (!accountOptional.isPresent()) {
            throw new ResourceNotFoundException("Account with ID: " + accountId + " not found", null);
        }

        return accountOptional.get();
    }
}

/*
// add a new account
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    // update an account
    public Account updateAccount(String accountId, Account accountDetails) {
        Optional<Account> accountOptional = accountRepository.findById(new ObjectId(accountId));

        if (!accountOptional.isPresent()) {
            throw new AccountNotFoundException("Account with ID: " + accountId + " not found");
        }

        Account existingAccount = accountOptional.get();

        // Update the necessary fields
        existingAccount.setBankBalance(accountDetails.getBankBalance());
            // existingAccount.setAccountType(accountDetails.getAccountType()); or/and any other fields ...

        System.out.println("Account updated successfully: " + existingAccount);

        return accountRepository.save(existingAccount);
    }

    // delete an account
    public void deleteAccount(String accountId) {
        Optional<Account> accountOptional = accountRepository.findById(new ObjectId(accountId));

        if (!accountOptional.isPresent()) {
            throw new AccountNotFoundException("Account with ID: " + accountId + " not found");
        }

        accountRepository.deleteById(new ObjectId(accountId));
    }

 */