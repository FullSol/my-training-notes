package com.revature.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.revature.exceptions.CustomFileException;
import com.revature.models.User;

public class UserServiceImpl implements UserService {

	public File createDBConnection() throws CustomFileException {
		// 1. Create a text file
		// 2. Print successful connection to the console.

		File myFile = new File("users.txt");
		try {
			if (myFile.createNewFile() == true) {
				System.out.println("File has been successfully create: " + myFile.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (CustomFileException e) {
			throw new CustomFileException("Something went wrong with the file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return myFile;
	}

	@Override
	public User addUser(User u) {
		// 1. Create new user
		// 2. Serialize our user
		// 3. Write binary data into our text file
		// 4. Print successful addition message
		// 5. Close the file

		// Create User
		// User tom = new User(1, "tom_thumb", "password", "Tom", "Thumb",
		// "tom.thumb@gmail.com");

		try {
			// Serialize user
			FileOutputStream output = new FileOutputStream(createDBConnection(), true);

			// Write binary data into our text file
			output.write(u.toString().getBytes());

			// Print successful message
			System.out.println("New user has been created!");

			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (CustomFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return u;
	}

	@Override
	public User editUser(User u) {

		return null;
	}

	@Override
	public User getUserById(int id) {
		String data = "";

		try {
			data = new String(Files.readAllBytes(Paths.get("users.txt")));
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteUserH(User u) {
		// TODO Auto-generated method stub

	}

}
