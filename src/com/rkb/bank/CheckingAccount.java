package com.rkb.bank;

public class CheckingAccount extends BankingAccount {
	//private final int minimumBalance = 100;
	private String accountType = "Checking";
	
	public CheckingAccount(double balance) {
		super();
		this.setBalance(balance);
		this.checkInterest(0);
//		if(balance > 10000) {
//			this.setInterestRate(0.05);
//		}else {
//			this.setInterestRate(0.02);
//		}
		
	}

	@Override
	public String toString() {
		return "Account Type: " + this.accountType + "\n"
				+ "Account Number: " + this.getAccountNumber() + "\n"
				+ "Balance: " + this.getBalance()+ "\n"
				+ "InterestRate: " + this.getInterestRate() + "\n";
	}
//	public void deopsit(double amount) {
//		double currentBalance = this.getBalance() + amount;
//		this.setBalance(currentBalance);
//	}
//	
//	public void withdraw(double amount) {
//		if((this.getBalance() - this.minimumBalance) >= amount) {
//			double currentBalance = this.getBalance() - amount;
//			this.setBalance(currentBalance);
//		}
//	}

}
