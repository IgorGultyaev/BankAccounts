package com.company.bank;

//Кредитный не может иметь положительный баланс – если платить с него,
// то уходит в минус, чтобы вернуть в 0, надо пополнить его.
// TODO Дописать методы с использование токена

public class CreditAccount extends Account{
    private int balance;
    private Boolean token = true;

    public CreditAccount(int balance) {
        this.balance = balance;
        token = true;
    }

    @Override
    public void pay(int summa) {
            System.out.println("Операция прошла успешно баланс: " + this.balance + " Руб.");
            this.balance -= summa;
            token = true;
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Орерация недоступна");
    }

    @Override
    public void aadMany(int amount) {
        if ((this.balance+amount) >0) {
            System.out.println("Зачисление средств невозможно, уменьшите сумму на " + (balance+amount) + " Руб.");
            token = true;
        }else {
            this.balance += amount;
            System.out.println("Баланс пополнен");
            token = true;
        }

    }

    @Override
    public Boolean getToken() {
        return token;
    }

    public int getBalance() {
        return balance;
    }

}
