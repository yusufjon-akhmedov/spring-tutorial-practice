package com.yusufjon.aopdemo.dao;


import com.yusufjon.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();
}
