package com.revature.drivers;

import java.util.Scanner;

import com.revature.models.User;
import com.revature.services.UserService;
import com.revature.services.UserServiceImpl;

public class UserDriver {

	// This instance will be used to make service calls to our lower layers of our application.
	// AKA handling business logic of our application.
	public static UserService userService = new UserServiceImpl();
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome User! Please register for our app");
		
		User target = registerUser();
		
		char answer = in.next().toLowerCase().charAt(0);
		
		while(answer != 'y') {
			target = registerUser(); // Recursion
			answer = in.next().toLowerCase().charAt(0);
		}
		
		in.close();
		
		userService.addUser(target);
		
		System.out.println("-------------------");
		
		System.out.println(userService.getUserById(2));
	}
	
	public static User registerUser() {
		
		System.out.println("Please provide an id number: ");
		int id = in.nextInt();
		
		System.out.println("Please provide a username: ");
		String username = in.next();
		
		System.out.println("Please provide a password: ");
		String password = in.next();
		
		System.out.println("Please provide a first name: ");
		String firstName = in.next();
		
		System.out.println("Please provide a last name: ");
		String lastName = in.next();
		
		System.out.println("Please provide an email: ");
		String email = in.next();
		
		System.out.print(String.format("ID: %d\nUsername: %s\nPassword: %s\nFirst Name: %s\nLast Name: %s\nEmail: %s\nIs this information correct:",
				id,
				username, 
				password,
				firstName,
				lastName,
				email));
		
		return new User(id, username, password, firstName, lastName, email);
		
	}

}
