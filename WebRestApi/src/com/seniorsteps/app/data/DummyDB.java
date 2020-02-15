package com.seniorsteps.app.data;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

import com.seniorsteps.app.model.Contact;
import com.seniorsteps.app.model.User;


public class DummyDB {

	public static Map<Integer,User> userDB = new HashMap<Integer, User>();
	static {
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(new Contact(1,"Message 1"));
		contacts.add(new Contact(2,"Message 2"));
		contacts.add(new Contact(3,"Message 3"));
		contacts.add(new Contact(4,"Message 4"));

		userDB.put(1, new User(1,"Ahmed","Ali",25,contacts));
		userDB.put(2, new User(2,"Omar","Ibrahim",22,contacts));
		userDB.put(3, new User(3,"Mohamed","Ali",24,contacts));
		userDB.put(4, new User(4,"Zein","Momoud",21,contacts));
		userDB.put(5, new User(5,"Mostafa","Kariem",23,contacts));
	}
	
}