package com.rkb.bank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.rkb.user.User;

public class Bank {
	

	public static Set<String> userNames = new HashSet<>();
	public static Map<String, User> users = new HashMap<String, User>();
	
	
	public static void welcomeMessage() {
		System.out.println("Welcome To Ram_John_Ryan Bank");
		System.out.println("Are you a New Client or Existing Client?");
		System.out.println("If you are New Client Please type \"New\"");
		System.out.println("IF you are Existing Client. Please press any key.");
	}
	
	public static void giveChoices(User user) {
		System.out.println("Do you want to deposit or withdraw or transfer or exit?");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter \"deposit\" to deposit, \"withdraw\" to withdraw, \"transfer\" to transfer and \"exit\" to exit");
		String input = scan.next();
		if(input.equals("deposit")) {
			System.out.println("Enter the type of account \"Checking or Saving\" to deposit.");
			
			
		}else if (input.equals("withdraw")){
			System.out.println("Enter the type of account \"Checking or Saving\" to withdraw from.");
		}else if(input.equals("transfer")) {
			System.out.println("Enter the account number that you want to transfer from");
			System.out.println("Enter the account number that you want to transfer to.");
		}else if(input.equals("exit")) {
			System.out.println("Thank you for Banking with us.");
		}
	}
	
	public static void createUser(String fname, String lname, String email, String address, String userName, int pinNo) {
		
		User user = new User(userName, fname, lname, email, address, pinNo);
		users.put(userName, user);
		giveChoices(user);
	}
	
	public static void fillForm() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the your UserName: ");
		String userName = scan.next();
		while(userNames.contains(userName)) {
			System.out.println("This user name already exists so please select different user name:");
			userName = scan.next();
		}
		
			System.out.println("Enter the your First Name: ");
			String fname = scan.next();
			System.out.println("Enter the your Last Name: ");
			String lname = scan.next();
			System.out.println("Enter the your address: ");
			String address = scan.next();
			System.out.println("Enter the your email: ");
			String email = scan.next();
			System.out.println("Enter the your PIN Number: ");
			int pinNo = scan.nextInt();
			createUser(fname, lname, email, address,userName, pinNo);
			
		
	}
	
	public static boolean checkUserNameAndPinNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your user name: ");
		String input = scan.next();
		System.out.println("Enter your pin number: ");
		int pinNo = scan.nextInt();
		return userNames.contains(input) && users.get(input).getPin() == pinNo;
		
	}
	
	public static void main(String[] args) {
		welcomeMessage();
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		if(input.toLowerCase().equals("new")){
			System.out.println("Oh We have some form to fill out to set up your account.");
			fillForm();
		}else {
			
			if(checkUserNameAndPinNumber()) {
				
			}else {
				System.out.println("User Name and Pin Number doesn't match.");
			}
		}
	}

}
