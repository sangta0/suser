package com.sangtao.subuser.feign;

import com.sangtao.suser.dto.AccountDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "suser")
public interface AccountApi {
    /**
     * 获取账户信息
     * @return
     */
//    @GetMapping(value = "/feign/getAccount")
//    AccountDto getAccount(AccountDto accountDto);
    @GetMapping(value = "/getAll")
    String getAll();
}
