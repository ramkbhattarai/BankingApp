package com.rkb.bank;

public class CheckingAccount extends BankingAccount {
	private final int minimumBalance = 100;
	
	public CheckingAccount(long balance) {
		super();
		this.setBalance(balance);
		
	}
	
	public void deopsit(long amount) {
		long currentBalance = this.getBalance() + amount;
		this.setBalance(currentBalance);
	}
	
	public void withdraw(long amount) {
		if((this.getBalance() - this.minimumBalance) >= amount) {
			long currentBalance = this.getBalance() + amount;
			this.setBalance(currentBalance);
		}
	}

}
