package com.rkb.user;

import java.util.HashSet;
import java.util.Set;

import com.rkb.bank.Bank;

public class User {

	//Personal Information
	private String address;
	private String firstName;
	private String lastName;
	private String email;
	
	//Bank Information
	private Set<Integer> bankAccounts = new HashSet<>();
	private String[] userTransactions= new String[5];
	private int pin;
	private String userName;
	
	
	public User(String userName, String fname, String lname, String email, String address, int pinNo) {
		super();
		//this.userName = userName;
		this.setUserName(userName);
		Bank.userNames.add(userName);
		this.setFirstName(fname);
		this.setLastName(lname);
		this.setAddress(address);
		this.setPin(pinNo);
		this.setEmail(email);
		
	}
	
	// getters and setters for fields
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Integer> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(Set<Integer> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	public String[] getUserTransactions() {
		return userTransactions;
	}
	public void setUserTransactions(String[] userTransactions) {
		this.userTransactions = userTransactions;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}


