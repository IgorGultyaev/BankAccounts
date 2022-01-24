package com.company;

import com.company.bank.CheckingAccount;
import com.company.bank.CreditAccount;
import com.company.bank.SavingAccount;

public class Main {

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(100_000);
        CreditAccount creditAccount = new CreditAccount(-50_000);
        SavingAccount savingAccount = new SavingAccount(10_000);

        System.out.println("Баланс расчетного счета");
        System.out.println(checkingAccount.getBalance());
        System.out.println("Оплтим 1 000 000");
        checkingAccount.pay(1_000_000);
        System.out.println(checkingAccount.getBalance());
        System.out.println("Оплтим 100000");
        checkingAccount.pay(100000);
        System.out.println(checkingAccount.getBalance());
        System.out.println("Оплтим 100000");
        checkingAccount.transfer(creditAccount,1_000_000);
        System.out.println(checkingAccount.getBalance());


    }
}
