package com.unejsi.aopdemo.dao;

import com.unejsi.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();
}
