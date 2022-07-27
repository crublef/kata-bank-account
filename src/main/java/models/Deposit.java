package models;

import java.time.LocalDate;

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
        return "date=" + localDate +
                ", amount= +" + amount +
                ", balance=" + balance;
    }
}
