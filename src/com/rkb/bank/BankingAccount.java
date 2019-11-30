package com.rkb.bank;

public class BankingAccount {
	// Instances properties or fields
		private int accountNumber;
		private double interestRate;
		private double balance;
		
	
		
		
		//constructors
		
		public BankingAccount() {
			super();
		}
		
		// getters and setters for instances properties
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public double getInterestRate() {
			return interestRate;
		}
		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		
		
}
