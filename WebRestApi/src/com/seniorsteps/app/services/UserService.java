package com.seniorsteps.app.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;

import com.seniorsteps.app.data.DummyDB;
import com.seniorsteps.app.model.Contact;
import com.seniorsteps.app.model.User;

public class UserService {
	public List<User> list(){	
		return new ArrayList<User>(DummyDB.userDB.values());
	}
	public User get(int userId){
		System.out.println(userId);
		System.out.println(DummyDB.userDB.get(userId).toString());
		return DummyDB.userDB.get(userId);
	}
	public User createUser() {
		List<Contact> contact = new ArrayList<Contact>();
		contact.add(new Contact(1,"Message 1"));
		contact.add(new Contact(2,"Message 2"));
		User user = new User(1,"Mariem","Ali",20,contact);
		return user;
	}
	public User add(User user){
		return DummyDB.userDB.put(6,user);
	}
	public User update(User user){
		 DummyDB.userDB.put(user.getUserId(),user);
		 return user;
	}
	public User remove(int userId){
		return DummyDB.userDB.remove(userId);
	}

}
