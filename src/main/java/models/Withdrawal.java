package models;

import java.time.LocalDate;

/**
 *
 * @author Florent Crublé
 *
 * Cette classe définie un retrait bancaire
 *
 */
public class Withdrawal extends AccountStatement{

    public Withdrawal(LocalDate localDate, int amount, int balance) {
        super(localDate, amount, balance);
    }

    @Override
    public int proceed() {
        this.balance -= this.amount;
        return this.balance;
    }

    @Override
    public String print() {
        return localDate + ", -" + amount + ", balance=" + balance;
    }
}
