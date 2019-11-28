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
	public String getAddress() {
		return address;
	}
	
	public User(String userName) {
		super();
		this.userName = userName;
	}
	
	// getters and setters for fields
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


