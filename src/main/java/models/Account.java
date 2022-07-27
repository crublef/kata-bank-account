package models;

import interfaces.IAccountStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Florent Crublé
 *
 * Cette classe définie un compte bancaire
 *
 */
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

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<IAccountStatement> getAccountStatements() {
        return accountStatements;
    }

    public void addStatement(IAccountStatement statement) {
        this.accountStatements.add(statement);
    }
}
