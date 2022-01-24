package com.company.bank;

public abstract class Account {
    public abstract void pay (int summa);
    public abstract void transfer(Account account, int amount);
    public abstract void aadMany(int amount);
    public abstract Boolean getToken();

}

