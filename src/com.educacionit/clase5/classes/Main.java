package com.educacionit.clase5.classes;

public class Main {

    public static void main(String[] args) {
        Account johnAccount = new Account("A00001", "John Coleman");
        johnAccount.setBalance(1_000_000.0d);

        johnAccount.deposit(100_000.0d);
        johnAccount.withdrawal(100.0d);
        johnAccount.withdrawal(2_000_000.0d);
    }
}
