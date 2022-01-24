package com.company.bank;

//Расчетный может выполнять все три операции, но не может уходить в минус.
// TODO Дописать методы с использование токена

public class CheckingAccount extends Account{
    private int balance;
    private Boolean token = true;

    @Override
    public void pay(int summa) {
        if (summa>balance){
            System.out.println("Недостаточно среств на счету");
            token = false;
        }else {
            System.out.println("Операция прошла успешно баланс: " + this.balance + " Руб.");
             this.balance -= summa;
             token = true;
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount>this.balance){
            System.out.println("Недостаточно средсв на счете");
            token = false;
        }else {
            account.aadMany(amount);
            this.pay(amount);
            System.out.println("перевод завнершен");
            token = true;
        }

    }

    @Override
    public void aadMany(int amount) {
        this.balance += amount;
        System.out.println("Счет пополнен");
        token = true;
    }

    @Override
    public Boolean getToken() {
        return this.token;
    }

    public int getBalance() {
        return balance;
    }

    public CheckingAccount(int balance) {
        this.balance = balance;
    }

}
