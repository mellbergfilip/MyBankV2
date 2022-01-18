package com.fm.mybank.account;

/*
 * Model class that represent checking account
 * Subclass to BankAccount
 * Extends all methods & variables from BankAccount
 * Right now there is no difference from BankAccount
 * This was just to learn more about object-oriented
 * programming and Java
 */
public class CheckingAccount extends BankAccount {

	// Constructor that wants accountNr as parameter
	public CheckingAccount(String accountNr) {
		super();
		setAccountNr(accountNr);
	}

	/*
	 * Method that takes double as parameter, controls if double is >= 0, adding
	 * double to balance
	 */
	public void deposit(double sum) {
		if (sum >= 0) {
			balance = balance + sum;
		} else {
			throw new IllegalArgumentException("You can't deposit a negative sum.");
		}
	}

	/*
	 * Method that takes a double as parameter, controls if double is >= 0, taking
	 * double from balance
	 */
	public void withdraw(double sum) {
		if (sum >= 0) {
			balance = balance - sum;
		} else {
			throw new IllegalArgumentException("You can't withdraw a negative sum.");
		}
	}

	@Override
	public String toString() {
		return "\nType: Checking account" + "\nAccountnr: " + accountNr + "\nBalance: " + balance + " $\n";
	}

}
