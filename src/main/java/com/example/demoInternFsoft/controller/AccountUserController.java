package com.example.demoInternFsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoInternFsoft.model.AccountUser;
import com.example.demoInternFsoft.repo.AccountUserRepo;

@RestController
public class AccountUserController {

    @Autowired
    AccountUserRepo repo;

    @PostMapping("/addAccountUser")
    public void addAccountUser(@RequestBody AccountUser accountUser) {
        repo.save(accountUser);
    }
}
