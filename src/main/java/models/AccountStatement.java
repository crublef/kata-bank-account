package models;

import interfaces.IAccountStatement;

import java.time.LocalDate;

/**
 * 
 * @author Florent Crublé
 * 
 *         Cette classe définie un enregistrement d'un opération bancaire
 *
 */
public abstract class AccountStatement implements IAccountStatement {

	protected LocalDate localDate;
	protected int amount;

	protected int balance;

	protected AccountStatement(LocalDate localDate, int amount, int balance) {
		this.localDate = localDate;
		this.amount = amount;
		this.balance = balance;
	}
}
