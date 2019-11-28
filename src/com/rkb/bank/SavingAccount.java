package com.rkb.bank;

public class SavingAccount extends BankingAccount{
	private final int minimumBalance = 1000;
	
	public SavingAccount(long balance) {
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
