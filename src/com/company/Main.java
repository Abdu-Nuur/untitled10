package com.company;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(50000);
        account.deposit(20000);

        while (true) {
            account.withDraw(6000);
        }
    }
}
