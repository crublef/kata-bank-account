package services;

import interfaces.IAccountStatement;
import models.Account;
import models.Deposit;
import models.Withdrawal;

import java.time.LocalDate;

/**
 *
 * @author Florent Crublé
 *
 * Ce Service permet les opérations bancaires d'un compte ainsi que d'afficher son historique
 *
 */
public class AccountService {

    public Account create() {
        return new Account(0);
    }

    public void deposit(Account account, int amount) {
        IAccountStatement deposit = new Deposit(LocalDate.now(), amount, account.getBalance());
        account.setBalance(deposit.proceed());
        account.addStatement(deposit);
    }

    public void withdraw(Account account, int amount) {
        IAccountStatement withdrawal = new Withdrawal(LocalDate.now(), amount, account.getBalance());
        account.setBalance(withdrawal.proceed());
        account.addStatement(withdrawal);
    }

    public String printStatements(Account account) {
        StringBuilder stringBuilder = new StringBuilder();
        for (IAccountStatement accountStatement : account.getAccountStatements()) {
            stringBuilder.append(accountStatement.print());
            stringBuilder.append(System.getProperty("line.separator"));
        }
        return stringBuilder.toString();
    }
}
