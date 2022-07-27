package models;

import java.time.LocalDate;

/**
 *
 * @author Florent Crublé
 *
 * Cette classe définie un dépôt bancaire
 *
 */
public class Deposit extends AccountStatement{

    public Deposit(LocalDate localDate, int amount, int balance) {
        super(localDate, amount, balance);
    }

    @Override
    public int proceed() {
        this.balance += amount;
        return this.balance;
    }

    @Override
    public String print() {
        return localDate + ", +" + amount + ", balance=" + balance;
    }
}
