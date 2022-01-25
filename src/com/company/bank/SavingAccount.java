package com.company.bank;

//Со сберегательного счета нельзя платить, только переводить и пополнять.
//Также сберегательный не может уходить в минус.
// ВСЕ

public class SavingAccount extends Account{
    private int balance;
    private boolean token;

    public SavingAccount(int balance) {
        this.balance = balance;
        token = true;
    }

    @Override
    public void pay(int summa) {
        System.out.println("Опереция недоступна");
        token = false;
    }

    @Override
    public void transfer(Account account, int amount) {
        if ((balance+amount) >0) {
            System.out.println("Зачисление средств невозможно, уменьшите сумму на " + (balance+amount) + " Руб.");
            token = false;
        }else {
            this.balance += amount;
            System.out.println("Баланс пополнен");
            token = true;
        }

    }

    @Override
    public void aadMany(int amount) {
        System.out.println("Счет пополнен");
        this.balance += amount;
        token = true;
    }

    @Override
    public Boolean getToken() {
        return token;
    }

    public int getBalance() {
        return balance;
    }

}
