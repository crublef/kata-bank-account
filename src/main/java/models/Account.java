package models;

import interfaces.IAccountStatement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private int balance;
    private final List<IAccountStatement> accountStatements;

    public Account(int balance) {
        this.balance = balance;
        this.accountStatements = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        IAccountStatement deposit = new Deposit(LocalDate.now(), amount, balance);
        this.balance = deposit.proceed();
        this.accountStatements.add(deposit);
    }

    public void withdraw(int amount) {
        IAccountStatement withdrawal = new Withdrawal(LocalDate.now(), amount, balance);
        this.balance = withdrawal.proceed();
        this.accountStatements.add(withdrawal);
    }

    public String printStatements() {
        StringBuilder stringBuilder = new StringBuilder();
        for (IAccountStatement accountStatement : accountStatements) {
            stringBuilder.append(accountStatement.print());
        }
        return stringBuilder.toString();
    }
}
