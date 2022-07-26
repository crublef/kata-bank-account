package services;

import models.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountServiceTest {

    private final AccountService accountService = new AccountService();

    private Account account;

    @Before
    public void init() {
        account = accountService.create();
    }

    @Test
    public void should_deposit_one_amount_in_my_account() {
        // Test
        accountService.deposit(account,1000);
        //Assert
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void should_deposit_multiple_amount_in_my_account() {
        // Test
        accountService.deposit(account,1000);
        accountService.deposit(account,500);

        //Assert
        assertEquals(1500, account.getBalance());
    }
}