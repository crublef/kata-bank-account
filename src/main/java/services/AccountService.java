package services;

import models.Account;

public class AccountService {

    public Account create() {
        return new Account(0);
    }

    public void deposit(Account account, int amount) {
        account.deposit(amount);
    }
}
