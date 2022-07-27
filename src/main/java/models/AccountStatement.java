package models;

import java.time.LocalDate;

/**
 * 
 * @author Florent Crublé
 * 
 *         Cette classe définie un enregistrement d'un opération bancaire
 *
 */
public class AccountStatement {

	private final LocalDate date;
	private final int amount;
	private final int balance;

	public AccountStatement(LocalDate date, int amount, int balance) {
		this.date = date;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "date=" + date +
				", amount=" + amount +
				", balance=" + balance;
	}
}
