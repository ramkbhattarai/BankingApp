package com.rkb.bank;

public class BankingAccount {
	// Instances properties or fields
		private int accountNumber;
		private double interestRate;
		private long balance;
		private int minimumBalance;
		private String[] transactionHistory;
		
		
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
		public long getBalance() {
			return balance;
		}
		public void setBalance(long balance) {
			this.balance = balance;
		}
		public int getMinimumBalance() {
			return minimumBalance;
		}
		public void setMinimumBalance(int minimumBalance) {
			this.minimumBalance = minimumBalance;
		}
		public String[] getTransactionHistory() {
			return transactionHistory;
		}
		public void setTransactionHistory(String[] transactionHistory) {
			this.transactionHistory = transactionHistory;
		}
		
}
