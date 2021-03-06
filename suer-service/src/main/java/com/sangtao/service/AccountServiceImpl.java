package com.sangtao.service;

import com.sangtao.dao.AccountInfoMapper;
import com.sangtao.dao.AccountMapper;
import com.sangtao.model.Account;
import com.sangtao.model.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountInfoMapper accountInfoMapper;
    @Autowired
    AccountMapper accountMapper;
    public AccountInfo getAccount(String accountId){
        AccountInfo account = accountInfoMapper.selectByPrimaryKey(accountId);
        return account;
    }
    public int addAccount(Account account){
        String uuid = UUID.randomUUID().toString();
        account.setAccountId(uuid);
        int i = accountMapper.insert(account);
        return i;
    }
}
