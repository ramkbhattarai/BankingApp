package com.rkb.user;

import java.util.Scanner;

import com.rkb.bank.Bank;
import com.rkb.bank.BankingAccount;
import com.rkb.bank.CheckingAccount;
import com.rkb.bank.SavingAccount;

public class Start {
	
	Scanner scan = new Scanner(System.in);
	Bank bank = new Bank();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void run() {
		printWelcomeMessage();
		printChoices();
		int choice = getChoice();
		performAction(choice);
	}

	private void performAction(int choice) {
		switch(choice) {
		case 1: 
			 createAccount();
			break;
		case 2:
			// deposit(long amount); to an existing account
			break;
		case 3:
			// withdraw(long amount); from an existing account
			break;
		case 4:
			// transfer(long amount, BanckingAccount account); 
			break;
		case 5:
			// printTransactions();
			break;
		case 6:
			System.out.println("Thanking you for visting our app.");
			System.exit(0); // this is the way to exit out of the application
			break;
		default:
			System.out.println("We don't have the choice that you have entered.");
			break;
		}
		
	}

	private void createAccount() {
		String fname, lname, pin, accountType = "";
		double deposit = 0.0;
		boolean check = false;
		while(!check) {
			System.out.println("Please enter which type of account you want to create: Checking or Saving ");
			accountType = scan.nextLine();
			if(accountType.equalsIgnoreCase("checking") || accountType.equalsIgnoreCase("saving")) {
				check = true;
			}else {
				System.out.println("Please type Checking or Saving ");
			}
			
		}
		
		System.out.println("Enter the your First Name: ");
		 fname = scan.nextLine();
		System.out.println("Enter the your Last Name: ");
		 lname = scan.nextLine();
		System.out.println("Enter the pin number you like to keep: ");
		 pin = scan.nextLine();
		 
		 boolean valid = false;
		 while(!valid) {
			 System.out.println("Enter the your initial deposit ");
			 try {
				 
				 deposit = Double.parseDouble(scan.nextLine());
			 }
			 catch(NumberFormatException e) {
				 System.out.println("Deposit should be the number");
			 }
			 
			 if(accountType.equalsIgnoreCase("checking") ) {
				 if(deposit < 100) {
					 System.out.println("Minimum balance for checking account must be $100.");
				 }else {
					 valid = true;
				 }
			 }else  if(accountType.equalsIgnoreCase("saving") ) {
				 if(deposit < 1500) {
					 System.out.println("Minimum balance for checking account must be $1500.");
				 }else {
					 valid = true;
				 }
			 }
		 }
		 
		 // by now we have checked every case so its type to open banking account
		 BankingAccount account;
		 if(accountType.equalsIgnoreCase("checking")) {
			 account = new CheckingAccount(deposit);
		 }else {
			 account = new SavingAccount(deposit);
		 }
		
		
	}

	private int getChoice() {
		int choice = -1;
		do {
			System.out.println("Enter numbers that you wish to do or is of your choice");
			try {
				choice = Integer.parseInt(scan.nextLine());
			}
			catch (NumberFormatException e){
				System.out.println("INVALID ENTRY PLEASE PASS A NUMBER");
			}
			if(choice < 1 || choice > 6) {
				System.out.println("Please select 1 to 6 only");
			}
			
		}while(choice < 1 || choice > 6);
		return choice;
	}

	private void printChoices() {
		System.out.println("Please select one of the following: ");
		System.out.println("1: To create a new Banking Account");
		System.out.println("2: To make a deposit in existing account");
		System.out.println("3: To make a withdrawal from existing account");
		System.out.println("4: To transfer balance from one account to another account");
		System.out.println("5: To see the transaction history.");
		System.out.println("6: To exit");
		
	}

	private void printWelcomeMessage() {
		
		System.out.println("|--------------------------|");
		System.out.println("|**************************|");
		System.out.println("|*    Welcome To RJR      *|");
		System.out.println("|*      Banking App       *|");
		System.out.println("|**************************|");
		System.out.println("|--------------------------|");
	
	}
}
