package com.rkb.bank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bank {
	

	public static Set<String> userNames = new HashSet<>();
	
	
	public static void welcomeMessage() {
		System.out.println("Welcome To Ram_John_Ryan Bank");
		System.out.println("Are you a New Client or Existing Client?");
		System.out.println("If you are New Client Please type \"New\"");
		System.out.println("IF you are Existing Client. Please press any key.");
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
			//createUser(fname, lname, email, address, pinNo, userName);
		
	}
	
	public static void main(String[] args) {
		welcomeMessage();
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		if(input.toLowerCase().equals("new")){
			System.out.println("Oh We have some form to fill out to set up your account.");
			fillForm();
		}else {
			
		}
	}

}
