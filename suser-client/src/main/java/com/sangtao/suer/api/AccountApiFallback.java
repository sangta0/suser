package com.sangtao.suer.api;

import com.sangtao.suser.dto.AccountDto;
import org.springframework.stereotype.Component;

@Component
public class AccountApiFallback implements AccountApi {
    @Override
    public AccountDto getAccount(AccountDto accountDto) {
        return null;
    }

    @Override
    public String getAll() {
        return "error";
    }
}
