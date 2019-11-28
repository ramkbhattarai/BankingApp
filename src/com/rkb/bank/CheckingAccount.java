package com.rkb.bank;

public class CheckingAccount extends BankingAccount {
	private final int minimumBalance = 100;
	
	public CheckingAccount(long balance) {
		super();
		this.setBalance(balance);
		
	}
	
//	public void createCheckingAccount(long balance) {
//		if(this.minimumBalance < balance) {
//			this(balance);
//		}
//		
//	}

}
