package com.sangtao.dao;

import com.sangtao.model.AccountInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account_info
     *
     * @mbg.generated Fri Nov 29 11:17:43 CST 2019
     */
    int deleteByPrimaryKey(String subAccountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account_info
     *
     * @mbg.generated Fri Nov 29 11:17:43 CST 2019
     */
    int insert(AccountInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account_info
     *
     * @mbg.generated Fri Nov 29 11:17:43 CST 2019
     */
    AccountInfo selectByPrimaryKey(String subAccountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account_info
     *
     * @mbg.generated Fri Nov 29 11:17:43 CST 2019
     */
    List<AccountInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account_info
     *
     * @mbg.generated Fri Nov 29 11:17:43 CST 2019
     */
    int updateByPrimaryKey(AccountInfo record);
}