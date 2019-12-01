package com.sangtao.controller;

import com.sangtao.model.Account;
import com.sangtao.model.AccountInfo;
import com.sangtao.service.impl.AccountServiceEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountServiceEx accountServiceEx;

    @GetMapping("/getAccount")
    public AccountInfo getAccount(@RequestParam String accountId){
        return accountServiceEx.getAccount(accountId);
    }

    @PostMapping("/addAccount")
    public int addAccount(@RequestBody Account account){
        return accountServiceEx.addAccount(account);
    }
}
