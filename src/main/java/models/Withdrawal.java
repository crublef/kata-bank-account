package models;

import java.time.LocalDate;

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
        return "date=" + localDate +
                ", amount= -" + amount +
                ", balance=" + balance;
    }
}
