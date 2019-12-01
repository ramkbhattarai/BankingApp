package com.rkb.bank;

import java.util.ArrayList;

import com.rkb.user.User;

public class Bank {
	
	ArrayList<User> users = new ArrayList<User>();

	public void add(User user) {
		users.add(user);
		
	}

	public User getUser(int index) {
		return users.get(index);
	}
	

	public ArrayList<User> getUsers() {
		return users;
	}

}
