package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private int balance;
    private final List<AccountStatement> accountStatements;

    public Account(int balance) {
        this.balance = balance;
        this.accountStatements = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        this.balance += amount;
        this.accountStatements.add(new AccountStatement(LocalDate.now(), amount, balance));
    }

    public void withdraw(int amount) {
        this.balance -= amount;
        this.accountStatements.add(new AccountStatement(LocalDate.now(), amount, balance));
    }

    public String printStatements() {
        StringBuilder stringBuilder = new StringBuilder();
        for (AccountStatement accountStatement : accountStatements) {
            stringBuilder.append(accountStatement.toString());
        }
        return stringBuilder.toString();
    }
}
