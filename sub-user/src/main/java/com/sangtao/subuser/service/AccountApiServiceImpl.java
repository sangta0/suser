package com.sangtao.subuser.service;



import com.sangtao.suer.api.AccountApi;
import com.sangtao.suser.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountApiServiceImpl implements AccountApiService{
    @Autowired
    AccountApi accountApi;
//    public AccountDto getAccount(AccountDto account){
//        return accountApi.getAccount(account);
//    }
    public String getAll(){
        System.out.println("yo ni jin lai le");
        return  accountApi.getAll();
    }
}
