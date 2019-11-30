package com.rkb.bank;

public class CheckingAccount extends BankingAccount {
	private final int minimumBalance = 100;
	
	public CheckingAccount(double balance) {
		super();
		this.setBalance(balance);
		
	}
	
	public void deopsit(double amount) {
		double currentBalance = this.getBalance() + amount;
		this.setBalance(currentBalance);
	}
	
	public void withdraw(double amount) {
		if((this.getBalance() - this.minimumBalance) >= amount) {
			double currentBalance = this.getBalance() + amount;
			this.setBalance(currentBalance);
		}
	}

}
