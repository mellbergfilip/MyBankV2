package com.fm.mybank.bank;

import com.fm.mybank.service.AccountRegistrationService;
import com.fm.mybank.service.ClientRegistrationService;
import com.fm.mybank.service.MoneyTransferService;

/*
 * Facade class to reach and hide logic
 * from the service classes
 * Contains all methods from service classes
 * Facade - design pattern
 */
public class BankServicesFacade {

	// Create objects from all service classes
	AccountRegistrationService accountRegService = new AccountRegistrationService();
	ClientRegistrationService clientRegService = new ClientRegistrationService();
	MoneyTransferService moneyTransferService = new MoneyTransferService();
	
	public void regClient(BankController bankController) {
		clientRegService.regClient(bankController);
	}
	
	public void regAccount(BankController bankController) {
		accountRegService.regAccount(bankController);
	}
	
	public void depositMoney(BankController bankController) {
		moneyTransferService.deposit(bankController);
	}
	
	public void withdrawMoney(BankController bankController) {
		moneyTransferService.withdraw(bankController);
	}
	
	
}
