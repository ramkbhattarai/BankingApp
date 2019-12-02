package com.rkb.user;


import com.rkb.bank.BankingAccount;

public class User {

	private String fname;
	private String lname;
	private String pin;
	private BankingAccount account;

	//Personal Information
	
	

	
	public User(String fname, String lname, String pin2, BankingAccount account) {
		this.fname = fname;
		this.lname = lname;
		this.pin = pin2;
		this.account = account;
	}

	
	
	@Override
	public String toString() {
		return "Name: " + fname + " " + lname + "\n"
				+ "PIN: " + pin + "\n" +
				account; // we can simply write account because it will call toString method of bankingAccount and keep it over here.
	}
	
	public BankingAccount getAccount() {
		return account;
	}
	
	
}


