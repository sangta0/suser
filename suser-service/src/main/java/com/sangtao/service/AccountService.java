package com.sangtao.service;

import com.sangtao.model.Account;
import com.sangtao.model.AccountInfo;

public interface AccountService {
    AccountInfo getAccountInfo(String accountId);

    int addAccount(Account account);

    Account getAccount(String accountId);
}
