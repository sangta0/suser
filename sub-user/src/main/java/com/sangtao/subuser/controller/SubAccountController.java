package com.sangtao.subuser.controller;

import com.sangtao.subuser.service.AccountApiService;
import com.sangtao.suser.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/subAccount")
public class SubAccountController {
    @Autowired
    AccountApiService accountApiService;
//    @GetMapping("/getAccount")
//    public AccountDto getAccount(@RequestParam String accountId) {
//        AccountDto accountDto = new AccountDto();
//        accountDto.setAccountId(accountId);
//        return accountApiService.getAll(accountDto);
//    }
    @GetMapping("/getAll")
    public String getAll(){
        System.out.println("yo wo jin lai le");
        return accountApiService.getAll();
    }
}
