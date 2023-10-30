package com.example.bankapp.controller;

import com.example.bankapp.model.Account;
import com.example.bankapp.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600, methods = {
                RequestMethod.OPTIONS,
                RequestMethod.GET,
                RequestMethod.PUT,
                RequestMethod.DELETE,
                RequestMethod.POST
        })
@RestController
@RequestMapping
public class AccountController {
    // import the AccountService class and the Account class
    private AccountService accountService;

    // create a constructor for the AccountController class and inject the AccountService class
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // create endpoint for /accounts
   //  @CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")
    @GetMapping("/accounts")
    public ResponseEntity<List> allAccounts() {
        return ResponseEntity.ok(accountService.getAllAccounts());
    }


    // create endpoint for /accounts/{accountId}
   @GetMapping("/accounts/{accountId}")
    public ResponseEntity<Account> getAccountById(@PathVariable String accountId) {
        // accountService.throwError();
        System.out.println(accountService.getAccountById(accountId)  + " " + accountId);
        return ResponseEntity.ok(accountService.getAccountById(accountId));
    }
/*
    // create endpoint to add a new account
    @PostMapping("/accounts")
    public ResponseEntity<Account> addAccount(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.addAccount(account));
    }

    // create endpoint to update an account
    @PutMapping("/accounts/{accountId}")
    public ResponseEntity<Account> updateAccount(@PathVariable String accountId, @RequestBody Account account) {
        // Use accountId to find and update the account
        return ResponseEntity.ok(accountService.updateAccount(accountId, account));
    }

    // create endpoint to delete an account
    @DeleteMapping("/accounts/{accountId}")
    public ResponseEntity<String> deleteAccount(@PathVariable String accountId) {
        accountService.deleteAccount(accountId);
        return ResponseEntity.ok("Account with ID: " + accountId + " has been deleted.");
    }
 */
}
