package com.sangtao.controller.feign;

import com.sangtao.model.Account;
import com.sangtao.service.impl.AccountServiceEx;
import com.sangtao.suer.api.AccountApi;
import com.sangtao.suser.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/accountApi")
public class AccountFeignController implements AccountApi {
    @Autowired
    private AccountServiceEx accountServiceEx;
    @PostMapping("getAccount")
    public AccountDto getAccount(@RequestBody AccountDto accountDto) {
        Account account =accountServiceEx.getAccount(accountDto.getAccountId());
        accountDto.setAccountName(account.getAccountName());
        accountDto.setAccountId(account.getAccountId());
        accountDto.setUserAddress(account.getUserAddress());
        return accountDto;
    }
    @GetMapping("getAll")
    public String getAll(){

        return "getAll12";
    }
}
