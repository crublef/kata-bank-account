package services;

import models.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void should_create_new_account_with_initialize_amount() {
        // Test
        Account account = new Account(1000);

        //Assert
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void should_add_new_deposit_in_my_account() {
        // Test
        Account account = new Account(1000);
        account.deposit(500);

        //Assert
        assertEquals(1500, account.getBalance());
    }
}
