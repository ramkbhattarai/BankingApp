package com.rkb.bank;

public class BankingAccount {
	// Instances properties or fields
		private int accountNumber;
		private double interestRate = 0.05;
		private double balance = 0.0;
		private static int startingNumberOfAccounts = 1000000;
		
	
		
		
		//constructors
		
		public BankingAccount() {
			super();
			accountNumber = startingNumberOfAccounts++;
		}
		
		// getters and setters for instances properties
		public int getAccountNumber() {
			return accountNumber;
		}
		
		public double getInterestRate() {
			return interestRate * 100;
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
		
		public void deposit(double amount) {
			if(amount  < 1) {
				System.out.println("You don't have suffucient amount to deposit");
				return;
			}
			checkInterest(amount);
			amount += amount * interestRate;
			balance += amount ;
			System.out.println("You have deposited $"+ amount + " with the interest Rate of " + interestRate * 100 + "%");
			System.out.println("Your current balance is $"+ balance);
		}
		
		

		public void withdraw(double amount) {
			if(amount + 5 > balance) {
				System.out.println("You don't have suffucient balance to withdraw that amount");
				return;
			}
			
			balance -= amount + 5;
			checkInterest(0);
			System.out.println("You have withdrawn $"+ amount + "with charge of $5");
			System.out.println("Your current balance is $"+ balance);
			
		} 
		
		public void checkInterest(double amount) {
			if(balance + amount > 10000) {
				interestRate = 0.05;
				
			}else {
				interestRate = 0.02;
			}
			
		}
		
		
		
}
