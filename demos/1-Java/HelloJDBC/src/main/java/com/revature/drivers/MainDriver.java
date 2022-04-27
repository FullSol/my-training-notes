package com.revature.drivers;

import java.time.LocalDate;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.models.Product;
import com.revature.services.ProductService;
import com.revature.services.ProductServiceImpl;

public class MainDriver {

	private static Logger logger = Logger.getLogger(MainDriver.class);
	private static ProductService productService = new ProductServiceImpl();
	
	public static void main(String[] args) {
		welcomeScreen();
	}
	
	public static void welcomeScreen()
	{
		logger.info("Starting application, loading welcome screen.");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to using JDBC Demo!");
		System.out.println("Select an option from below");
		System.out.println("[1] - Add new product");
		System.out.println("[2] - Get product by ID");
		System.out.println("[0] - Exit Application");
		System.out.print("\nSelection: ");
		
		int selection = input.nextInt();
		
		switch(selection) {
		case 1:
			Product target = new Product();
			// Get info from user
			System.out.print("Please provide a name for this new product");
			String name = input.next();
			
			System.out.print("Please provide a price for this new product");
			double price = input.nextDouble();
			
			System.out.print("Please provide a expiration date for this new product");
			String expDateString = input.next();
			
			LocalDate expDate = LocalDate.parse(expDateString);
			
			target.setId(0);
			target.setProductName(name);
			target.setProductPrice(price);
			target.setProductExpDate(expDate);
			
			productService.addNewProduct(target);
			
		case 2:
		case 0:
			System.out.println("Have 1 a great day!");
			System.exit(0);;
			break;
		default:
			System.out.println("Invalid option. Try again");
			welcomeScreen();
		}
		
		input.close();
	}
}
