package com.sangtao.service;

import com.sangtao.model.Account;
import com.sangtao.model.AccountInfo;

public interface AccountService {
    AccountInfo getAccount(String accountId);
    int addAccount(Account account);
}
