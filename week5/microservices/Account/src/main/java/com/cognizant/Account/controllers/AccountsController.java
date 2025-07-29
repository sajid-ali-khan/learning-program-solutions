package com.cognizant.Account.controllers;

import com.cognizant.Account.models.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @GetMapping("/account/{number}")
    public Account getAccount(String number){
        return new Account("8019340863", "Svings", 1234.9);
    }
}
