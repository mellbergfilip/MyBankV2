package com.fm.mybank.menu;

import com.fm.mybank.bank.BankController;
import com.fm.mybank.service.BankServicesFacade;
import com.fm.mybank.util.ConsolePrinter;
import com.fm.mybank.util.InputSafetyChecker;

/*
 * Class that contains methods for logic and console print
 * in MoneyTransfer menu
 */
public class MoneyTransferMenu {


	/* Logic for MoneyTransfer menu
	 * Switch/Case Menu
	 */
	public void runMoneyTransferMenu(BankController bankController, BankServicesFacade bankServicesFacade) {

		int menuChoice = 0;

		while (menuChoice != 3) {
			printMenu2();
			menuChoice = InputSafetyChecker.readInt();
			ConsolePrinter.dottedLine();
			switch (menuChoice) {
			case 1:
				bankServicesFacade.depositMoney(bankController);
				break;
			case 2:
				bankServicesFacade.withdrawMoney(bankController);
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}

	// Method that prints out MoneyTransfer menu to console
	private void printMenu2() {
		System.out.println("------ TRANSFER MONEY ------");
		System.out.println("1. Deposit money ");
		System.out.println("2. Withdraw money");
		System.out.println("3. Go back to startmenu");
		System.out.print("Choice: ");
	}
}
